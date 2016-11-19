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
  <link rel="stylesheet" href="<%=basePath%>css/show.css" type="text/css"></link></head>
  
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
    <div class="classify">
        <a href="http://localhost:8080/huotui/pc/goodslist.do?cateid=0" >全部</a>
        <c:forEach items="${cates}" var="cate" > 
        <a href="http://localhost:8080/huotui/pc/goodslist.do?cateid=${cate.cateId}"; target="self">${cate.name}</a>
        </c:forEach>
       
    </div>
</div>
<div class="boxWidth">
    <h2 class="clear">
      <span class="active">销量</span>
      <span>价格${sub.sname}</span>
    </h2>
    <div class="shopBox">
        <!--列表循环位置bigen-->
        <div class="shopList">
            <ul class="clear">
             <c:forEach items="${goodslist}" var="goods" > 
                <li>
                    <a href="http://localhost:8080/huotui/pc/detail.do?gid=${goods.gid}">
                        <div class="imgBox">
                            <img src="<%=basePath%>${goods.img}" alt="">
                        </div>
                        <div class="moneyBox">
                            <span class="name">${goods.goodsName}</span>
                            <span class="money">￥：${goods.price/100}</span>
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