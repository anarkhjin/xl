package com.anan.huotui.service;

import java.io.IOException;
import java.util.List;

import com.anan.huotui.po.Category;
import com.anan.huotui.po.CategoryBean;
import com.anan.huotui.po.TbAddress;
import com.anan.huotui.po.TbGoods;
import com.anan.huotui.po.TbGoodsImg;
import com.anan.huotui.po.TbMenu;
import com.anan.huotui.po.TbShop;
import com.anan.huotui.po.TbUser;

public interface PCService {

	List<CategoryBean> index();

	TbUser telLogin(String tel, String password);

	List<TbGoods> getGoodsByCateId(Long cateid);

	TbGoods getGoodsById(Long gid);

	List<TbGoodsImg> getImgByGid(Long gid);

	TbShop getShopByGid(Long gid);

	List<Category> getAllCate();

	List<TbAddress> getAddressListByUid(Long uid);

	void saveAddress(TbAddress adr) throws IOException ;

	void setArressDefault(TbAddress a);

	TbAddress getAddressById(Long aid);

	void deleteAdrById(Long aid);

}
