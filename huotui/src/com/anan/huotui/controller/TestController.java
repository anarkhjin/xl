package com.anan.huotui.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.anan.huotui.po.AnUp;
import com.anan.huotui.service.ITestService;
import com.anan.huotui.service.impl.TestServiceImpl;
import com.anan.huotui.util.JsonResult;


@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired 
	private ITestService testServiceImpl;
	
	@RequestMapping("/test.do")
	public String allSections(ModelMap model) {
		
		
		return "main";
		
	}
}
