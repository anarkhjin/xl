   var user={};
   
function test(){
   $.ajax({
            //提交数据的类型 POST GET
            type:"POST",
            //提交的网址
            url:"http://localhost:8080/huotui/pc/index.do",
            //提交的数据
            data:{},
            //返回数据的格式
            datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
            //在请求之前调用的函数
            //beforeSend:function(){$("#msg").html("logining");},
            //成功返回之后调用的函数             
            success:function(data){
            var json=$.parseJSON(data); 
            console.log(json.data);
           var list=document.getElementById("list");
           var categoryNav=document.getElementById("categoryNav");
           
            for(var i=0;i<json.data.length;i++){
            	var container=document.createElement("div")
            	container.className="boxWidth";
            	var title=document.createElement("h2")
            	title.className="clear";
               var span1=document.createElement("span")
               span1.className="left";
               span1.innerHTML=json.data[i].category.name;
               
               var a2=document.createElement("a")
               a2.innerHTML=json.data[i].category.name;
               a2.href="http://localhost:8080/huotui/pc/goodslist.do?cateid="+json.data[i].category.cateId;
               a2.target="blank";
               
               categoryNav.appendChild(a2);
                var a1=document.createElement("a")
               a1.className="right more";
               a1.setAttribute("href","http://localhost:8080/huotui/pc/goodslist.do?cateid="+json.data[i].category.cateId);
               a1.href="http://localhost:8080/huotui/pc/goodslist.do?cateid="+json.data[i].category.cateId;
               a1.target="blank";
               a1.innerHTML="更多...";
               title.appendChild(span1);
               title.appendChild(a1);
               container.appendChild(title);
               list.appendChild(container);
                
               
                var shopBox=document.createElement("div");
                shopBox.className="shopBox";
                 
                
                var shopList=document.createElement("div");
                shopList.className="shopList";
                var clear=document.createElement("ul");
                clear.className="clear";
                
               var goods = json.data[i].goods;
               for(var j = 0;j<goods.length;j++){
            	  var li1=document.createElement("li");
            	  var a2=document.createElement("a");
            	   a2.innerHTML="<div class=\"imgBox\"><img src=\"/huotui/images/index/shop.jpg\" alt=\"\"></div><div class=\"moneyBox\"><span class=\"name\">"+goods[j].goodsName+"</span><span class=\"money\">￥"+(goods[j].price/100)+"</span></div>";
            	   a2.href="http://localhost:8080/huotui/pc/detail.do?gid="+goods[j].gid;
            	   a2.target="blank";
            	   li1.appendChild(a2);
            	  clear.appendChild(li1);
               }
                shopList.appendChild(clear);
                shopBox.appendChild(shopList);
                
                list.appendChild(shopBox);
            }
           
            }   ,
            //调用执行后调用的函数
            complete: function(XMLHttpRequest, textStatus){
//               alert(XMLHttpRequest.responseText);
//               alert(textStatus);
                //HideLoading();
           
            },
            //调用出错执行的函数
            error: function(){
                //请求出错处理
            	
            }         
         });
  }
    test();
    
    var ii=null;
    ii =setInterval(function(){
		 

		   $.ajax({
		            //提交数据的类型 POST GET
		            type:"POST",
		            //提交的网址
		            url:"http://localhost:8080/huotui/pc/getuser.do",
		            //提交的数据
		            data:{},
		            //返回数据的格式
		            datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
		            //在请求之前调用的函数
		            //beforeSend:function(){$("#msg").html("logining");},
		            //成功返回之后调用的函数             
		            success:function(data){
		            	 var json=$.parseJSON(data); 
//		                   alert(json.data);
		            	 if(json.data!=null){
		            		 
		            		 user=json.data;
		            		 
		            		 clearInterval(ii);
		            		 
			            	var myregister =document.getElementById("myregister");
			            	var mylogin =document.getElementById("mylogin");
			            	var welcome =document.getElementById("welcome");
			            	myregister.style.display="none";
			            	mylogin.style.display="none";
			            	welcome.style.display="block";
			            	welcome.innerHTML="欢迎您："+json.data.name;
		            	 }
		            },
		            //调用执行后调用的函数
		            complete: function(XMLHttpRequest, textStatus){
//		               alert(XMLHttpRequest.responseText);
//		               alert(textStatus);
		                //HideLoading();
		           
		            },
		            //调用出错执行的函数
		            error: function(){
		                //请求出错处理
		            	
		            }         
		         });
		 
	 }, 500);