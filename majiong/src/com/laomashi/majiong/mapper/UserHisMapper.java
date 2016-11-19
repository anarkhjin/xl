package com.laomashi.majiong.mapper;

import com.laomashi.majiong.po.UserHis;
import com.laomashi.majiong.po.UserHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserHisMapper {
    int countByExample(UserHisExample example);

    int deleteByExample(UserHisExample example);

    int deleteByPrimaryKey(Long hisid);

    int insert(UserHis record);

    int insertSelective(UserHis record);

    List<UserHis> selectByExample(UserHisExample example);

    UserHis selectByPrimaryKey(Long hisid);

    int updateByExampleSelective(@Param("record") UserHis record, @Param("example") UserHisExample example);

    int updateByExample(@Param("record") UserHis record, @Param("example") UserHisExample example);

    int updateByPrimaryKeySelective(UserHis record);

    int updateByPrimaryKey(UserHis record);
}