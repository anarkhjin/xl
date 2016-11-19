package com.anan.huotui.po;

/**
 * @author guj
 * 订单详情，Javabean 对象
 */
public class OrderGoods  {

	private int amount ;//数量

	private  TbGoods goods;
	public TbGoods getGoods() {
		return goods;
	}

	public void setGoods(TbGoods goods) {
		this.goods = goods;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	
}