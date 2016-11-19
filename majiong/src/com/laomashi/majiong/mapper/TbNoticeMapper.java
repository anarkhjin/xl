package com.laomashi.majiong.mapper;

import com.laomashi.majiong.po.TbNotice;
import com.laomashi.majiong.po.TbNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbNoticeMapper {
    int countByExample(TbNoticeExample example);

    int deleteByExample(TbNoticeExample example);

    int deleteByPrimaryKey(Long nid);

    int insert(TbNotice record);

    int insertSelective(TbNotice record);

    List<TbNotice> selectByExample(TbNoticeExample example);

    TbNotice selectByPrimaryKey(Long nid);

    int updateByExampleSelective(@Param("record") TbNotice record, @Param("example") TbNoticeExample example);

    int updateByExample(@Param("record") TbNotice record, @Param("example") TbNoticeExample example);

    int updateByPrimaryKeySelective(TbNotice record);

    int updateByPrimaryKey(TbNotice record);
}