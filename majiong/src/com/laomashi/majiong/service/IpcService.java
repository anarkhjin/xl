package com.laomashi.majiong.service;

import java.util.List;

import com.laomashi.majiong.po.CommentBean;
import com.laomashi.majiong.po.SubBean;
import com.laomashi.majiong.po.TbContent;
import com.laomashi.majiong.po.TbSection;
import com.laomashi.majiong.po.TbSubsection;
import com.laomashi.majiong.po.TbTopic;
import com.laomashi.majiong.po.TbUser;

public interface IpcService {

	List<SubBean> selectAllSubs();
	List<SubBean>  selectSubsBySid(long sid);
	List<TbTopic> selectAllTopicsBySubid(long subid);
	TbTopic selectTopicsDetai(long tid);
	List<TbContent> selectContentsByTid(long tid);
	TbSubsection selectSub(Long subid);
	TbSection selectSec(Long sid);
	void updateClick(long tid) throws Exception;
	void updateLike(long tid);
	void updateUnLike(long tid);
	void insertSection(TbSection section) throws Exception;
	void insertSubsection(TbSubsection subsection) throws Exception;
	TbTopic addTopic(TbTopic topic) throws Exception;
	void insertContent(TbContent content) throws Exception;
	void deleteContent(long cid) throws Exception;
	void topicPublish(Long tid) throws Exception;
	void topicDown(Long tid) throws Exception;
	List<TbSubsection> selectAllSubsetion();
	TbUser telLogin(String tel, String password);
	void saveConment(long uid, long tid, String content);
	List<CommentBean> getConmentList(long tid);
}
