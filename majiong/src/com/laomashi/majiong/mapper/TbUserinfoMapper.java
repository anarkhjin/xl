package com.laomashi.majiong.mapper;

import com.laomashi.majiong.po.TbUserinfo;
import com.laomashi.majiong.po.TbUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserinfoMapper {
    int countByExample(TbUserinfoExample example);

    int deleteByExample(TbUserinfoExample example);

    int deleteByPrimaryKey(Long uinfoid);

    int insert(TbUserinfo record);

    int insertSelective(TbUserinfo record);

    List<TbUserinfo> selectByExample(TbUserinfoExample example);

    TbUserinfo selectByPrimaryKey(Long uinfoid);

    int updateByExampleSelective(@Param("record") TbUserinfo record, @Param("example") TbUserinfoExample example);

    int updateByExample(@Param("record") TbUserinfo record, @Param("example") TbUserinfoExample example);

    int updateByPrimaryKeySelective(TbUserinfo record);

    int updateByPrimaryKey(TbUserinfo record);
}