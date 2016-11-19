package com.anan.huotui.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anan.huotui.po.Category;
import com.anan.huotui.po.CategoryBean;
import com.anan.huotui.po.OrderGoods;
import com.anan.huotui.po.TbAddress;
import com.anan.huotui.po.TbCart;
import com.anan.huotui.po.TbGoods;
import com.anan.huotui.po.TbGoodsImg;
import com.anan.huotui.po.TbShop;
import com.anan.huotui.po.TbUser;
import com.anan.huotui.po.UserCartBean;
import com.anan.huotui.service.AdminService;
import com.anan.huotui.service.CartService;
import com.anan.huotui.service.PCService;
import com.anan.huotui.util.JsonResult;
import com.anan.huotui.util.VerifyUtil;


@Controller
@RequestMapping("/cart")
public class CartController {
	
	@Autowired 
	private CartService cartService;
	@Autowired 
	private PCService pcService;
	@RequestMapping("/joinCart.do")
	public String joinCart(Long uid,Long gid,int num,ModelMap model){
		
		TbCart cat=cartService.selectCartBy(uid,gid);
		if(cat==null){
			cartService.saveCartBy(uid,gid,num);
		}
		
		String message = new JsonResult("1", "加入购物车成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/selectCart.do")
	public String selectCartByUid(Long uid,ModelMap model){
		
		List<UserCartBean> userCarts=cartService.selectCartByUid(uid);
			
		String message = new JsonResult(userCarts, "加入购物车成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
	
	@RequestMapping("/submitOrder.do")
	public String comfirmOrder(String json,ModelMap model,HttpSession httpSession){
//		if(user!=null){
//		  }else{ //跳转到错误页面
//		  }
		
		
		TbUser     user= (TbUser) httpSession.getAttribute("user");
		List<TbAddress> adrs =pcService.getAddressListByUid(user.getUid());
		List<OrderGoods> goodsList=new ArrayList<OrderGoods>();
		
		String []goods=json.split("-");
		
		int sumPrice=0;
		int sumYunfei=0;
		
			for(int i =0;i<goods.length;i++){
				OrderGoods bean =new OrderGoods();
				  TbGoods tbgoods = pcService.getGoodsById(Long.parseLong(goods[i].split("_")[0]));
				
				  
				  bean.setAmount(Integer.parseInt(goods[i].split("_")[1]));
				  
				  sumPrice=sumPrice+tbgoods.getPrice()*(Integer.parseInt(goods[i].split("_")[1]));
				  sumYunfei=sumYunfei+tbgoods.getYunfei()*(Integer.parseInt(goods[i].split("_")[1]));
				  
				  bean.setGoods(tbgoods);
				 
				  goodsList.add(bean);
			}
		
			
		model.put("adrs", adrs);
		model.put("goodsList", goodsList);
		model.put("sumPrice", sumPrice);
		model.put("sumYunfei", sumYunfei);
		model.put("sum", (sumYunfei+sumPrice));
		
		
		return "order";
	}
	
}
