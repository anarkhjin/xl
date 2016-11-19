package com.laomashi.majiong.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.laomashi.majiong.po.CommentBean;
import com.laomashi.majiong.po.SubBean;
import com.laomashi.majiong.po.TOPIC;
import com.laomashi.majiong.po.TbContent;
import com.laomashi.majiong.po.TbSection;
import com.laomashi.majiong.po.TbSubsection;
import com.laomashi.majiong.po.TbTopic;
import com.laomashi.majiong.po.TbUser;
import com.laomashi.majiong.service.IpcService;
import com.laomashi.majiong.service.uti.JsonResult;
import com.laomashi.majiong.service.uti.VerifyUtil;

@Controller
@RequestMapping("/pc")
public class PCController {

	
	@Autowired
	IpcService pcservice;
	
	@RequestMapping("/home.do")//首页，所有子模块的列表
	public String pcHome( ModelMap model) {
		List<SubBean> SubBeans= pcservice.selectAllSubs();
		model.put("sections",SubBeans);
		return "home";
	}
	
	@RequestMapping("/sections.do")//主板块下面的所有子模块的列表
	public String pcSubs(long sid, ModelMap model) {

		List<SubBean> subBeans=pcservice.selectSubsBySid(sid);
		String sname="";
		if(subBeans.size()>0){
			 sname =subBeans.get(0).getSname();
		}else{
			sname="";
		}
		model.put("subs",subBeans);
		model.put("subname",sname);
		return "sections";
	}
	
	@RequestMapping("/list.do")// 子模块的帖子列表
	public String pcList(long subid, ModelMap model) {

		List<TbTopic> tops=pcservice.selectAllTopicsBySubid(subid);
		
		model.put("topics",tops);
		
		return "list";
	}
	
	
	/**
	 * 测试session用的
	 * @param model
	 * @return
	 */
	@RequestMapping("/getVerify.do")
	public String getVerify(ModelMap model,HttpSession httpSession){
		
		String verify =VerifyUtil.getVerifyStr();
		
		httpSession.setAttribute("verify", verify);
		String message = new JsonResult(verify, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
	
	/**
	 * pc端异步登录
	 * @param tel
	 * @param password
	 * @param model
	 * @param httpSession
	 * @return
	 */

	@RequestMapping("/getuser.do")
public String getSessionUser(ModelMap model,HttpSession httpSession){
	
	TbUser     user= (TbUser) httpSession.getAttribute("user");
	  String message = new JsonResult(user, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
}
	
	@RequestMapping("/tellogin.do")
public String telLogin(String tel,String password, ModelMap model,HttpSession httpSession){
	
		TbUser user=pcservice.telLogin(tel,password);
		if(user!=null){
	       httpSession.setAttribute("user", user);
		}
	    String message = new JsonResult(user, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
}
	
	@RequestMapping("/pulishConment.do")
     public String pulishConment(long tid , String content, ModelMap model,HttpSession httpSession){
		TbUser user =(TbUser) httpSession.getAttribute("user");
		pcservice.saveConment(user.getUid(),tid,content);
		
	    String message = new JsonResult(1, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
   }	
	@RequestMapping("/conmentList.do")
    public String conmentList(long tid,ModelMap model){
		List<CommentBean> comments = pcservice.getConmentList(tid);
		
	    String message = new JsonResult(comments, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
  }	
	
	@RequestMapping("/detail.do")// 子模块的帖子列表
	public String pcDetal(long tid, ModelMap model) {

		TbTopic top=pcservice.selectTopicsDetai(tid);
		List<TbContent> contents=pcservice.selectContentsByTid(tid);
		
		TbSubsection sub=pcservice.selectSub(top.getSubid());
		TbSection sec=pcservice.selectSec(sub.getSid());
		
		TOPIC topic=new TOPIC();
		topic.setContents(contents);
		topic.setTopic(top);
		model.put("sec",sec);
		model.put("sub",sub);
		model.put("topic",topic);
		
		return "detail";
		
//		 String message = new JsonResult(topic, "所有子分类", 200).toJson();
//		 model.put("message", message);
//		
//		return "message";
	}
	
	@RequestMapping("/listSubs.do")// 查询所有子分类
	public String listSubs(ModelMap model) {

		List<TbSubsection> sub=pcservice.selectAllSubsetion();
		
         String message = new JsonResult(sub, "所有子分类", 200).toJson();
		 model.put("message", message);
		
		return "message";
	}
	
	@RequestMapping("/listTpoics.do")// 子模块的帖子列表
	public String listTpoics(long subid, ModelMap model) {

		  List<TbTopic> tops=pcservice.selectAllTopicsBySubid(subid);
		  String message = new JsonResult(tops, "所有子分类帖子", 200).toJson();
			model.put("message", message);
			return "message";
	}
}
