package com.laomashi.majiong.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.laomashi.majiong.po.SecBean;
import com.laomashi.majiong.po.TbContent;
import com.laomashi.majiong.po.TbSection;
import com.laomashi.majiong.po.TbSubsection;
import com.laomashi.majiong.po.TbTopic;
import com.laomashi.majiong.po.TbUser;
import com.laomashi.majiong.po.TopicDetail;
import com.laomashi.majiong.po.UserHis;
import com.laomashi.majiong.service.IMobileService;
import com.laomashi.majiong.service.IpcService;
import com.laomashi.majiong.service.uti.JsonResult;

@Controller
@RequestMapping("/m")//移动端接口处理
public class MobileController {
    
	@Autowired
	IMobileService mservice;
	@Autowired
	IpcService pcservice;
	
	@RequestMapping("/sections.do")// 所有主模块的列表
	public String listSections(ModelMap model) {
	
		String message = new JsonResult(mservice.selectAllSection(), "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/subsections.do")// 获取主板块下模块的列表
	public String listSecs(long sid,ModelMap model) {
	    String message = new JsonResult(mservice.selectAllSecsBySid(sid), "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
	@RequestMapping("/secdetail.do")// 获取主板块下模块的列表
	public String listSecDetail(long sid,ModelMap model) {
		
		TbSection sec=	mservice.getSecdetail(sid);
		List<TbSubsection> subs=	mservice.selectAllSecsBySid(sid);
		SecBean secBean=new SecBean();
		secBean.setSec(sec);
		secBean.setSubs(subs);
		String message = new JsonResult(secBean, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/topics.do")// 获取子块下topic的列表，分页
	public String listTopics(long subid,int increase,ModelMap model) {
		
		List<TbTopic> topics=mservice.selectBySubidWithStatus(subid,increase);
		List<TopicDetail> topicDetails=new ArrayList<TopicDetail>();
		for(int i=0;i<topics.size();i++){
			TopicDetail bean=new TopicDetail();
			bean.setTopic(topics.get(i));
			bean.setContents(pcservice.selectContentsByTid(topics.get(i).getTid()));
			topicDetails.add(bean);
		}
		String message = new JsonResult(topicDetails, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/topicsBySubid.do")// 获取子块下topic的列表，分页
	public String topicsBySubid(long subid,int increase,ModelMap model) {
		
		List<TbTopic> topics=mservice.selectTopicsBySubid(subid,increase);
		String message = new JsonResult(topics, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
	@RequestMapping("/content.do")// 获取topic的详情
	public String content(long tid,ModelMap model) {
		
		List<TbContent> content=pcservice.selectContentsByTid(tid);
		String message = new JsonResult(content, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/add_click.do")// 获取topic的详情
	public String addClick(long tid,ModelMap model) {
		
		String message="";
		try {
			pcservice.updateClick(tid);
			message= new JsonResult(1, "注册成功", 200).toJson();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message= new JsonResult(0, "注册成功", 200).toJson();
		}
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/add_like.do")// 获取topic的详情
	public String addLike(long tid,ModelMap model) {
		
		String message="";
		try {
			pcservice.updateLike(tid);
			message= new JsonResult(1, "注册成功", 200).toJson();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message= new JsonResult(0, "注册成功", 200).toJson();
		}
		model.put("message", message);
		return "message";
	}
	@RequestMapping("/add_unlike.do")// 获取topic的详情
	public String addUnLike(long tid,ModelMap model) {
		
		String message="";
		try {
			pcservice.updateUnLike(tid);
			message= new JsonResult(1, "注册成功", 200).toJson();
		 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message= new JsonResult(0, "注册成功", 200).toJson();
		 }
		
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/addsection.do")//  增加主板块
	public String addSection(TbSection section,ModelMap model) {
		String message="";
       Date d=new Date();
       section.setCreatetime(d);
       section.setUpdatetime(d);
		try {
			pcservice.insertSection(section);
			message =new JsonResult(1, "增加主板块成功", 200).toJson();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message =new JsonResult(0, "增加主板块成功", 200).toJson();
		}
		
		model.put("message", message);
		return "message";
	}
	@RequestMapping("/addsubsection.do")//  增加子板块
	public String addSubsection(TbSubsection subsection,ModelMap model) {
		String message="";
		
	       Date d=new Date();
	       subsection.setCreatetime(d);
	       subsection.setUpdatetime(d);
		try {
			pcservice.insertSubsection(subsection);
			message =new JsonResult(1, "增加子板块成功", 200).toJson();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message =new JsonResult(0, "增加子板块失败", 200).toJson();
		}
		
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/addtopic.do")//  增加主题
	public String addTopic(TbTopic topic,ModelMap model) {
		TbTopic bean=null;
		
		try {
			bean = pcservice.addTopic(topic);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String message =new JsonResult(bean, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/addcontent.do")//  增加内容
	public String addContent(TbContent content,ModelMap model) {
		String message ="";
		try {
			 pcservice.insertContent(content);
			 message =new JsonResult(1, "注册成功", 200).toJson();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message =new JsonResult(0, "注册成功", 200).toJson();
		}
		model.put("message", message);
		return "message";
	}
	@RequestMapping("/deletecontent.do")// 删除内容
	public String deleteContent(long cid,ModelMap model) {
		String message ="";
		try {
			pcservice.deleteContent(cid);
			message =new JsonResult(1, "注册成功", 200).toJson();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message =new JsonResult(0, "注册成功", 200).toJson();
		}
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/topicpublish.do")// 发布主题
	public String topicPublish(Long tid,ModelMap model) {
		String message ="";
		try {
			pcservice.topicPublish(tid);
			message =new JsonResult(1, "注册成功", 200).toJson();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message =new JsonResult(0, "注册成功", 200).toJson();
		}
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/topicdown.do")// 下家主题
	public String topicDown(Long tid,ModelMap model) {
		String message ="";
		try {
			pcservice.topicDown(tid);
			message =new JsonResult(1, "注册成功", 200).toJson();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message =new JsonResult(0, "注册成功", 200).toJson();
		}
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/topic_on.do")// 查询已发布所有信息
	public String topic_on(Long subid,int increase ,ModelMap model) {
		
	List<TbTopic> topics=	mservice.selectTopicsBySubid(subid,increase);
	
		String message =new JsonResult(topics, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/gettopic.do")// 获取子块下topic的列表，分页
	public String getTopic(long tid,ModelMap model) {
		
		 TbTopic  t=mservice.getTopic(tid);
		TopicDetail topicDetail=new TopicDetail();
		topicDetail.setTopic(t);
		topicDetail.setContents(pcservice.selectContentsByTid(tid));
		String message = new JsonResult(topicDetail, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}

	
	@RequestMapping("/qq_auth.do")//qq第三方登录
	public String loginByQQ(String openid,String profile_image_url,ModelMap model) {
		
		TbUser userBean=mservice.loginByQQ( openid,  profile_image_url);
		UUID uuid=UUID.randomUUID();
		
		if(userBean==null){
			userBean=new TbUser();
			userBean.setUuid(uuid.toString());
			userBean.setLogo(profile_image_url);
			userBean.setOpenid(openid);
			userBean.setState(0);
			userBean.setClickhis(0l);
			userBean.setClicknow(0l);
			
			mservice.insertUser(userBean);
			
			userBean=mservice.selectByUUId(uuid.toString());
		}
		
		String message="";
		message = new JsonResult(userBean, "返回值成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/tel_login.do")//手机号码登录
	public String loginByTel(String tel,String pwd,ModelMap model) {
		
		TbUser userBean=mservice.loginByTel( tel,  pwd);
		String message="";
		if(userBean==null){
			message = new JsonResult(userBean, "无该用户", 201).toJson();
		}else{
			message = new JsonResult(userBean, "返回用户用户", 200).toJson();
		}
		
		model.put("message", message);
		return "message";
	}
	
	/**
	 * @param uid 用户id
	 * @param type 上传数据的类型1 点击；0 展现
	 * @param model
	 * @return
	 */
	@RequestMapping("/loadIDsData.do")//上传数据
	public String updateData(long uid,int type,ModelMap model) { 
		
		 Date d=new Date();
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		 String day=format.format(d);
	      UserHis userH=mservice.selectUHByDay(day,uid);
		
	    if(userH==null){
	    	userH=new UserHis();
	    	userH.setDay(day);
	    	userH.setUid(uid);
	    	userH.setDianji(0);
	    	userH.setZhanxian(0);
	    	 userH.setCreattime(new Date());
	    	if(type==1){
	    		userH.setDianji(userH.getDianji()+1);
	    	}else{
	    		userH.setZhanxian(userH.getZhanxian()+1);  
	    	}
	      	mservice.insertUH(userH);
	    } else{
	    	
	    	if(type==1){
	    		userH.setDianji(userH.getDianji()+1);
	    	}else{
	    		userH.setZhanxian(userH.getZhanxian()+1);  
	    	}
	    	mservice.updateUH(userH);
	    }  
	       
	    String message = new JsonResult("", "返回用户用户", 200).toJson();
		model.put("message", message);
		return "message";
	}
	
	
	@RequestMapping("/mobileReg.do")//手机号码注册
	public String mobileRegister(String tel,String pwd,ModelMap model) {
		//有个小问题 注册过之后的怎么办
		TbUser userBean =mservice.selectByTel(tel);
		String message;
		if(userBean==null){
			
			 userBean=new TbUser();
			
			UUID uuid=UUID.randomUUID();
			userBean.setClickhis(100l);
			userBean.setPassword(pwd);
			userBean.setTelephone(tel);
			userBean.setUuid(uuid.toString());
			userBean.setState(0);
			userBean.setUsername(tel);
			userBean.setQq("");
			userBean.setLogo("");
			userBean.setZhifubao("");
			userBean.setOpenid("");
			userBean.setClicknow(0l);
			
			mservice.insertUser(userBean);
			
			userBean=mservice.selectByUUId(uuid.toString());
			message = new JsonResult(userBean, "返回用户用户", 200).toJson();
		
		}else{
			
			 message = new JsonResult(null, "用户已注册", 201).toJson();
		}
		 
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/getIDsData.do")//上传数据
	public String getData(long uid,ModelMap model) { 
		
		 Date d=new Date();
		 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		 String day=format.format(d);
	     UserHis userH=mservice.selectUHByDay(day,uid);
		
	    if(userH==null){
	    	userH=new UserHis();
	    	userH.setDay(day);
	    	userH.setUid(uid);
	    	userH.setDianji(0);
	    	userH.setZhanxian(0);
	        userH.setCreattime(new Date());
	      	mservice.insertUH(userH);
	    }  
	       
	    String message = new JsonResult(userH, "返回用户今日广告数据", 200).toJson();
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/Alltopics.do")// 获取子块下topic的列表，分页
	public String listAllTopics(int increase,ModelMap model) {
		
		List<TbTopic> topics=mservice.listAllTopics(increase);

		String message = new JsonResult(topics, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
}
