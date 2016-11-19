package com.laomashi.majiong.mapper;

import com.laomashi.majiong.po.TbSection;
import com.laomashi.majiong.po.TbSectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSectionMapper {
    int countByExample(TbSectionExample example);

    int deleteByExample(TbSectionExample example);

    int deleteByPrimaryKey(Long sid);

    int insert(TbSection record);

    int insertSelective(TbSection record);

    List<TbSection> selectByExample(TbSectionExample example);

    TbSection selectByPrimaryKey(Long sid);

    int updateByExampleSelective(@Param("record") TbSection record, @Param("example") TbSectionExample example);

    int updateByExample(@Param("record") TbSection record, @Param("example") TbSectionExample example);

    int updateByPrimaryKeySelective(TbSection record);

    int updateByPrimaryKey(TbSection record);
}