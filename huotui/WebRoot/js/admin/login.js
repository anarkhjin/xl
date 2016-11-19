window.onload=function(){
		
      var loginBtn=    document.getElementById("loginBtn");
      var username=    document.getElementById("username");
      var password=    document.getElementById("password");
      var tips    =    document.getElementById("tips");
		
		loginBtn.onclick=function(){
		
		if(username.value==""){
		  tips.style.display="block";
		  tips.innerHTML="请输入账号";
		  return;
		}
		if(password.value==""){
		  tips.style.display="block";
		  tips.innerHTML="请输入密码";
		  return;
		  }
     	$.ajax({
			//提交数据的类型 POST GET
			type:"POST",
			//提交的网址
			url:"http://localhost:8080/huotui/admin/login.do",
			//提交的数据
			data:{tel:username.value,password:password.value},
			//返回数据的格式
			datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
			//在请求之前调用的函数
			//beforeSend:function(){$("#msg").html("logining");},
			//成功返回之后调用的函数             
			success:function(data){
				var json=$.parseJSON(data); 
//				alert(json.data);
				if(json.data==null){
					
					  tips.style.display="block";
		              tips.innerHTML="账号密码错误";
				}else{
                  
                 window.location.href="http://localhost:8080/huotui/html/admin/index.html";
				
				 }
				
			} ,
			//调用执行后调用的函数
			complete: function(XMLHttpRequest, textStatus){
//               alert(XMLHttpRequest.responseText);
//                 alert(textStatus);
//HideLoading();
			},
			//调用出错执行的函数
			error: function(){
				//请求出错处理
			}         
		});
		
		}
	  }