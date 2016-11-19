package com.anan.huotui.mapper;

import com.anan.huotui.po.TbCart;
import com.anan.huotui.po.TbCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCartMapper {
    int countByExample(TbCartExample example);

    int deleteByExample(TbCartExample example);

    int deleteByPrimaryKey(Long cid);

    int insert(TbCart record);

    int insertSelective(TbCart record);

    List<TbCart> selectByExample(TbCartExample example);

    TbCart selectByPrimaryKey(Long cid);

    int updateByExampleSelective(@Param("record") TbCart record, @Param("example") TbCartExample example);

    int updateByExample(@Param("record") TbCart record, @Param("example") TbCartExample example);

    int updateByPrimaryKeySelective(TbCart record);

    int updateByPrimaryKey(TbCart record);
}