package com.laomashi.majiong.mapper;

import com.laomashi.majiong.po.TbSubsection;
import com.laomashi.majiong.po.TbSubsectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSubsectionMapper {
    int countByExample(TbSubsectionExample example);

    int deleteByExample(TbSubsectionExample example);

    int deleteByPrimaryKey(Long subid);

    int insert(TbSubsection record);

    int insertSelective(TbSubsection record);

    List<TbSubsection> selectByExample(TbSubsectionExample example);

    TbSubsection selectByPrimaryKey(Long subid);

    int updateByExampleSelective(@Param("record") TbSubsection record, @Param("example") TbSubsectionExample example);

    int updateByExample(@Param("record") TbSubsection record, @Param("example") TbSubsectionExample example);

    int updateByPrimaryKeySelective(TbSubsection record);

    int updateByPrimaryKey(TbSubsection record);
}