package com.laomashi.majiong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.laomashi.majiong.common.AppBean;
import com.laomashi.majiong.service.uti.JsonResult;

@Controller
@RequestMapping("/app")
public class AppController {

	@RequestMapping("/update.do")//登录
	public String appUpdate(int type, ModelMap model) {
		AppBean appBean=new AppBean(); 
		
		if(type == 0){//安卓
			appBean.setVersion(4);
			appBean.setVersionCode("0.0");
			appBean.setUrl("http://laomashi.com/app/paishen.apk");
			appBean.setContent("解决自动和统计相关问题");
		}else{//苹果
			
		   }
		
		String message = new JsonResult(appBean, "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
}
