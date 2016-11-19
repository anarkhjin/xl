window.onload=function(){
	
	var code =""; 
	function test(){
		$.ajax({
			//提交数据的类型 POST GET
			type:"POST",
			//提交的网址
			url:"http://localhost:8080/huotui/pc/getVerify.do",
			//提交的数据
			data:{},
			//返回数据的格式
			datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
			//在请求之前调用的函数
			//beforeSend:function(){$("#msg").html("logining");},
			//成功返回之后调用的函数             
			success:function(data){
				var json=$.parseJSON(data); 
				code=json.data;
				console.log(code);
				var verify=  document.getElementById("verify");
				verify.innerHTML=code;
				
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
	test();
  
	var loginbtn =document.getElementById("loginbtn");
	var telephone =document.getElementById("telephone");
	var password =document.getElementById("password");
	var verifycode =document.getElementById("verifycode");
	var tel =document.getElementById("tel");
	
	loginbtn.onclick=function (){
      
		if(telephone.value==""){
			tel.style.display="inherit";
			tel.innerHTML="请输入手机号";
			return  ;
		}
		if(password.value==""){
			tel.style.display="inherit";
			tel.innerHTML="请输入密码";
			return  ;
			
		}
		if(verifycode.value==""){
			tel.style.display="inherit";
			tel.innerHTML="请输入验证码";
			return  ;
			
		}
		if(verifycode.value!=code){
			tel.style.display="inherit";
			tel.innerHTML="验证码不正确";
			return  ;
		}
		tel.style.display="none";

         

		$.ajax({
			//提交数据的类型 POST GET
			type:"POST",
			//提交的网址
			url:"http://localhost:8080/huotui/pc/tellogin.do",
			//提交的数据
			data:{tel:telephone.value,password:password.value},
			//返回数据的格式
			datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
			//在请求之前调用的函数
			//beforeSend:function(){$("#msg").html("logining");},
			//成功返回之后调用的函数             
			success:function(data){
				var json=$.parseJSON(data); 
				
				if(json.data==null){
					
					tel.style.display="inherit";
					tel.innerHTML="用户或者密码错误";
					test();
				}else{
					
                    window.history.back();
					
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
	
  }
   