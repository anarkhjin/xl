package com.anan.huotui.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;


public class SmsUtil {

	private static Logger logger = Logger.getLogger(SmsUtil.class);

	/**
	 * 微米账号的接口UID
	 */
	private static String uid = "aXfQAh8VL8kC";

	/**
	 * 微米账号的接口密码
	 */
	private static String pas = "f9yc3g48";

	/**
	 * 微米账号的模板ID
	 */
	private static String cid = "l8ehhHGv64ID";

	/**
	 * 接口返回类型：json、xml、txt。默认值为txt
	 */
	private static String type = "json";

	/**
	 * 有效期（单位min）
	 */
	private static String p2 = "1";

	/**
	 * @author yangxy,litj
	 * @note 微米短信发送
	 * @return {"code":0,"msg":"短信接口调用成功"}
	 */
	public static void send(String toTelephone, String verification) {
		Map<String, String> para = new HashMap<String, String>();

		para.put("uid", uid);

		para.put("pas", pas);

		para.put("cid", cid);

		para.put("type", type);

		para.put("p2", p2);

		/**
		 * 目标手机号码，多个以“,”分隔，例如1391*******,138********
		 */
		para.put("mob", toTelephone);

		/**
		 * 验证码字符串
		 */
		para.put("p1", verification);

		logger.info((HttpClientHelper.convertStreamToString(HttpClientHelper
				.post("http://api.weimi.cc/2/sms/send.html", para), "UTF-8")));
	}

	/**
	 * @author yangxy,litj
	 * @note 微米账号查询短信剩余
	 * @return 
	 *         {"sms-left":6803,"sms-sent":7,"sms-total":6810,"mms-left":5,"mms-sent"
	 *         :0,"mms-total":5,"msg":"账户短信彩信余额"}
	 * 
	 * @detail sms-left：短信剩余条数
	 * @detail sms-sent：短信已发条数
	 * @detail sms-total：短信总条数
	 * @detail mms-left：彩信剩余条数
	 * @detail mms-sent：彩信已发条数
	 * @detail mms-total：彩信总条数
	 * 
	 */
	public static String account() {

		Map<String, String> para = new HashMap<String, String>();

		/**
		 * 微米账号的接口UID
		 */
		para.put("uid", uid);

		/**
		 * 微米账号的接口密码
		 */
		para.put("pas", pas);

		/**
		 * 接口返回类型：json、xml、txt。默认值为txt
		 */
		para.put("type", type);

		return HttpClientHelper.convertStreamToString(HttpClientHelper.get(
				"http://api.weimi.cc/2/account/balance.html", para), "UTF-8");
	}

	/**
	 * 发送短信，并缓存在REDIS，1分钟以内仅获取缓存验证码
	 */
	public static String sendSms(String toTelephone) {
		int dbIndex = 1;// 1库用来存储短信验证码
		int expireSec = 60;// 1分钟过期
		String	vCode = String.valueOf(Math.round(Math.random() * 8999 + 1000));
			SmsUtil.send(toTelephone, vCode);
			logger.info("验证码发送序列为：" + vCode + "|" + "手机号为：" + toTelephone);
		return vCode;
	}

	public static void main(String[] a) {
		// 发送短信
		SmsUtil.sendSms("18184399267");
		// 查询剩余短信数量
		System.out.println(account());
	}

}
