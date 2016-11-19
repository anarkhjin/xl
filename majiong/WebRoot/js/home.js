window.onload=function(){
	var user ={};
	var num =1;
	var subsetions=[];
	var subsContainer=document.getElementById("subsContainer");
	var topicContainer=document.getElementById("topicContainer");
	function getSubs(){

			   $.ajax({
			            //提交数据的类型 POST GET
			            type:"POST",
			            //提交的网址
			            url:"/pc/listSubs.do",
			            //提交的数据
			            data:{},
			            //返回数据的格式
			            datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
			            //在请求之前调用的函数
			            //beforeSend:function(){$("#msg").html("logining");},
			            //成功返回之后调用的函数             
			            success:function(data){
			            	 var json=$.parseJSON(data); 
			            	 subsContainer.innerHTML="";
			            	 subsetions=json.data;
			            	
			            	 for(var i=0 ;i<subsetions.length;i++){
			            		 var li=document.createElement("li");
			            		 li.innerHTML=subsetions[i].name;
			            		 subsContainer.appendChild(li);
			            	 }
			            	 
			            	 initViews();
			            	 
			              },
			            //调用执行后调用的函数
			            complete: function(XMLHttpRequest, textStatus){
//			               alert(XMLHttpRequest.responseText);
//			               alert(textStatus);
			                //HideLoading();
			           
			            },
			            //调用出错执行的函数
			            error: function(){
			                //请求出错处理
			            	
			            }         
		         });
	           } 

	  getSubs();
	  var subid;
	  function  initViews(){
		  
		  var subs=subsContainer.getElementsByTagName("li");
		  subs[0].className="active";
		  for(var i =0; i<subs.length;i++){
			  subs[i].index=i;
			  subs[i].onclick=function(){
				  
				  for(var j =0; j<subs.length;j++){
					  subs[j].className=""; 
				  }
				  subs[this.index].className="active"; 
				  
				  for(var i =0; i<subs.length;i++){
					  if( subs[i].className=="active"){
						 subid= subsetions[i].subid;
					  }
				  }
				  getTopics();
			  }
		  }
		  for(var i =0; i<subs.length;i++){
			  if( subs[i].className=="active"){
				 subid= subsetions[i].subid;
			  }
		  }
		  getTopics();
	  }
	  
	  function getTopics(){
		  $.ajax({
	            //提交数据的类型 POST GET
	            type:"POST",
	            //提交的网址
	            url:"/pc/listTpoics.do",
	            //提交的数据
	            data:{subid:subid},
	            //返回数据的格式
	            datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
	            //在请求之前调用的函数
	            //beforeSend:function(){$("#msg").html("logining");},
	            //成功返回之后调用的函数             
	            success:function(data){
	            	 var json=$.parseJSON(data); 
	            	console.log(json.data);
	            	topicContainer.innerHTML="";
	            	for(var i =0;i<json.data.length;i++){
	            		
	            		var li=document.createElement("li");
	            		var a=document.createElement("a");
	            		a.href="/pc/detail.do?tid="+json.data[i].tid
	            		a.target="_blank"
	            	    a.className="clear"
	            	    	var span=document.createElement("span");
	            		    span.className="conOrder on"
	            		    span.innerHTML=(i+1);
	            		    var p=document.createElement("p");
	            		    p.className="over"
		            		 p.innerHTML=json.data[i].title;
	            		    
	            		    var span1=document.createElement("span");
	            		    span1.className="conClick"
	            		    span1.innerHTML=json.data[i].clickNum;
	            		
	            		    a.appendChild(span);
	            		    a.appendChild(p);
	            		    a.appendChild(span1);
	            		    li.appendChild(a);
	            		    topicContainer.appendChild(li);
	            	}
	            	
	              },
	            //调用执行后调用的函数
	            complete: function(XMLHttpRequest, textStatus){
//	               alert(XMLHttpRequest.responseText);
//	               alert(textStatus);
	                //HideLoading();
	           
	            },
	            //调用出错执行的函数
	            error: function(){
	                //请求出错处理
	            	
	            }         
            });
	  }
	  
	   var ii=null;
	    ii =setInterval(function(){

			   $.ajax({
			            //提交数据的类型 POST GET
			            type:"POST",
			            //提交的网址
			            url:"/pc/getuser.do",
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
			            	 if(json.data!=null){
			            		 
			            		 user=json.data;
			            		 
			            		 clearInterval(ii);
			            		 
				            	var mylogin =document.getElementById("loginBtn");
				            	mylogin.innerHTML="欢迎您："+json.data.username;
			            	 }
			            },
			            //调用执行后调用的函数
			            complete: function(XMLHttpRequest, textStatus){
//			               alert(XMLHttpRequest.responseText);
//			               alert(textStatus);
			                //HideLoading();
			           
			            },
			            //调用出错执行的函数
			            error: function(){
			                //请求出错处理
			            	
			            }         
			         });
			 
		 }, 500);
	    
	    var loginBtn = document.getElementById("loginBtn");
	      loginBtn.onclick=function (){
		     
	    	  if(user.username){
		    	  
		      }else{
		    	  window.location.href="/login.html";
		      }
	      
	      }
	      
	      
	      var  imgTab =document.getElementById("imgTab");
	  	var tabImgs=imgTab.getElementsByTagName("a");
	  	
	  	var  dotTab =document.getElementById("dotTab");
	  	var tabSpan=dotTab.getElementsByTagName("span");
	  	
	      var number=0;
	  	 
	  	setInterval(function(){
	  		number=number+1;

	  		if(number==tabImgs.length){
	  			number=0;
	  		}
	  		
	  		for(var i=0;i<tabSpan.length;i++){
	  			tabSpan[i].className="";
	  		}
	  		
	  		tabSpan[number].className="on";
	  		
	  		
	  		for(var i=0;i<tabImgs.length;i++){
	  			tabImgs[i].className="";
	  		}
	  		
	  		tabImgs[number].className="active";
	  		
	  	}, 5000);
	  	 
}