var user={};
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
		            		
		            		if(user.email==null){
		            			email.innerHTML="未绑定";
		            			
		            		}else{
		            			email.innerHTML=user.email;
		            		}
		            		 
		            		
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
window.onload=function(){
	

	function getUserAddress(){//获取用户地址
		
		  $.ajax({
	            //提交数据的类型 POST GET
	            type:"POST",
	            //提交的网址
	            url:"http://localhost:8080/huotui/pc/useradr.do",
	            //提交的数据
	            data:{uid:user.uid},
	            //返回数据的格式
	            datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
	            //在请求之前调用的函数
	            //beforeSend:function(){$("#msg").html("logining");},
	            //成功返回之后调用的函数             
	            success:function(data){
	            	 var json=$.parseJSON(data); 
	                   console.log(json.data);
	                   var addressList=json.data;
	                   var addressTbody =document.getElementById("addressTbody");
	                  addressTbody.innerHTML="";
	                   for(var i =0 ;i<addressList.length;i++){
	                	  var tr =document.createElement("tr");
	                	  var td1 =document.createElement("td");
	                	  td1.innerHTML=addressList[i].linkman;
	                	  var td2 =document.createElement("td");
	                	    td2.innerHTML =addressList[i].privince+""+addressList[i].city+""+addressList[i].area+""+addressList[i].address;
	                	  var td3 =document.createElement("td");
	                	    td3.innerHTML =addressList[i].tel;
	                	  
	                	  var td4 =document.createElement("td");
	                	  var span1 =document.createElement("span");
	                	  
	                	  span1.innerHTML ="修改";
	                	  span1.onclick=function(){
	                		  alert("修改");
	                	  }
	                	  
	                	  var span2 =document.createElement("span");
	                	  span2.innerHTML ="删除";
	                	  span2.index=addressList[i].aid;
	                	  span2.onclick=function(){
//	                		  alert("删除");
	                		 deleteAddress(this.index);
	                	  }
	                	  
	                	  var span3 =document.createElement("span");
	                	  span3.innerHTML ="&nbsp;&nbsp;&nbsp;";
	                	  
	                	  td4.appendChild(span1);
		                   if(addressList[i].deflaut==1){
		                	  span3.innerHTML ="&nbsp;&nbsp;默认地址";
		                	  }
		                 
	                	  td4.appendChild(span3);
		                	  if(addressList[i].deflaut==0){
								td4.appendChild(span2);	                	  
		                	  }
	                	  
	                	  
	                	  tr.appendChild(td1);
	                	  tr.appendChild(td2);
	                	  tr.appendChild(td3);
	                	  tr.appendChild(td4);
	                	  addressTbody.appendChild(tr);
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
     function deleteAddress(addrssId){
		  $.ajax({
	            //提交数据的类型 POST GET
	            type:"POST",
	            //提交的网址
	            url:"http://localhost:8080/huotui/pc/deleteUserAdr.do",
	            //提交的数据
	            data:{aid:addrssId},
	            //返回数据的格式
	            datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
	            //在请求之前调用的函数
	            //beforeSend:function(){$("#msg").html("logining");},
	            //成功返回之后调用的函数             
	            success:function(data){
	            	
	            	getUserAddress();
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
		
	};
	var menu = document.getElementById("menu");
	var mycenter = document.getElementById("mycenter");
	var myorder = document.getElementById("myorder");
	var myaddress = document.getElementById("myaddress");
	var personnalCenter = document.getElementById("personnalCenter");
	var myOrderCenter = document.getElementById("myOrderCenter");
	var myAddressCenter = document.getElementById("myAddressCenter");
	
	mycenter.onclick=function(){
		myorder.className="";
		mycenter.className="";
		this.className="active";
		personnalCenter.style.display="block";
		myOrderCenter.style.display="none";
		myAddressCenter.style.display="none";
	
	}
	
	myorder.onclick=function(){
		mycenter.className="";
		myaddress.className="";
		this.className="active";
		
		personnalCenter.style.display="none";
		myOrderCenter.style.display="block";
		myAddressCenter.style.display="none";
		
	}
	myaddress.onclick=function(){
		mycenter.className="";
		myorder.className="";
		this.className="active";
		
		personnalCenter.style.display="none";
		myOrderCenter.style.display="none";
		myAddressCenter.style.display="block";
		
		getUserAddress();//获取地址
	}
	getuser();
	var newAddress = document.getElementById("newAddress");
	var newAddressDiv = document.getElementById("newAddressDiv");
	var saveBox = document.getElementById("saveBox");
	
	    newAddress.onclick=function(){
	    	
			newAddressDiv.style.display="block";
			saveBox.style.display="block";
			
		}
          var  linkMan =  document.getElementById("linkMan");
          var  addressTel =  document.getElementById("addressTel");
          var  sheng =  document.getElementById("sheng");
          var  shi =  document.getElementById("shi");
          var  qu =  document.getElementById("qu");
          var  addressDetail =  document.getElementById("addressDetail");
          var  adrtips =  document.getElementById("adrtips");
          var  isDefault =  document.getElementById("isDefault");
	    
                           
	  var saveAddess = document.getElementById("saveAddess");
	   saveAddess.onclick=function(){
	    	
		 
		   
		   if(linkMan.value==""){
	    		
				adrtips.innerHTML="联系人不能为空";
				adrtips.style.display="block";
			 return ;
	    	}
	    	
	    	if(addressTel.value==""){
	    		
				adrtips.innerHTML="联系电话不能为空";
				adrtips.style.display="block";
			 return ;
	    	}
	    	if(addressDetail.value==""){
	    		
				adrtips.innerHTML="地址详情不能为空";
				adrtips.style.display="block";
			 return ;
	    	}
	        var shengIndex = sheng.selectedIndex;
		    var shengStr = sheng.options[shengIndex].text;
	    	
		    var shiIndex = shi.selectedIndex;
		    var shiStr = shi.options[shiIndex].text;
		    
		    var quIndex = qu.selectedIndex;
		    var quStr = qu.options[quIndex].text;
	    	
		    var detailStr =shengStr+shiStr+quStr+addressDetail.value;
		    adrtips.style.display="none";
		   
		    
		    if(isDefault.checked){
		    
		    	saveAddress(linkMan.value,addressTel.value,shengStr,shiStr,quStr,addressDetail.value,1);
		    }else{
		    
		    	saveAddress(linkMan.value,addressTel.value,shengStr,shiStr,quStr,addressDetail.value,0);
		    }
		    
		   linkMan.innerHTML="";
		   addressTel.innerHTML="";
		   addressTel.innerHTML="";
		   addressDetail.innerHTML="";
		   newAddressDiv.style.display="none";
		   saveBox.style.display="none";
		}
	  function saveAddress(man,tele,sheng,shi,qu,detail,isDefault){
		  	  $.ajax({
	            //提交数据的类型 POST GET
	            type:"POST",
	            contentType:'application/x-www-form-urlencoded; charset=UTF-8',
	            //提交的网址
	            url:"http://localhost:8080/huotui/pc/saveUserAdr.do",
	            //提交的数据
	            data:{
		  		  uid:user.uid,
		  		  deflaut:isDefault,
		  		  linkman:man,
		  		  tel:tele,
		  		  privince:sheng,
		  		  city:shi,
		  		  area:qu,
		  		  address:detail
		  		  },
	            //返回数据的格式
	            datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
	            //在请求之前调用的函数
	            //beforeSend:function(){$("#msg").html("logining");},
	            //成功返回之后调用的函数             
	            success:function(data){
	            	getUserAddress();
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
}

