package com.anan.huotui.service.impl;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anan.huotui.mapper.AnUpMapper;
import com.anan.huotui.mapper.CategoryMapper;
import com.anan.huotui.mapper.TbAddressMapper;
import com.anan.huotui.mapper.TbGoodsImgMapper;
import com.anan.huotui.mapper.TbGoodsMapper;
import com.anan.huotui.mapper.TbMenuMapper;
import com.anan.huotui.mapper.TbShopMapper;
import com.anan.huotui.mapper.TbUserMapper;
import com.anan.huotui.mapper.TbUserMenuMapper;
import com.anan.huotui.po.AnUp;
import com.anan.huotui.po.Category;
import com.anan.huotui.po.CategoryBean;
import com.anan.huotui.po.TbAddress;
import com.anan.huotui.po.TbAddressExample;
import com.anan.huotui.po.TbGoods;
import com.anan.huotui.po.TbGoodsExample;
import com.anan.huotui.po.TbGoodsImg;
import com.anan.huotui.po.TbGoodsImgExample;
import com.anan.huotui.po.TbMenu;
import com.anan.huotui.po.TbMenuExample;
import com.anan.huotui.po.TbShop;
import com.anan.huotui.po.TbShopExample;
import com.anan.huotui.po.TbUser;
import com.anan.huotui.po.TbUserExample;
import com.anan.huotui.po.TbUserMenu;
import com.anan.huotui.po.TbUserMenuExample;
import com.anan.huotui.po.TbUserExample.Criteria;
import com.anan.huotui.service.AdminService;
import com.anan.huotui.service.ITestService;
import com.anan.huotui.service.PCService;

@Service
public  class PCServiceImpl implements PCService {

	@Autowired
	private CategoryMapper categoryMapper;
	@Autowired
	private TbGoodsMapper goodsMapper;
	@Autowired
	private TbGoodsImgMapper goodsImgMapper;
	@Autowired
	private TbShopMapper shopMapper;
	@Autowired
	private TbAddressMapper addressMapper;

	@Autowired
	private TbUserMenuMapper userMenuMapper;
	@Autowired
	private TbUserMapper userMapper;
	
	@Autowired
	private TbMenuMapper menuMapper;
	

	public List<CategoryBean> index() {
		// TODO Auto-generated method stub
		List<CategoryBean> list=new ArrayList<CategoryBean>();
		List<Category> data = categoryMapper.selectByExample(null);
		
		for(int i = 0;i<data.size();i++){
			CategoryBean bean =new CategoryBean();
			bean.setCategory(data.get(i));
			TbGoodsExample ex =new TbGoodsExample();
			com.anan.huotui.po.TbGoodsExample.Criteria cri = ex.createCriteria();
			cri.andCateIdEqualTo(data.get(i).getCateId());
			List<TbGoods> goods = goodsMapper.selectByExample(ex );
			if(goods.size()>10){
				goods=goods.subList(0, 9);
			}
			for(int j = 0;j<goods.size();j++){
				TbGoodsImgExample example=new TbGoodsImgExample();
				com.anan.huotui.po.TbGoodsImgExample.Criteria imgcri = example.createCriteria();
				imgcri.andGidEqualTo(goods.get(j).getGid());
				List<TbGoodsImg> imgs = goodsImgMapper.selectByExample(example);
				if(imgs.size()>0){
					goods.get(j).setImg(goodsImgMapper.selectByExample(example).get(0).getUrl());
				}
			}
			bean.setGoods(goods);
			list.add(bean);
		}
		return list;
	}

	public TbUser telLogin(String tel, String password) {
		// TODO Auto-generated method stub
		
		
		TbUserExample example =new TbUserExample();
		Criteria cri = example.createCriteria();
		cri.andTelEqualTo(tel);
		cri.andPasswordEqualTo(password);		
		
		List<TbUser> users=userMapper.selectByExample(example );
		if(users.size()>0){
			
			return users.get(0);
			
		}else {
			
			return null;
		}
	}

	public List<TbGoods> getGoodsByCateId(Long cateid) {
		// TODO Auto-generated method stub
		
		TbGoodsExample example =new TbGoodsExample();
		
		com.anan.huotui.po.TbGoodsExample.Criteria cri = example.createCriteria();
		
		if(cateid==0l){
			
		}else {
			cri.andCateIdEqualTo(cateid);
		}
		List<TbGoods> list=goodsMapper.selectByExample(example);
		for(int j = 0;j<list.size();j++){
			TbGoodsImgExample example1=new TbGoodsImgExample();
			com.anan.huotui.po.TbGoodsImgExample.Criteria imgcri = example1.createCriteria();
			imgcri.andGidEqualTo(list.get(j).getGid());
			List<TbGoodsImg> imgs = goodsImgMapper.selectByExample(example1);
			if(imgs.size()>0){
				list.get(j).setImg(goodsImgMapper.selectByExample(example1).get(0).getUrl());
			}
		}
		return list;
	}

	public TbGoods getGoodsById(Long gid) {
		// TODO Auto-generated method stub
		
		TbGoods bean =goodsMapper.selectByPrimaryKey(gid);
		List<TbGoodsImg> imgs= getImgByGid(gid) ;
		if(imgs.size()>0){
			bean.setImg(imgs.get(0).getUrl());
		}
		return bean;
	}

	public List<TbGoodsImg> getImgByGid(Long gid) {
		// TODO Auto-generated method stub
		TbGoodsImgExample ex =new TbGoodsImgExample();
		com.anan.huotui.po.TbGoodsImgExample.Criteria cri = ex.createCriteria();
		cri.andGidEqualTo(gid);
		
		return goodsImgMapper.selectByExample(ex);
	}

	public TbShop getShopByGid(Long sid) {
		// TODO Auto-generated method stub
		return shopMapper.selectByPrimaryKey(sid);
	}

	public List<Category> getAllCate() {
		// TODO Auto-generated method stub
		return categoryMapper.selectByExample(null);
	}

	public List<TbAddress> getAddressListByUid(Long uid) {
		// TODO Auto-generated method stub
		TbAddressExample example = new TbAddressExample();
		com.anan.huotui.po.TbAddressExample.Criteria cri = example.createCriteria();
		cri.andUidEqualTo(uid);
		return addressMapper.selectByExample(example);
	}

	public void saveAddress(TbAddress adr) throws IOException{
		// TODO Auto-generated method stub
//		adr.setAddress(URLDecoder.decode(adr.getAddress(), "UTF-8"));
//		adr.setLinkman(URLDecoder.decode(adr.getLinkman(), "UTF-8"));
//		adr.setPrivince(URLDecoder.decode(adr.getPrivince(), "UTF-8"));
//		adr.setCity(URLDecoder.decode(adr.getCity(), "UTF-8"));
//		adr.setArea(URLDecoder.decode(adr.getArea(), "UTF-8"));
		addressMapper.insert(adr);
	}

	public void setArressDefault(TbAddress a) {
		// TODO Auto-generated method stub
		addressMapper.updateByPrimaryKey(a);
	}

	public TbAddress getAddressById(Long aid) {
		// TODO Auto-generated method stub
		return addressMapper.selectByPrimaryKey(aid);
	}

	public void deleteAdrById(Long aid) {
		// TODO Auto-generated method stub
		addressMapper.deleteByPrimaryKey(aid);
	}

}
