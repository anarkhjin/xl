package com.anan.huotui.service;

import java.util.List;

import com.anan.huotui.po.Category;
import com.anan.huotui.po.TbGoods;
import com.anan.huotui.po.TbGoodsImg;
import com.anan.huotui.po.TbMenu;
import com.anan.huotui.po.TbShop;
import com.anan.huotui.po.TbUser;

public interface AdminService {
   public TbUser login(String username,String password);

public List<TbMenu> getMenu(Long uid);

public TbUser adminLogin(String tel, String password);

public TbShop adminLogin(Long uid);

public List<Category> cate();

public List<TbGoods> queryGoods(int cateId, int state);

public void saveGoods(TbGoods goods);

public TbGoods selectGoodsByUUID(String uuid);

public void updateGoods(TbGoods goods);

public TbGoods selectGoodsByGid(Long gid);

public void insertImg(Long gid, String fileUrl);

public List<TbGoodsImg> getGoodsImgsByGid(Long gid);

public void deleteGoodsImgsByImgId(Long imgId);
}
