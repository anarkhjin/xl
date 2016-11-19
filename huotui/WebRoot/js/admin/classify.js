window.onload=function(){
		
   var  addCateBtn =document.getElementById("addCateBtn");
   var  close =document.getElementById("close");
   var  cateList =document.getElementById("cateList");
       
   var  newCatewinBox =document.getElementById("newCatewinBox");
   addCateBtn.onclick=function(){
	   newCatewinBox.style.display="block";
   }
   close.onclick=function(){
	   newCatewinBox.style.display="none";
   }
   
   var user ={};
	   function getUser(){
		   	$.ajax({
			//提交数据的类型 POST GET
			type:"POST",
			//提交的网址
			url:"http://localhost:8080/huotui/admin/getAUser.do",
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
				if(json.data){
					user=json.data;
					getCates();
				}else{
					window.location.href="/huotui/html/admin/login.html";
				}
			} ,
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
	   
	  
	   function getCates(){
		   	$.ajax({
			//提交数据的类型 POST GET
			type:"POST",
			//提交的网址
			url:"http://localhost:8080/huotui/admin/cate.do",
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
                    cateList.innerHTML="";
                 for(var i= 0;i<json.data.length;i++){
                	 
                	 var cateTr=document.createElement("tr");
                	 var catetd1=document.createElement("td");
                	 catetd1.style.width="180";
                	 catetd1.innerHTML=""+ (i+1);
                	 var catetd2=document.createElement("td");
                	
                	 catetd2.style.width="600";
                	 catetd2.innerHTML=json.data[i].name;
                	 
                	 var catetd3=document.createElement("td");
                	 catetd3.innerHTML="<a href=\"javascript:;\">查看分类商品</a>";
                 cateTr.appendChild(catetd1);
                 cateTr.appendChild(catetd2);
                 cateTr.appendChild(catetd3);
                 cateList.appendChild(cateTr);
                 }  
                   
                   
			} ,
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
	    getUser();
	   }