package com.anan.huotui.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anan.huotui.mapper.AnUpMapper;
import com.anan.huotui.po.AnUp;
import com.anan.huotui.service.ITestService;

@Service
public class TestServiceImpl implements ITestService {

	@Autowired
	private AnUpMapper anUpMapper;
	public AnUp selectByPrimaryKey() {
		// TODO Auto-generated method stub
		return anUpMapper.selectByPrimaryKey(1l);
	}

}
