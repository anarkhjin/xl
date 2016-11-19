<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>老麻师</title>
    <meta name="keywords" content="老麻师,麻将技术,麻将视频,麻将文化,麻将比赛" />
	<meta name="description" content="麻将技术论坛" />
	
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/best.css" type="text/css"></link>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/index.css" type="text/css"></link>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/lib/jquery/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/home.js"></script>
</head>
<body>
<div class="nav">
    <a href="javascript:;" >老麻师</a>
    <span id ="loginBtn" class="login">登录</span>
     
</div>

<div class="tab boxWidth">
    <div id="imgTab"  class="tabCon clear">
        <a href="javascript:;" class="active"><img src="<%=request.getContextPath()%>/images/tabImg_1.jpg" alt=""></a>
        <a href="javascript:;"><img src="<%=request.getContextPath()%>/images/tabImg_2.jpg" alt=""></a>
        <a href="javascript:;"><img src="<%=request.getContextPath()%>/images/tabImg_3.jpg" alt=""></a>
    </div>
    <div id="dotTab"  class="tabBtn clear">
        <span class="on"></span>
        <span></span>
        <span></span>
    </div>
</div>
<h2>老麻师  </h2>
<div class="boxWidth">
   <ul id="subsContainer" class="subsctions clear">
   <li class="active">国粹</li>
   <li>贵阳麻将</li>
   <li>成都麻将</li>
   
   </ul>
</div>
<div class="boxWidth con clear">
    <div class="side left">
        <div class="intro">
            <h3>老麻师简介</h3>
            <p>麻将文化博大精深，是十大国粹之一。一方面，“十亿人民九亿麻，还有一亿在观察”，麻将已成为一种老少皆宜的棋牌游戏。此外，麻将风靡全球，连I hu-ed（我和了)、吃、碰等习语，也原版出现在西方的麻将桌上，与欧美文化实现了无缝对接。著名的世界麻将锦标赛已举办三届，麻将正成为国际性的娱乐工具，势必发扬光大。</p>
            <p>老麻师是一个整合麻将文化和麻将技术交流的网站，网站一方面会整合相关文化，另一方面提供相关技术交流，两者融汇共同组成全国唯一的一家麻将文化的网络社区。此外，我们喜欢麻将，但不应将其当做赌博的工具，麻将是工作之余和亲友增进感情、娱乐身心的工具。所以，老麻师宣传麻将文化的同时，也肩负反赌职责，请您监督指正。</p>
        </div>
        <div class="state">
            <h3>投稿说明</h3>
            <p>如果您要关于麻将方面好的点子，也乐意挤出点时间，您可以投稿给我们，我们会集合您的投稿点击量，给您相关报酬。投稿模板下载，下方有链接。 </p>
            <a href="http://laomashi.com/laomashi.docx">投稿模板下载 >></a>
        </div>
    </div>
    <div class="main left">
    
             
		             
		<div class="mainc">
            <h4 class="clear second">
                <span class="order">序号</span>
                <span class="title">标题</span>
                <span class="click">点击量</span>
            </h4>
            <div class="maincList">
                <ol id="topicContainer">
                   
                </ol>
            </div>
            <a href="" target="_blank" class="more">查看更多>></a>
        </div>


    </div>
    
    <div class="code right">
        <div class="codeImg">
            <img src="<%=request.getContextPath()%>/images/code.jpg" alt="">
            <a href="http://laomashi.com/app/paishen.apk"><p>扫二维码下载APP</p></a>
        </div>
        <div class="codeText">
            <h4>老麻师APP</h4>
            <p>  老麻师app（Android版）是老麻师网站的移动端，移动端复制了整个网站，对于使用app的用户是很方便的。无论是app还是pc端，均没有用户限制，不需要成为会员即可享有网站提供的所有内容；</p>
             <p>此外，老麻师app融入了一个麻将记牌器，功能强大、操作简单欢迎使用。使用帮助，详见下方链接《使用帮助》。</p>
        </div>
    </div>
</div>
<div class="footer">
    <p>关于我们&nbsp&nbsp&nbsp&nbsp&nbsp版权隐私 &nbsp&nbsp&nbsp&nbsp联系方式：1002606871@qq.com</p>
    <p>Copyright © 2016-2018  laomashi All Rights Reserved 黔ICP备16004073号</p>
</div>
</body>
