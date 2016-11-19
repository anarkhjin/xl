package com.laomashi.majiong.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laomashi.majiong.common.TopicLimitBean;
import com.laomashi.majiong.mapper.TbCodeMapper;
import com.laomashi.majiong.mapper.TbContentMapper;
import com.laomashi.majiong.mapper.TbReplyMapper;
import com.laomashi.majiong.mapper.TbSectionMapper;
import com.laomashi.majiong.mapper.TbSubsectionMapper;
import com.laomashi.majiong.mapper.TbTopicMapper;
import com.laomashi.majiong.mapper.TbUserMapper;
import com.laomashi.majiong.po.CommentBean;
import com.laomashi.majiong.po.SubBean;
import com.laomashi.majiong.po.TbCode;
import com.laomashi.majiong.po.TbContent;
import com.laomashi.majiong.po.TbContentExample;
import com.laomashi.majiong.po.TbReply;
import com.laomashi.majiong.po.TbReplyExample;
import com.laomashi.majiong.po.TbSection;
import com.laomashi.majiong.po.TbSubsection;
import com.laomashi.majiong.po.TbSubsectionExample;
import com.laomashi.majiong.po.TbTopic;
import com.laomashi.majiong.po.TbTopicExample;
import com.laomashi.majiong.po.TbTopicExample.Criteria;
import com.laomashi.majiong.po.TbUser;
import com.laomashi.majiong.po.TbUserExample;
import com.laomashi.majiong.service.IpcService;

@Service
public class PcService  implements IpcService{
	
	@Autowired
	TbTopicMapper topicMapper;
	
	@Autowired
	TbSectionMapper sectionMapper;
	
	@Autowired
	TbSubsectionMapper subSectionMapper;
	
	@Autowired
	TbContentMapper contentMapper;
	
	@Autowired
	TbUserMapper userMapper;
	@Autowired
	TbReplyMapper replyMapper;

	public List<SubBean> selectAllSubs() {
		// TODO Auto-generated method stub
		List<SubBean> subs=new ArrayList<SubBean>();
		
		List<TbSection> sections=sectionMapper.selectByExample(null);
		
		for(int i=0;i<sections.size();i++){
			 
			TbSection sec=	sections.get(i);
			
			TbSubsectionExample subexample =new TbSubsectionExample();
			com.laomashi.majiong.po.TbSubsectionExample.Criteria sub_criteria = subexample.createCriteria();
			sub_criteria.andSidEqualTo(sec.getSid());
			
			List<TbSubsection> tbSubsections=subSectionMapper.selectByExample(subexample);
			
			for(TbSubsection bean :tbSubsections){
				SubBean subBean=new SubBean();
				subBean.setSubsection(bean);
				subBean.setSid(sec.getSid());
				subBean.setSname(sec.getName());
				
				List<TbTopic> topics=topicMapper.selectLimit(bean.getSubid());
				subBean.setTopics(topics);
				subs.add(subBean);
			}
			
		 }
		 
		return subs;
	}

	public List<SubBean> selectSubsBySid(long sid) {
		// TODO Auto-generated method stub
		List<SubBean> subs=new ArrayList<SubBean>();
		
	   TbSection sec =	sectionMapper.selectByPrimaryKey(sid);
		
		TbSubsectionExample subexample =new TbSubsectionExample();
		com.laomashi.majiong.po.TbSubsectionExample.Criteria sub_criteria = subexample.createCriteria();
		sub_criteria.andSidEqualTo(sid);
		subSectionMapper.selectByExample(subexample);
		
		
		List<TbSubsection> tbSubsections=subSectionMapper.selectByExample(subexample);
		
		for(TbSubsection bean :tbSubsections){
			SubBean subBean=new SubBean();
			subBean.setSubsection(bean);
			subBean.setSid(sec.getSid());
			subBean.setSname(sec.getName());
			
			List<TbTopic> topics=topicMapper.selectLimit(bean.getSubid());
			subBean.setTopics(topics);
			subs.add(subBean);
		}
		
		return subs;
		
	}

	public List<TbTopic> selectAllTopicsBySubid(long subid) {
		// TODO Auto-generated method stub
		
		TbTopicExample example =new TbTopicExample();
		com.laomashi.majiong.po.TbTopicExample.Criteria cr = example.createCriteria();
		cr.andSubidEqualTo(subid);
		cr.andStatusEqualTo((byte)1);
	
		return topicMapper.selectByExample(example );
	}

	public TbTopic selectTopicsDetai(long tid) {
		// TODO Auto-generated method stub
		
		return topicMapper.selectByPrimaryKey(tid);
	}

	public List<TbContent> selectContentsByTid(long tid) {
		// TODO Auto-generated method stub
		
		return contentMapper.selectAll(tid);
	}

	public TbSubsection selectSub(Long subid) {
		// TODO Auto-generated method stub
		return subSectionMapper.selectByPrimaryKey(subid);
	}

	public TbSection selectSec(Long sid) {
		// TODO Auto-generated method stub
		return sectionMapper.selectByPrimaryKey(sid);
	}
	
	public void updateClick(long tid) throws Exception {
		// TODO Auto-generated method stub
		topicMapper.updateClick(tid);
	}

	public void updateLike(long tid) {
		// TODO Auto-generated method stub
		topicMapper.updateLike(tid);
	}

	public void updateUnLike(long tid) {
		// TODO Auto-generated method stub
		topicMapper.updateUnLike(tid);
	}

	public void insertSection(TbSection section) throws Exception {
		// TODO Auto-generated method stub
		sectionMapper.insert(section);
	}

	public void insertSubsection(TbSubsection subsection) throws Exception {
		// TODO Auto-generated method stub
		 Date d=new Date();
		subsection.setCreatetime(d);
		subsection.setUpdatetime(d);
		subSectionMapper.insert(subsection);
	}

	public TbTopic addTopic(TbTopic topic) throws Exception {
		// TODO Auto-generated method stub
		Date d=new Date();
//		SimpleDateFormat f=new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		topic.setClickNum(0);
		topic.setFellowNum(0);
		topic.setReplyNum(0);
		topic.setStepNum(0);
		
		topic.setSendtime(d);
		topic.setLastReplytime(d);
		topic.setUpdatetime(d);
		
		long tid= topicMapper.insert(topic);
	    System.out.println(tid);
	    
		TbTopicExample example =new TbTopicExample();
		Criteria cri = example.createCriteria();
		cri.andSendtimeEqualTo(d);
		List<TbTopic> t =topicMapper.selectByExample(example);
		if(t.size()>0){
			return t.get(0);
		}else{
			return null;
	}
   }

	public void insertContent(TbContent content) throws Exception {
		// TODO Auto-generated method stub
		Date d=new Date();
		content.setCreatetime(d);
		contentMapper.insert(content);
	}

	public void deleteContent(long cid) {
		// TODO Auto-generated method stub
		contentMapper.deleteByPrimaryKey(cid);
	}

	public void topicPublish(Long tid) throws Exception {
		// TODO Auto-generated method stub
		
		topicMapper.publishTopic(tid);
	}

	public void topicDown(Long tid) throws Exception {
		// TODO Auto-generated method stub
		topicMapper.publishDown(tid);
	}

	public List<TbSubsection> selectAllSubsetion() {
		// TODO Auto-generated method stub
		return subSectionMapper.selectByExample(null);
	}

	public TbUser telLogin(String tel, String password) {
		// TODO Auto-generated method stub
		
		TbUserExample example=new TbUserExample();
		
		 com.laomashi.majiong.po.TbUserExample.Criteria cri = example.createCriteria();
		cri.andTelephoneEqualTo(tel);
		cri.andPasswordEqualTo(password);	
		List<TbUser> list =userMapper.selectByExample(example);
		if(list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}

	public void saveConment(long uid, long tid, String content) {
		// TODO Auto-generated method stub
		
		TbReply record =new TbReply();
		Date d=new Date();
		record.setContent(content);
		record.setTid(tid);
		record.setUid(uid);
		record.setSendtime(d);
		replyMapper.insert(record );
	}

	public List<CommentBean> getConmentList(long tid) {
		// TODO Auto-generated method stub
		
		TbReplyExample example =new TbReplyExample();
		com.laomashi.majiong.po.TbReplyExample.Criteria cri = example.createCriteria();
		cri.andTidEqualTo(tid);
		
		List<TbReply> replys =replyMapper.selectByExample(example);
		
		List<CommentBean> comments=new ArrayList<CommentBean>();
		
			for(int i= 0;i<replys.size();i++){
			  TbUser user=	userMapper.selectByPrimaryKey(replys.get(i).getUid());
			  CommentBean bean = new CommentBean();
			  bean.setReply(replys.get(i));
			  bean.setUser(user);
			  comments.add(bean);
			}
		return comments;
	}

	
	
}
