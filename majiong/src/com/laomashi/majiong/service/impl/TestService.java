package com.laomashi.majiong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laomashi.majiong.mapper.TbCodeMapper;
import com.laomashi.majiong.mapper.TbTopicMapper;
import com.laomashi.majiong.po.TbCode;
import com.laomashi.majiong.po.TbTopic;
import com.laomashi.majiong.po.TbTopicExample;
import com.laomashi.majiong.po.TbTopicExample.Criteria;

@Service
public class TestService {
	
	@Autowired
	TbTopicMapper codeMapper;
	public TbTopic test(){
		return codeMapper.selectByPrimaryKey(26l);
	}
	public List<TbTopic> list() {
		// TODO Auto-generated method stub
		TbTopicExample tbTopicExample=new TbTopicExample();
		Criteria c=tbTopicExample.createCriteria();
		c.andSubidEqualTo(2l);
		return codeMapper.selectByExample(tbTopicExample);
	}
}
