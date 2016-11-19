package com.laomashi.majiong.service;

import java.util.List;

import com.laomashi.majiong.po.SubBean;
import com.laomashi.majiong.po.TbContent;
import com.laomashi.majiong.po.TbSection;
import com.laomashi.majiong.po.TbSubsection;
import com.laomashi.majiong.po.TbTopic;
import com.laomashi.majiong.po.TbUser;
import com.laomashi.majiong.po.UserHis;

public interface IMobileService {

List<TbSection> selectAllSection();
List<TbSubsection> selectAllSecsBySid(long sid);
List<TbTopic> selectTopicsBySubid(long subid, int increase);
TbTopic getTopic(long tid);
TbSection getSecdetail(long sid);
List<TbTopic> selectBySubidWithStatus(long subid, int increase);
TbUser loginByQQ(String openid, String profileImageUrl);
void insertUser(TbUser userBean);
TbUser selectByUUId(String string);
TbUser loginByTel(String tel, String pwd);
UserHis selectUHByDay(String day,Long uid);
void insertUH(UserHis userH);
void updateUH(UserHis userH);
TbUser selectByTel(String tel);
List<TbTopic> listAllTopics(int increase);
	
}
