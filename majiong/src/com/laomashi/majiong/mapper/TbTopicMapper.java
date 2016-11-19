package com.laomashi.majiong.mapper;

import com.laomashi.majiong.common.TopicLimitBean;
import com.laomashi.majiong.po.TbTopic;
import com.laomashi.majiong.po.TbTopicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTopicMapper {
    int countByExample(TbTopicExample example);

    int deleteByExample(TbTopicExample example);

    int deleteByPrimaryKey(Long tid);

    int insert(TbTopic record);

    int insertSelective(TbTopic record);

    List<TbTopic> selectByExample(TbTopicExample example);

    TbTopic selectByPrimaryKey(Long tid);

    int updateByExampleSelective(@Param("record") TbTopic record, @Param("example") TbTopicExample example);

    int updateByExample(@Param("record") TbTopic record, @Param("example") TbTopicExample example);

    int updateByPrimaryKeySelective(TbTopic record);

    int updateByPrimaryKey(TbTopic record);
    List<TbTopic> selectLimit(long subid);
    List<TbTopic> selectBySubid(TopicLimitBean topicLimitBean);
    List<TbTopic> selectAllTopicOrderByTime(TopicLimitBean topicLimitBean);
    
    List<TbTopic> selectBySubidWithStatus(TopicLimitBean topicLimitBean);

	void updateClick(long tid);

	void updateLike(long tid);
	
	void updateUnLike(long tid);

	void publishTopic(long tid);

	void publishDown(Long tid);
	
}