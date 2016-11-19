package com.laomashi.majiong.service.uti;/** * 返回给页面的json格式数据 *  * @author caozj *  */public class JsonResult {	/**	 * 成功码	 */	public static final int successCode = 200;	/**	 * 错误码	 */	public static final int failCode = 400;	/**	 * 状态码(200代表成功，其他可自行定义)	 */	private int code;	/**	 * 提示消息	 */	private String msg;	/**	 * 数据对象	 */	private Object data;	public int getCode() {		return code;	}	public void setCode(int code) {		this.code = code;	}	public String getMsg() {		return msg;	}	public void setMsg(String msg) {		this.msg = msg;	}	public Object getData() {		return data;	}	public void setData(Object data) {		this.data = data;	}	public JsonResult() {		code = successCode;	}	public JsonResult(Object data) {		this.data = data;		code = successCode;	}	public JsonResult(Object data, String msg) {		this.data = data;		this.code = successCode;		this.msg = msg;	}	public JsonResult(Object data, String msg, int code) {		this.data = data;		this.code = code;		this.msg = msg;	}	public JsonResult(String msg, int code) {		this.code = code;		this.msg = msg;	}	public JsonResult(int code) {		this.code = code;	}	public String toJson() {		return JsonUtil.toJson(this);	}//	public static void main(String []args) {//		//		MY_ATTRS my_attrs = new MY_ATTRS();//		//		List<String> data1 = new ArrayList<String>();//		data1.add("深灰");//		data1.add("银色");////		List<String> data2 = new ArrayList<String>();//		data2.add("32G");//		data2.add("16G");////		List<String> data3 = new ArrayList<String>();//		data3.add("32G");//		data3.add("16G");//		//		my_attrs.setGoodsId("2222");////		List<String> attr = new ArrayList<String>();//		attr.add("dtsx000003");//		attr.add("dtsx000004");//		attr.add("dtsx000005");//		my_attrs.setAttr(attr);//		//		List<String> name = new ArrayList<String>();//		name.add("颜色");//		name.add("版本");//		name.add("版本");//		my_attrs.setName(name);//		//		List<List<String>> data = new ArrayList<List<String>>();//		List<String> data1 = new ArrayList<String>();//		data1.add("深灰");//		data1.add("银色");//		//		List<String> data2 = new ArrayList<String>();//		data2.add("32G");//		data2.add("16G");//		//		List<String> data3 = new ArrayList<String>();//		data3.add("版本");//		//		data.add(data1);//		data.add(data2);//		data.add(data3);//		my_attrs.setData(data);//		//		System.out.println(new JsonResult(my_attrs).toJson());//	}}