package com.anan.huotui.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anan.huotui.mapper.TbCartMapper;
import com.anan.huotui.mapper.TbGoodsImgMapper;
import com.anan.huotui.mapper.UserCartMapper;
import com.anan.huotui.po.TbCart;
import com.anan.huotui.po.TbCartExample;
import com.anan.huotui.po.TbGoodsImg;
import com.anan.huotui.po.TbGoodsImgExample;
import com.anan.huotui.po.UserCartBean;
import com.anan.huotui.po.TbCartExample.Criteria;
import com.anan.huotui.service.CartService;

@Service
public  class CartServiceImpl implements CartService {

	@Autowired
	private TbCartMapper cartMapper;
	
	@Autowired
	private UserCartMapper userCartMapper;
	
	@Autowired
	private TbGoodsImgMapper goodsImgMapper;

	public TbCart selectCartBy(Long uid, Long gid) {
		// TODO Auto-generated method stub
		TbCartExample example= new TbCartExample();
		Criteria cri = example.createCriteria();
		
		cri.andUidEqualTo(uid);
		cri.andGidEqualTo(gid);
		List<TbCart>  carts=cartMapper.selectByExample(example);
		if(carts.size()>0){
			
			return carts.get(0);
		}else{
			return null;
			
		}
	}

	public void saveCartBy(Long uid, Long gid, int num) {
		// TODO Auto-generated method stub
		TbCart record =new TbCart();
		record.setCid(null);
		record.setGid(gid);
		record.setUid(uid);
		record.setNum((short)num);
		
		cartMapper.insert(record);
	}

	public List<UserCartBean> selectCartByUid(Long uid) {
		// TODO Auto-generated method stub
		List<UserCartBean> userCarts=userCartMapper.selectUserCart(uid);
		for(int i= 0;i<userCarts.size();i++){
			
			TbGoodsImgExample example=new TbGoodsImgExample();
			com.anan.huotui.po.TbGoodsImgExample.Criteria imgcri = example.createCriteria();
			imgcri.andGidEqualTo(userCarts.get(i).getGid());
			List<TbGoodsImg> imgs = goodsImgMapper.selectByExample(example);
			if(imgs.size()>0){
				userCarts.get(i).setGoodsImg(goodsImgMapper.selectByExample(example).get(0).getUrl());
			}
		}
		
		return userCarts;
	}
	
}