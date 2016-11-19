window.onload=function(){
	
	var user ={};
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
	      
	      var commentText = document.getElementById("commentText");
	   
	      var publishBtn = document.getElementById("publishBtn");
	      
	      publishBtn.onclick=function (){
	    	
	    	  if(user.username){
	    		  
	    		  if(commentText.value==""){
	    		
	    		      return ;
	    	          }else{
	    	        	 
	    			  $.ajax({
	    				  //提交数据的类型 POST GET
	    				  type:"POST",
	    				  //提交的网址
	    				  url:"/pc/pulishConment.do",
	    				  //提交的数据
	    				  data:{tid:tid,content:commentText.value},
	    				  //返回数据的格式
	    				  datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
	    				  //在请求之前调用的函数
	    				  //beforeSend:function(){$("#msg").html("logining");},
	    				  //成功返回之后调用的函数             
	    				  success:function(data){
	    					  var json=$.parseJSON(data); 
	    					  console.log(json.data);
	    					  conmentPublishBox.style.diplay="none";
	    				      getAllComments();
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
			      }else{
			    	  window.location.href="/login.html";
			   }
    }
	      
	      var conmentPublishBox =document.getElementById("conmentPublishBox");
	 
	      function  getAllComments(){
		 
		  $.ajax({
			  //提交数据的类型 POST GET
			  type:"POST",
			  //提交的网址
			  url:"/pc/conmentList.do",
			  //提交的数据
			  data:{tid:tid},
			  //返回数据的格式
			  datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
			  //在请求之前调用的函数
			  //beforeSend:function(){$("#msg").html("logining");},
			  //成功返回之后调用的函数             
			  success:function(data){
				  var json=$.parseJSON(data); 
				  conmentListUl.innerHTML="";
				  for(var i =0;i<json.data.length;i++){
					  var div =document.createElement("div");
					  div.className="conmentContainer";
					  var span =document.createElement("span");
					  span.className="cover";
					  span.innerHTML=(i+1)+"楼";
					  var p =document.createElement("p");
					  p.className="conment";
					  p.innerHTML=json.data[i].reply.content;
					  
					  var div1 =document.createElement("div");
					  div1.className="conmentPublisher clear";
					  
					  var p1 =document.createElement("p");
					  p1.className="right";
					  p1.innerHTML="作者： " +json.data[i].user.username +"  时间："+formatDate(new Date(json.data[i].reply.sendtime),"yyyy-MM-dd hh:mm:ss");
					  
					  div1.appendChild(p1);
					  div.appendChild(span);
					  div.appendChild( p);
					  div.appendChild(div1);
					  conmentListUl.appendChild(div);
				  }
				  console.log(json.data);
				  
		  },
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
	 var conmentListUl =document.getElementById("conmentListUl");
	  function formatDate(date,format){
	        var paddNum = function(num){
	          num += "";
	          return num.replace(/^(\d)$/,"0$1");
	        }
	        //指定格式字符
	        var cfg = {
	           yyyy : date.getFullYear() //年 : 4位
	          ,yy : date.getFullYear().toString().substring(2)//年 : 2位
	          ,M  : date.getMonth() + 1  //月 : 如果1位的时候不补0
	          ,MM : paddNum(date.getMonth() + 1) //月 : 如果1位的时候补0
	          ,d  : date.getDate()   //日 : 如果1位的时候不补0
	          ,dd : paddNum(date.getDate())//日 : 如果1位的时候补0
	          ,hh : date.getHours()  //时
	          ,mm : date.getMinutes() //分
	          ,ss : date.getSeconds() //秒
	        }
	        format || (format = "yyyy-MM-dd hh:mm:ss");
	        return format.replace(/([a-z])(\1)*/ig,function(m){return cfg[m];});
	      }  
	 
	 getAllComments();
	 
	 
	 
	 
	 
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
	 
	 
	 
	 
//	 alert(tid);
}