package com.anan.huotui.mapper;

import com.anan.huotui.po.TbUserMenu;
import com.anan.huotui.po.TbUserMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserMenuMapper {
    int countByExample(TbUserMenuExample example);

    int deleteByExample(TbUserMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbUserMenu record);

    int insertSelective(TbUserMenu record);

    List<TbUserMenu> selectByExample(TbUserMenuExample example);

    TbUserMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbUserMenu record, @Param("example") TbUserMenuExample example);

    int updateByExample(@Param("record") TbUserMenu record, @Param("example") TbUserMenuExample example);

    int updateByPrimaryKeySelective(TbUserMenu record);

    int updateByPrimaryKey(TbUserMenu record);
}