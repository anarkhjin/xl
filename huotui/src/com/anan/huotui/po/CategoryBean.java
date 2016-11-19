package com.anan.huotui.po;

import java.util.List;

public class CategoryBean {
	Category category;
	List<TbGoods> goods;
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<TbGoods> getGoods() {
		return goods;
	}
	public void setGoods(List<TbGoods> goods) {
		this.goods = goods;
	}
	
}