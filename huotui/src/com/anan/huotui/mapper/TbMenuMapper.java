package com.anan.huotui.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.anan.huotui.po.TbMenu;
import com.anan.huotui.po.TbMenuExample;

public interface TbMenuMapper {
    int countByExample(TbMenuExample example);

    int deleteByExample(TbMenuExample example);

    int deleteByPrimaryKey(Long mid);

    int insert(TbMenu record);

    int insertSelective(TbMenu record);

    List<TbMenu> selectByExample(TbMenuExample example);

    TbMenu selectByPrimaryKey(Long mid);

    int updateByExampleSelective(@Param("record") TbMenu record, @Param("example") TbMenuExample example);

    int updateByExample(@Param("record") TbMenu record, @Param("example") TbMenuExample example);

    int updateByPrimaryKeySelective(TbMenu record);

    int updateByPrimaryKey(TbMenu record);
}