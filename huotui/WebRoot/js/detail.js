var user ={};
var num =1;

function getuser(){

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
		            		 
		            		var userid = document.getElementById("userid");
		            		userid.innerHTML=user.name;
		            		var account = document.getElementById("account");
		            		account.innerHTML=user.account;
		            		var telenumber = document.getElementById("telenumber");
		            		telenumber.innerHTML=user.tel;
		            		var email = document.getElementById("email");
		            		
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
   getuser();

function joinCart(gid){
	
		  $.ajax({
		            //提交数据的类型 POST GET
		            type:"POST",
		            //提交的网址
		            url:"http://localhost:8080/huotui/cart/joinCart.do",
		            //提交的数据
		            data:{uid:user.uid,gid:gid,num:num},
		            //返回数据的格式
		            datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
		            //在请求之前调用的函数
		            //beforeSend:function(){$("#msg").html("logining");},
		            //成功返回之后调用的函数             
		            success:function(data){
		            	var json=$.parseJSON(data); 
		            	alert(json.data);
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




window.onload=function(){
	var numSub=document.getElementById("numSub");
	var numSpan=document.getElementById("num");
	var numAdd=document.getElementById("numAdd");
      
	numAdd.onclick=function (){
    	  num=num+1;
    	  numSpan.innerHTML=num;
      }
      numSub.onclick=function (){
    	  if(num>1){
    	  num=num-1;
    	  numSpan.innerHTML=num;
    	  }
      }
	
}