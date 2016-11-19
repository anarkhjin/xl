package com.anan.huotui.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anan.huotui.po.Category;
import com.anan.huotui.po.CategoryBean;
import com.anan.huotui.po.TbAddress;
import com.anan.huotui.po.TbGoods;
import com.anan.huotui.po.TbGoodsImg;
import com.anan.huotui.po.TbShop;
import com.anan.huotui.po.TbUser;
import com.anan.huotui.service.AdminService;
import com.anan.huotui.service.PCService;
import com.anan.huotui.util.JsonResult;
import com.anan.huotui.util.VerifyUtil;


@Controller
@RequestMapping("/pc")
public class PcController {
	
	@Autowired 
	private AdminService adminService;
	@Autowired 
	private PCService pcService;
	
	/**
	 * 后台登录页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/index.do")
	public String index(ModelMap model) {
		List<CategoryBean> data=pcService.index();
		String message = new JsonResult(data, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
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
	
		@RequestMapping("/tellogin.do")
	public String telLogin(String tel,String password, ModelMap model,HttpSession httpSession){
		
			TbUser user=pcService.telLogin(tel,password);
			if(user!=null){
		       httpSession.setAttribute("user", user);
			}
		    String message = new JsonResult(user, "注册成功", 200).toJson();
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
	
		/**
		 * 根据分类  id 获取商品列表
		 * @param cateid
		 * @param model
		 * @param httpSession
		 * @return
		 */
		@RequestMapping("/goodslist.do")
		public String getGoodsList(Long cateid,ModelMap model,HttpSession httpSession){
			
		    List<TbGoods> goodslist=pcService.getGoodsByCateId(cateid);
		    List<Category> cates=pcService.getAllCate();
			model.put("goodslist", goodslist);
			model.put("cates", cates);
			return "show";
		}
		/**
		 * 根据商品 id 获取商品列表
		 * @param cateid
		 * @param model
		 * @param httpSession
		 * @return
		 */
		@RequestMapping("/detail.do")
		public String getGoodsById(Long gid,ModelMap model,HttpSession httpSession){
			
			TbGoods detail=pcService.getGoodsById(gid);
			TbShop shop=pcService.getShopByGid(detail.getSid());
			
			List<TbGoods> goodslist=pcService.getGoodsByCateId(detail.getCateId());
			List<TbGoodsImg> imgs=pcService.getImgByGid(detail.getGid());
				
			
	       model.put("goodslist", goodslist);
			model.put("detail", detail);
			model.put("imgs", imgs);
			model.put("img", imgs.get(0));
			model.put("shop", shop);
			
			return "detail";
		}
		
		/**
		 * 获取用户地址列表
		 * @param uid
		 * @param model
		 * @param httpSession
		 * @return
		 */
		@RequestMapping("/useradr.do")
		public String getAddressListByUid(Long uid,ModelMap model){
			
			List<TbAddress> adrs=pcService.getAddressListByUid(uid);
			String message = new JsonResult(adrs, "注册成功", 200).toJson();
			model.put("message", message);
			return "message";
		}
		/**
		 * 保存用户地址
		 * @param address
		 * @param model
		 * @param request
		 * @param response
		 * @return
		 */
		@RequestMapping("/saveUserAdr.do")
		public String saveUserAdrByUid(TbAddress address,ModelMap model, HttpServletRequest request, HttpServletResponse response){
			TbAddress adr=address;
		  			
			List<TbAddress> adrs=pcService.getAddressListByUid(adr.getUid());
			if(adrs==null||adrs.size()==0){
				adr.setDeflaut((short)1);
			}
			if(adr.getDeflaut()==1){
				for(TbAddress a:adrs){
					if(a.getDeflaut()==1){
						a.setDeflaut((short) 0);
						pcService.setArressDefault(a);
					}
				}
			}
			try {
				pcService.saveAddress(adr);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			
			String message = new JsonResult("1", "注册成功", 200).toJson();
			
			model.put("message", message);
			return "message";
		}
		/**
		 * 删除用户地址
		 * @param address
		 * @param model
		 * @param request
		 * @param response
		 * @return
		 */
		@RequestMapping("/deleteUserAdr.do")
		public String deleteUserAdrByUid(Long aid,ModelMap model, HttpServletRequest request, HttpServletResponse response){
			
			pcService.deleteAdrById(aid);
			
			String message = new JsonResult("1", "注册成功", 200).toJson();
			
			model.put("message", message);
			return "message";
		}
		
		
	/**
	 * 测试session用的
	 * @param model
	 * @return
	 */
	@RequestMapping("/keep.do")
	public String keepSession(ModelMap model,HttpSession httpSession){
		httpSession.setAttribute("user", "进哥哥好");
		String message = new JsonResult("设置session成功", "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
	
	/**
	 * 测试session用的
	 * 后台登录页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/get.do")
	public String getSession(ModelMap model,HttpSession httpSession){
		
		String name =(String) httpSession.getAttribute("user");
		String message = new JsonResult(name, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
}
