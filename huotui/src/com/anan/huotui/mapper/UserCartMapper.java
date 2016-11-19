package com.anan.huotui.mapper;

import java.util.List;

import com.anan.huotui.po.UserCartBean;


public interface UserCartMapper {
   List<UserCartBean> selectUserCart(long uid);
}