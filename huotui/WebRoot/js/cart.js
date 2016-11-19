var user={};
var carts=[];
window.onload=function (){
	
	function getUser(){
		
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
		            		 getCart();
		            	 }else{
		            		  window.location = "../html/login.html" ;
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
	}
	getUser();
	function getCart(){

		   $.ajax({
		            //提交数据的类型 POST GET
		            type:"POST",
		            //提交的网址
		            url:"http://localhost:8080/huotui/cart/selectCart.do",
		            //提交的数据
		            data:{uid:user.uid},
		            //返回数据的格式
		            datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
		            //在请求之前调用的函数
		            //beforeSend:function(){$("#msg").html("logining");},
		            //成功返回之后调用的函数             
		            success:function(data){
		            	 var json=$.parseJSON(data); 
		            	 carts=  json.data;
		            	 console.log(json.data);
		            	 
		            	 cartList.innerHTML="";
		            	 for(var i =0 ;i<carts.length;i++){
		            		 
		            		 var cartItem=	 document.createElement("li");
		            		 cartItem.className="clear";
		            		 var cartIteInput=	 document.createElement("input");
		            		 cartIteInput.type="checkbox";
		            		 cartIteInput.index=i;
		            		 cartIteInput.className="inp left";
		            		 cartIteInput.checked="true";
		            		 var cartIteDiv1=	 document.createElement("div");
		            		 cartIteDiv1.className="shop left";
		            		 
		            		 var cartIteDiv1A=	 document.createElement("a");
		            		 cartIteDiv1A.className="clear";
		            		 cartIteDiv1A.href="javascript:;";
		            		 
		            		 var cartIteDiv1Aimg=	 document.createElement("img");
		            		 
		            		 cartIteDiv1Aimg.src="http://localhost:8080/huotui"+carts[i].goodsImg;
		            		 cartIteDiv1Aimg.className="left";
		            		 cartIteDiv1Aimg.width="80";
		            		 cartIteDiv1Aimg.height="80";
		            		 cartIteDiv1Aimg.alt="";
		            		 
		            		 var cartIteDiv1Ap=	 document.createElement("p");
		            		 cartIteDiv1Ap.className="left";
		            		 cartIteDiv1Ap.innerHTML=""+carts[i].goodsName;
		            		
		            		 cartIteDiv1A.appendChild(cartIteDiv1Aimg);
		            		 cartIteDiv1A.appendChild(cartIteDiv1Ap);
		            		 cartIteDiv1.appendChild(cartIteDiv1A);
		            		 
		            		 var cartItep1=	 document.createElement("p");
		            		 
		            		 cartItep1.className="money left";
		            		 cartItep1.innerHTML="￥"+(carts[i].price/100);
		            		 
			            	var cartIteDiv2=	 document.createElement("div");
			                cartIteDiv2.className="count center left";
			                cartIteDiv2.innerHTML="<span>-</span><span>"+carts[i].num+"</span><span>+</span>";
			            		 
			               var cartItep2=	 document.createElement("p");
			               cartItep2.className="idea left";
			               cartItep2.innerHTML="￥"+(carts[i].price*carts[i].num/100);
			          
			               var span2=	 document.createElement("span");
			               span2.className="remove left";
			               span2.innerHTML="删除";
			               
		            		 cartItem.appendChild(cartIteInput);
		            		 cartItem.appendChild(cartIteDiv1);
		            		 cartItem.appendChild(cartItep1);
		            		 cartItem.appendChild(cartIteDiv2);
		            		 cartItem.appendChild(cartItep2);
		            		 cartItem.appendChild(span2);
		            		
		            		 
		            		 cartList.appendChild(cartItem);
		            		 
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
	}
	
	var gotoOrder =document.getElementById("gotoOrder");
	var cartList =document.getElementById("cartList");
	
	var inputs = cartList.getElementsByTagName("input")
	
	 gotoOrder.onclick=function (){
		
		var json="";
			for(var i =0 ;i<inputs.length;i++){
				if(inputs[i].checked==true){
					json=json+carts[i].gid+"_"+carts[i].num+"-";
				}
			 }
		var	str =json.slice(0, json.length-1)
			
		window.location.href="http://localhost:8080/huotui/cart/submitOrder.do?json="+str;
		
	}
}
