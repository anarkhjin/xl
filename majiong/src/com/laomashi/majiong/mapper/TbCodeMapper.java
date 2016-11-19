package com.laomashi.majiong.mapper;

import com.laomashi.majiong.po.TbCode;
import com.laomashi.majiong.po.TbCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCodeMapper {
    int countByExample(TbCodeExample example);

    int deleteByExample(TbCodeExample example);

    int deleteByPrimaryKey(Long codeid);

    int insert(TbCode record);

    int insertSelective(TbCode record);

    List<TbCode> selectByExample(TbCodeExample example);

    TbCode selectByPrimaryKey(Long codeid);

    int updateByExampleSelective(@Param("record") TbCode record, @Param("example") TbCodeExample example);

    int updateByExample(@Param("record") TbCode record, @Param("example") TbCodeExample example);

    int updateByPrimaryKeySelective(TbCode record);

    int updateByPrimaryKey(TbCode record);
}