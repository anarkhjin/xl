<%@ page language="java" import="java.util.*"  pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>订单提交</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	 <link rel="stylesheet" href="<%=basePath%>css/best.css" type="text/css"></link>
	 <link rel="stylesheet" href="<%=basePath%>css/address.css" type="text/css"></link></head>
	   <script type="text/javascript" src="<%=basePath%>js/lib/jquery/jquery-1.7.1.min.js"></script>
	   <script type="text/javascript" src="<%=basePath%>js/PCASClass.js"></script></head>
	   <script type="text/javascript" src="<%=basePath%>js/order.js"></script></head>
	   
 <body>
<div class="top">
    <div class="boxWidth topCon clear">
        <a href="javascript:;">注册</a>
        <a href="javascript:;">登录</a>
        <a href="javascript:;">我的订单</a>
    </div>
</div>
<div class="logoBox">
    <div class="boxWidth clear">
        <a href="javascript:;" class="logo left">logo</a>
        <p class="left topTxt">提交订单</p>
        <img src="/huotui/images/step.png" alt="" class="step right">
    </div>
</div>
<div class="boxWidth">
    <h2 class="messageTxt">收货人信息</h2>
</div>
<div class="addList">
    <div class="boxWidth">
        <ul  id="orderAddList" class="clear" >
         
         <c:forEach items="${adrs}" var="address" > 
        
        <c:choose>
		   <c:when test="${address.deflaut==1}">  
		      <li class="active">
	                <h3 class="clear">
	                    <span class="left">${address.linkman}</span>
	                    <span class="right">${address.tel}</span>
	                </h3>
	                <p>${address.privince} ${address.city} ${address.area} ${address.address}</p>
	          </li>
		   </c:when>
		   <c:otherwise> 
		    <li class="">
	                <h3 class="clear">
	                    <span class="left">${address.linkman}</span>
	                    <span class="right">${address.tel}</span>
	                </h3>
	                <p>${address.privince} ${address.city} ${address.area} ${address.address}</p>
	        </li>
	   </c:otherwise>
		</c:choose>
          </c:forEach>
        </ul>
    </div>
    
</div>
<div class="addBox">
    <div class="boxWidth">
        <h4>添加新地址</h4>
        <div class="info">
            <ul>
                <li class="clear">
                    <label for="" class="left"><i>*</i>收货人</label>
                    <div class="left name">
                        <input type="text">
                        <i>长度不超过12个字</i>
                    </div>
                </li>
                <li class="clear">
                    <label for="" class="left"><i>*</i>手&nbsp&nbsp&nbsp机</label>
                    <div class="left phone">
                        <input type="text">
                        <i>请输入11位手机号</i>
                    </div>
                </li>
                <li class=" cityBox clear">
                    <label for="" class="left"><i>*</i>地&nbsp&nbsp&nbsp址</label>
                    <div class="left ">
                        <div class="city">
                          <select id="sheng" name="province"></select><select  id="shi"  name="city"></select><select  id="qu"  name="area"></select><br>
                            <script language="javascript" defer>
			                        new PCAS("province","city","area","贵州省","贵阳市","南明区");
                             </script>
                        </div>
                        
                        <div class="address">
                            <input type="text">
                            <i>请输入不超过50个字的详细地址，例如：路名,门牌号</i>
                        </div>
                    </div>
                </li>
                <li class="btnBox">
                    <div class="btns clear">
                        <span class="seave left">保存并使用</span>
                        <span class=" cancel left">取消</span>
                    </div>

                </li>
               
            </ul>

        </div>
    </div>
</div>
<div class="orderBox">
    <div class="boxWidth">
        <h4>确认订单信息</h4>
        <div class="orderList">
            <table>
                <thead>
                    <tr>
                        <th width="344" style="text-indent:3em">商品</th>
                        <th width="232">单价</th>
                        <th width="230">数量</th>
                        <th width="233">运费</th>
                        <th width="164">小记</th>
                    </tr>
                </thead>
                <tbody>
                
                  <c:forEach items="${goodsList}" var="orderGoods" > 
                  
                    <tr>
                        <td class="shopImg">
                            <img src="/huotui${orderGoods.goods.img}" alt="" class="left">
                            <p class="left">${orderGoods.goods.goodsName}</p>
                        </td>
                        <td>￥${orderGoods.goods.price/100}</td>
                        <td>${orderGoods.amount}</td>
                        <td>${orderGoods.goods.yunfei*orderGoods.amount/100}</td>
                        <td>￥${(orderGoods.goods.yunfei+orderGoods.goods.price)*orderGoods.amount/100}</td>
                    </tr>
                  </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<div class="planBox">
    <div class="boxWidth clear">
        <ul>
            <li><span class="left">总金额</span><span class="right">￥${sumPrice/100}</span></li>
            <li><span class="left">运费</span><span class="right"> ￥${sumYunfei/100}</span></li>
            <li class="activity"><span class="left">合计</span><span class="right">￥${sum/100}</span></li>
            <li class="summary"><span class="left">应付</span><span class="right sumMoney">￥${sum/100}</span></li>
        
        </ul>
    </div>
    <!-- 
    <div  id="payStyle" class="boxWidth clear ">
      <h2 class="messageTxt" >支付方式</h2>
    </div>
     -->
    
       <div class="boxWidth clear">
        <ul>
            <li id="submitOrder" class="orderBtn"><span>提交订单</span></li>
        </ul>
       
       </div>
</div>

<div class="footer">
    <a href="javascript:;">24小时在线服务</a>
    <p>客服电话：200-888-8888</p>
    <p>©2016 Meizu Telecom Equipment Co., Ltd. All rights reserved.备案号: 粤ICP备13003602号-4经营许可证编号: 粤B2-20130198营业执照</p>
</div>
</body>
</html>