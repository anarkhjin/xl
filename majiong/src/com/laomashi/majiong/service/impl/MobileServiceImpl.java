package com.laomashi.majiong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laomashi.majiong.common.TopicLimitBean;
import com.laomashi.majiong.mapper.TbSectionMapper;
import com.laomashi.majiong.mapper.TbSubsectionMapper;
import com.laomashi.majiong.mapper.TbTopicMapper;
import com.laomashi.majiong.mapper.TbUserMapper;
import com.laomashi.majiong.mapper.UserHisMapper;
import com.laomashi.majiong.po.SubBean;
import com.laomashi.majiong.po.TbContent;
import com.laomashi.majiong.po.TbSection;
import com.laomashi.majiong.po.TbSubsection;
import com.laomashi.majiong.po.TbSubsectionExample;
import com.laomashi.majiong.po.TbUser;
import com.laomashi.majiong.po.TbUserExample;
import com.laomashi.majiong.po.UserHis;
import com.laomashi.majiong.po.UserHisExample;
import com.laomashi.majiong.po.TbSubsectionExample.Criteria;
import com.laomashi.majiong.po.TbTopic;
import com.laomashi.majiong.service.IMobileService;

@Service
public class MobileServiceImpl implements IMobileService{

	@Autowired
	TbSectionMapper sectionMapper;
	
	@Autowired
	TbSubsectionMapper subSectionMapper;
	
	@Autowired
	TbTopicMapper tbTopicMapper;
	
	@Autowired
	TbUserMapper userMapper;
	
	@Autowired
	UserHisMapper uhMapper;
	

	public List<TbSection> selectAllSection() {
		// TODO Auto-generated method stub
		return sectionMapper.selectByExample(null);
	}

	public List<TbSubsection> selectAllSecsBySid(long sid) {
		// TODO Auto-generated method stub
		
		TbSubsectionExample examle =new TbSubsectionExample();
		Criteria cri = examle.createCriteria();
		cri.andSidEqualTo(sid);
		
		return  subSectionMapper.selectByExample(examle );
	}

	public List<TbTopic> selectTopicsBySubid(long subid, int increase) {
		// TODO Auto-generated method stub
		
		long  start=increase*10;
		long  end=start+10;
		TopicLimitBean topicLimitBean =new TopicLimitBean();
		topicLimitBean.setSubid(subid);
		topicLimitBean.setStart(start);
		topicLimitBean.setEnd(end);
		
		return tbTopicMapper.selectBySubid(topicLimitBean);
	}

	public List<TbTopic> selectBySubidWithStatus(long subid, int increase) {
		// TODO Auto-generated method stub
		
		long  start=increase*10;
		long  end=start+10;
		TopicLimitBean topicLimitBean =new TopicLimitBean();
		topicLimitBean.setSubid(subid);
		topicLimitBean.setStart(start);
		topicLimitBean.setEnd(end);
		
		return tbTopicMapper.selectBySubidWithStatus(topicLimitBean);
	}

	public TbTopic getTopic(long tid) {
		// TODO Auto-generated method stub
		return tbTopicMapper.selectByPrimaryKey(tid);
	}

	public TbSection getSecdetail(long sid) {
		// TODO Auto-generated method stub
		return sectionMapper.selectByPrimaryKey(sid);
	}

	public TbUser loginByQQ(String openid, String profileImageUrl) {
		// TODO Auto-generated method stub
		
		TbUserExample example =new TbUserExample();
		com.laomashi.majiong.po.TbUserExample.Criteria cri = example.createCriteria();
		cri.andOpenidEqualTo(openid);
		List<TbUser>	users=userMapper.selectByExample(example );
	if(users.size()>0){
		
		return users.get(0);
	}else{
		return null;
	}
}

	public void insertUser(TbUser userBean) {
		// TODO Auto-generated method stub
		userMapper.insert(userBean);
	}

	public TbUser selectByUUId(String uuid) {
		// TODO Auto-generated method stub
		TbUserExample example =new TbUserExample();
		com.laomashi.majiong.po.TbUserExample.Criteria cri = example.createCriteria();
		cri.andUuidEqualTo(uuid);
		List<TbUser>	users=userMapper.selectByExample(example );
		if(users.size()>0){
			
			return users.get(0);
		}else{
			return null;
		}
	}

	public TbUser loginByTel(String tel, String pwd) {
		// TODO Auto-generated method stub
		TbUserExample example =new TbUserExample();
		com.laomashi.majiong.po.TbUserExample.Criteria cri = example.createCriteria();
		cri.andTelephoneEqualTo(tel);
		cri.andPasswordEqualTo(pwd);
		
		List<TbUser>	users=userMapper.selectByExample(example );
		if(users.size()>0){
			
			return users.get(0);
		}else{
			return null;
		}
	}

	public UserHis selectUHByDay(String day,Long uid){
		// TODO Auto-generated method stub
		
		
		UserHisExample example=new UserHisExample();
		  com.laomashi.majiong.po.UserHisExample.Criteria cri = example.createCriteria();
		  cri.andDayEqualTo(day);
		  cri.andUidEqualTo(uid);
		List<UserHis>	uhs=uhMapper.selectByExample(example );
		if(uhs.size()>0){
			
			return uhs.get(0);
		}else{
			return null;
		}
	}

	public void insertUH(UserHis userH) {
		// TODO Auto-generated method stub
		uhMapper.insert(userH);
	}

	public void updateUH(UserHis userH) {
		// TODO Auto-generated method stub
		uhMapper.updateByPrimaryKey(userH);
	}

	public TbUser selectByTel(String tel) {
		// TODO Auto-generated method stub
		TbUserExample example =new TbUserExample();
		com.laomashi.majiong.po.TbUserExample.Criteria cri = example.createCriteria();
		cri.andTelephoneEqualTo(tel);
		
		List<TbUser>	users=userMapper.selectByExample(example );
		if(users.size()>0){
			
			return users.get(0);
		}else{
			return null;
		}
	}

	public List<TbTopic> listAllTopics(int increase) {
		// TODO Auto-generated method stub
		
		long  start=increase*10;
		long  end=start+10;
		TopicLimitBean topicLimitBean =new TopicLimitBean();
		topicLimitBean.setStart(start);
		topicLimitBean.setEnd(end);
		
		return tbTopicMapper.selectAllTopicOrderByTime(topicLimitBean);
	}
}
