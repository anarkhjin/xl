package com.anan.huotui.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anan.huotui.mapper.AnUpMapper;
import com.anan.huotui.mapper.CategoryMapper;
import com.anan.huotui.mapper.TbGoodsImgMapper;
import com.anan.huotui.mapper.TbGoodsMapper;
import com.anan.huotui.mapper.TbMenuMapper;
import com.anan.huotui.mapper.TbShopMapper;
import com.anan.huotui.mapper.TbUserMapper;
import com.anan.huotui.mapper.TbUserMenuMapper;
import com.anan.huotui.po.AnUp;
import com.anan.huotui.po.Category;
import com.anan.huotui.po.CategoryExample;
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

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private TbUserMapper userMapper;

	@Autowired
	private TbUserMenuMapper userMenuMapper;
	
	@Autowired
	private TbMenuMapper menuMapper;
	
	@Autowired
	private TbShopMapper shopMapper;
	
	@Autowired
	private CategoryMapper cateMapper;
	
	@Autowired
	private TbGoodsMapper goodsMapper;
	
	@Autowired
	private TbGoodsImgMapper imgMapper;
	
	public TbUser login(String username,String password) {
		// TODO Auto-generated method stub
		
		TbUserExample example=new TbUserExample();
		
		Criteria cri = example.createCriteria();
		cri.andAccountEqualTo(username);
		cri.andPasswordEqualTo(password);
		List<TbUser> list = userMapper.selectByExample(example);
		if(list.size()>0){
			
			return list.get(0);
		}
		
		return null;
	}

	public List<TbMenu> getMenu(Long uid) {
		
		TbUserMenuExample example =new TbUserMenuExample();
		com.anan.huotui.po.TbUserMenuExample.Criteria cri = example.createCriteria();
		cri.andUidEqualTo(uid);
		List<TbUserMenu> list = userMenuMapper.selectByExample(example  );
		
		List<TbMenu> menus=new ArrayList<TbMenu>();
		for(int i =0 ;i<list.size();i++){
			
			menus.add(menuMapper.selectByPrimaryKey(list.get(i).getMid()));
		}
		return menus;
	}

	public TbUser adminLogin(String tel, String password) {
		// TODO Auto-generated method stub
		
		TbUserExample example =new TbUserExample();
		Criteria cri = example.createCriteria();
		cri.andPasswordEqualTo(password);
		cri.andTelEqualTo(tel);
		List<TbUser> user=userMapper.selectByExample(example );
		if(user.size()>0){
			
			return user.get(0);
		}else{
			
			return null;
		}
	}

	public TbShop adminLogin(Long shopid) {
		// TODO Auto-generated method stub
		
		return shopMapper.selectByPrimaryKey(shopid);
	}

	public List<Category> cate() {
		CategoryExample example=new CategoryExample();
		return cateMapper.selectByExample(example);
	}

	public List<TbGoods> queryGoods(int cateId, int state) {
		// TODO Auto-generated method stub
		
		TbGoodsExample example =new TbGoodsExample();
		com.anan.huotui.po.TbGoodsExample.Criteria cri = example.createCriteria();
		if(cateId!=-1){
			cri.andCateIdEqualTo((long)cateId);
		}
		
		if(state!=-1){
			cri.andStateEqualTo((short)state);
		}
		
		return goodsMapper.selectByExample(example);
	}

	public void saveGoods(TbGoods goods) {
		// TODO Auto-generated method stub
		 goodsMapper.insert(goods);
	}

	public TbGoods selectGoodsByUUID(String uuid) {
		// TODO Auto-generated method stub
		TbGoodsExample example =new TbGoodsExample();
		com.anan.huotui.po.TbGoodsExample.Criteria cri = example.createCriteria();
		cri.andUuidEqualTo(uuid); 
		List<TbGoods>  gds=goodsMapper.selectByExample(example);
		if(gds.size()>0){
			return gds.get(0);
		}else{
			return null;
		}
	}

	public void updateGoods(TbGoods goods) {
		// TODO Auto-generated method stub
		goodsMapper.updateByPrimaryKey(goods);
	}

	public TbGoods selectGoodsByGid(Long gid) {
		// TODO Auto-generated method stub
		return goodsMapper.selectByPrimaryKey(gid);
	}

	public void insertImg(Long gid, String fileUrl) {
		// TODO Auto-generated method stub
		TbGoodsImg record=new TbGoodsImg();
		record.setGid(gid);
		record.setUrl(fileUrl);
		
		imgMapper.insert(record);
	}

	public List<TbGoodsImg> getGoodsImgsByGid(Long gid) {
		// TODO Auto-generated method stub
		
		TbGoodsImgExample example=new TbGoodsImgExample();
		com.anan.huotui.po.TbGoodsImgExample.Criteria cri = example.createCriteria();
		cri.andGidEqualTo(gid);
		
		return imgMapper.selectByExample(example);
	}

	public void deleteGoodsImgsByImgId(Long imgId) {
		// TODO Auto-generated method stub
		imgMapper.deleteByPrimaryKey(imgId);
	}
	
}
