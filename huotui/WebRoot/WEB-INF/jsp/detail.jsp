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
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
  <link rel="stylesheet" href="<%=basePath%>css/best.css" type="text/css"></link>
  <link rel="stylesheet" href="<%=basePath%>css/details.css" type="text/css"></link>
  
  <script type="text/javascript" src="<%=basePath%>js/lib/jquery/jquery-1.7.1.min.js"></script></head>
  <script type="text/javascript" src="<%=basePath%>js/detail.js"></script>
  
  
 <body>
<div class="top">
    <div class="boxWidth topCon clear">
        <a href="javascript:;">注册</a>
        <a href="javascript:;">登录</a>
        <a href="javascript:;">我的订单</a>
    </div>
</div>
<div class="logoBox">
    <div class="clear boxWidth">
        <a href="javascript:;" class="left logo">logo</a>
    </div>
</div>
<div class="boxWidth">
    <div class="detailsBox clear">
        <div class="magnifyBox left">
            <div class="smallBox"><img src="<%=basePath%>${img.url}" alt=""></div>
            <div class="bigBox"><img src="<%=basePath%>images/index/banner.jpg" alt=""></div>
            <div class="imgBtns">
                <ul id="goodsimgs" class="clear">
                 <c:forEach items="${imgs}" var="img" > 
                    <li><img src="<%=basePath%>${img.url}" alt=""></li>
                 </c:forEach>
                </ul>
            </div>
        </div>
        <div class="details right">
            <h2>${detail.goodsName}</h2>
            <p class="shopDetail"></p>
            <p class="address">发货地址：${shop.saddress}</p>
            <p class="market">市场价：<span>￥${detail.trueprice/100}</span></p>
            <p class="shopPrice">商场价：<span>￥${detail.price/100}</span></p>
            <p>库存:${detail.num}</p>
            <div class="clear countBox">
                <p class="left">数量: </p>
                <div class="left count">
                    <span id="numSub" class="subtract">-</span>
                    <span id="num" class="number">1</span>
                    <span  id="numAdd"  class="add">+</span>
                </div>
            </div>
            <p class="total">总计: <span>￥${detail.price}</span></p>
            <div class="buyBtns">
                <a href="javascript:;" class="buy">立即购买</a>
                <a onclick="joinCart(${detail.gid})" href="javascript:;" class="cart">加入购物车</a>
            </div>
        </div>
    </div> 
</div>
<div class="boxWidth">
    <h3>为你推荐</h3>
    <div class="shopBox">
        <!--列表循环位置bigen-->
        <div class="shopList">
            <ul class="clear">
             <c:forEach items="${goodslist}" var="goods" > 
                <li>
                    <a href="<%=basePath%>pc/detail.do?gid=${goods.gid}">
                        <div class="imgBox">
                            <img src="<%=basePath%>images/index/shop.jpg" alt="">
                        </div>
                        <div class="moneyBox">
                            <span class="name">${goods.goodsName}</span>
                            <span class="money">${goods.price/100}</span>
                        </div>
                    </a>
                </li>
             </c:forEach>
               
            </ul>
        </div>
       
    </div>
</div>

<div class="footer">
    <a href="javascript:;">24小时在线服务</a>
    <p>客服电话：200-888-8888</p>
    <p>©2016 Meizu Telecom Equipment Co., Ltd. All rights reserved.备案号: 粤ICP备13003602号-4经营许可证编号: 粤B2-20130198营业执照</p>
</div>
</body>
</html>