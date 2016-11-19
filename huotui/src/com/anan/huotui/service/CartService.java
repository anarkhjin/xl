package com.anan.huotui.service;

import java.io.IOException;
import java.util.List;

import com.anan.huotui.po.TbCart;
import com.anan.huotui.po.UserCartBean;


public interface CartService {

	TbCart selectCartBy(Long uid, Long gid);

	void saveCartBy(Long uid, Long gid, int num);

	List<UserCartBean> selectCartByUid(Long uid);
	
}
