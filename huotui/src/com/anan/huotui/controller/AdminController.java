package com.anan.huotui.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.oreilly.servlet.MultipartRequest;   
import com.anan.huotui.po.Category;
import com.anan.huotui.po.TbGoods;
import com.anan.huotui.po.TbGoodsImg;
import com.anan.huotui.po.TbMenu;
import com.anan.huotui.po.TbShop;
import com.anan.huotui.po.TbUser;
import com.anan.huotui.service.AdminService;
import com.anan.huotui.util.JsonResult;


@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired 
	private AdminService adminService;

	/**
	 * 后台登录页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/login.do")
	public String adminLogin(String tel,String password ,ModelMap model,HttpSession httpSession){
		TbUser user=adminService.adminLogin(tel,password);
		if(user!=null){
			TbShop shop=adminService.adminLogin(user.getShopid());	
			
			if(shop!=null){
				httpSession.setAttribute("user", user);
				httpSession.setAttribute("shop", shop);
				
				String message = new JsonResult(1, "注册成功", 200).toJson();
				model.put("message", message);
				return "message";
			
				
			}else{
				String message = new JsonResult(null, "注册成功", 200).toJson();
				model.put("message", message);
				return "message";
				
			}
			
			
		}else{
			
			String message = new JsonResult(null, "注册成功", 200).toJson();
			model.put("message", message);
			return "message";
		}
     }
	
	/**
	 * 后台获取user
	 * @param model
	 * @return
	 */
	@RequestMapping("/getAUser.do")
	public String getAdminUser(ModelMap model,HttpSession httpSession){
	      TbUser	user =(TbUser) httpSession.getAttribute("user");
			String message = new JsonResult(user, "注册成功", 200).toJson();
			model.put("message", message);
			return "message";
     }
	
	/**
	 * 后台获取shop
	 * @param model
	 * @return
	 */
	@RequestMapping("/getAShop.do")
	public String getAdminShop(ModelMap model,HttpSession httpSession){
	       TbShop	shop =(TbShop) httpSession.getAttribute("shop");
			String message = new JsonResult(shop, "注册成功", 200).toJson();
			model.put("message", message);
			return "message";
     }
	
	@RequestMapping("/cate.do")
	public String cate(ModelMap model) {
    
		List<Category>  cat=adminService.cate();
		String message = new JsonResult(cat, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
     
	}
	/**
	 * @param cateId 分类id
	 * @param state  出售状态
	 * @param model
	 * @return
	 */
	@RequestMapping("/queryGoods.do")
	public String queryGoods(int cateId,int state,ModelMap model) {
    
		List<TbGoods>  cat=adminService.queryGoods(cateId,state);
		String message = new JsonResult(cat, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
     
	}
	/**
	 * @param cateId 分类id
	 * @param state  出售状态
	 * @param model
	 * @return
	 */
	@RequestMapping("/saveGoods.do")
	public String saveGoods(TbGoods goods,ModelMap model,HttpSession httpSession){
		String uuid=UUID.randomUUID().toString();
		goods.setUuid(uuid);
		goods.setState((short)0);
		TbUser u =	(TbUser) httpSession.getAttribute("user");
		goods.setSid(u.getShopid());
	
		adminService.saveGoods(goods);
		TbGoods g =adminService.selectGoodsByUUID(uuid);
		String message = new JsonResult(g, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
		
	}
	/**
	 * @param cateId 分类id
	 * @param state  出售状态
	 * @param model
	 * @return
	 */
	@RequestMapping("/updateGoods.do")
	public String updateGoods(TbGoods goods,ModelMap model,HttpSession httpSession){
		
		
		adminService.updateGoods(goods);
		TbGoods g =adminService.selectGoodsByGid(goods.getGid());
		String message = new JsonResult(g, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
		
	}
	
	@RequestMapping("/img.do")
	public String uploadGoodsImg(Long gid,MultipartFile  myfile,ModelMap model,HttpServletRequest request) throws IOException{

		         request.setCharacterEncoding("UTF-8");
				 String realPath = request.getSession().getServletContext().getRealPath("/");
				 
				
				 
				 File f=new File(realPath);
				if(!f.exists()){
					f.mkdir();
				}
				 String fstr=myfile.getOriginalFilename();
			     String prefix=fstr.substring(fstr.lastIndexOf(".")+1);
			     
			    
			     
				 String finalFileName=getFileNameRandom()+"."+prefix;
				 String imgUrl= "upload"+File.separator+finalFileName;
				 String fileUrl=realPath+imgUrl;
			
				 File dest=new File(fileUrl);
				 myfile.transferTo(dest);
				 
				 
				 adminService.insertImg(gid,imgUrl);
                 System.out.println(fileUrl);
                 
					
		String message = new JsonResult(fileUrl, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}

	
	@RequestMapping("/goodsImgs.do")
	public String getGoodsImgsByGid(Long gid,ModelMap model,HttpServletRequest request) throws IOException{
		List<TbGoodsImg> imgs =adminService.getGoodsImgsByGid(gid);
		        
		String message = new JsonResult(imgs, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
	@RequestMapping("/deletegoodsImgs.do")
	public String deleteGoodsImgsByImgId(Long imgId,ModelMap model,HttpServletRequest request) throws IOException{
		 adminService.deleteGoodsImgsByImgId(imgId);
		
		String message = new JsonResult(1, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
	
	private String getFileNameRandom() {
		// TODO Auto-generated method stub
		
		Date d=new Date();
		char[]  cs=new char[]{'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m','Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M','1','2','3','4','5','6','7','8','9','0'};
		return d.getTime()+""+cs[(int)(Math.random()*61)]+cs[(int)(Math.random()*61)];
	}

}