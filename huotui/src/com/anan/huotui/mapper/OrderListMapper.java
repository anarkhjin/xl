package com.anan.huotui.mapper;

import com.anan.huotui.po.OrderList;
import com.anan.huotui.po.OrderListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderListMapper {
    int countByExample(OrderListExample example);

    int deleteByExample(OrderListExample example);

    int deleteByPrimaryKey(Long olid);

    int insert(OrderList record);

    int insertSelective(OrderList record);

    List<OrderList> selectByExample(OrderListExample example);

    OrderList selectByPrimaryKey(Long olid);

    int updateByExampleSelective(@Param("record") OrderList record, @Param("example") OrderListExample example);

    int updateByExample(@Param("record") OrderList record, @Param("example") OrderListExample example);

    int updateByPrimaryKeySelective(OrderList record);

    int updateByPrimaryKey(OrderList record);
}