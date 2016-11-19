package com.anan.huotui.mapper;

import com.anan.huotui.po.TbOrder;
import com.anan.huotui.po.TbOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderMapper {
    int countByExample(TbOrderExample example);

    int deleteByExample(TbOrderExample example);

    int deleteByPrimaryKey(Long oid);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

    List<TbOrder> selectByExampleWithBLOBs(TbOrderExample example);

    List<TbOrder> selectByExample(TbOrderExample example);

    TbOrder selectByPrimaryKey(Long oid);

    int updateByExampleSelective(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    int updateByExample(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    int updateByPrimaryKeySelective(TbOrder record);

    int updateByPrimaryKeyWithBLOBs(TbOrder record);

    int updateByPrimaryKey(TbOrder record);
}