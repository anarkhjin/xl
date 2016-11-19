package com.laomashi.majiong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.laomashi.majiong.service.impl.TestService;
import com.laomashi.majiong.service.uti.JsonResult;

@Controller
public class TestController {

	
	@Autowired
	TestService testservice;
	
	@RequestMapping("/test.do")
	public String telReg(String telephone, String passwd, ModelMap model) {
		
		String message = new JsonResult(testservice.test(), "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}

	@RequestMapping("/list.do")
	public String list(ModelMap model) {
		
		String message = new JsonResult(testservice.list(), "注册成功", 200).toJson();
		model.put("message", message);
		return "message";
	}
}
