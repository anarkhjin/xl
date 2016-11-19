window.onload=function(){
   
   var user ={};
   var cate =[];
   var cateList =document.getElementById("cateList");
   var fenlei =document.getElementById("fenlei");
   var goodsState =document.getElementById("goodsState");
   
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
                    cate=json.data;
                    var dd=document.createElement("dd");
                     dd.innerHTML="全部";
                     dd.className="active";
                     dd.index=-1;
                     cateList.appendChild(dd);
                   
//                   fenlei.innerHTML="";
//                     var option=document.createElement("option");
//                	option.innerHTML="请选择分类";
//                	option.index=100;
//                	fenlei.appendChild(option);
                 for(var i= 0;i<cate.length;i++){
                	var dd=document.createElement("dd");
                	dd.innerHTML=cate[i].name;
                	dd.index=i;
                	cateList.appendChild(dd);
                	
                	var option=document.createElement("option");
                	option.innerHTML=cate[i].name;
                	
                	fenlei.appendChild(option);
                 }
                  initViews();
                 
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
	    var cateId = -1;
	    var state = -1;
	    
	    function  initViews(){
	    var dds =	cateList.getElementsByTagName("dd");
	    var dds1 =	goodsState.getElementsByTagName("dd");
		  
	    for(var i= 0; i<dds.length;i++){
		    	dds[i].index=i-1;
		    	dds[i].onclick=function(){
		    		
		    		for(var j= 0; j<dds.length;j++){
		    			dds[j].className="";
		    		}
		    		
		    		dds[this.index+1].className="active";
		    		 if(this.index==-1){
		    			 cateId=-1;
		    		 }else{
		    			 cateId=cate[this.index].cateId;
		    		 }
		    		 queryGoods();
		    	}
		    }
	    for(var i= 0; i<dds1.length;i++){
		    	dds1[i].index=i-1;
		    	dds1[i].onclick=function(){
		    		
		    		for(var j= 0; j<dds1.length;j++){
		    			dds1[j].className="";
		    		}
		    		
		    		dds1[this.index+1].className="active";
		    		state=this.index;
		    		queryGoods();
		    	}
		    }
	    
	    
	    
	       }
	   var  goodsList =document.getElementById("goodsList");
	 function queryGoods(){
		 
		 	   	$.ajax({
			//提交数据的类型 POST GET
			type:"POST",
			//提交的网址
			url:"http://localhost:8080/huotui/admin/queryGoods.do",
			//提交的数据
			data:{cateId:cateId,state:state},
			//返回数据的格式
			datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
			//在请求之前调用的函数
			//beforeSend:function(){$("#msg").html("logining");},
			//成功返回之后调用的函数             
			success:function(data){
					var json=$.parseJSON(data); 
                  var goodses=  json.data;
                  goodsList.innerHTML="";  
                   
                  for(var i=0;i<goodses.length;i++){
                	  var goodsItemTr=document.createElement("tr");
                	  var td1=document.createElement("td");
                	  td1.innerHTML=goodses[i].goodsName;
                	  var td2=document.createElement("td");
                	  td2.innerHTML=(goodses[i].standar/100)+"元/500克";
                	  var td3=document.createElement("td");
                	   td3.innerHTML=goodses[i].weight;
                	  var td4=document.createElement("td");
                	  
                	  var span4=document.createElement("span");
                	  span4.innerHTML="查看详情";
                	  span4.index=goodses[i].gid;
                	  span4.onclick=function (){
                		 
                		  getGoodsDetail(this.index);
                	  }
                	
                	  
                	  td4.appendChild(span4);
                	  
                	  
                	  goodsItemTr.appendChild(td1);
                	  goodsItemTr.appendChild(td2);
                	  goodsItemTr.appendChild(td3);
                	  goodsItemTr.appendChild(td4);
                	  
                	  goodsList.appendChild(goodsItemTr);
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
	 queryGoods();
	 var newGoodsWin=document.getElementById("newGoodsWin");
	 
	
	 
	 var closeWin=document.getElementById("closeWin");
	
	 closeWin.onclick=function (){
			 newGoodsWin.style.display="none";
		 }
	 
	           var goodsName=document.getElementById("goodsName");
	           var price=document.getElementById("price");
	           var num=document.getElementById("num");
	           var marketPrice=document.getElementById("marketPrice");
	           var weight=document.getElementById("weight");
	           var guige=document.getElementById("guige");
	           var marketGuige=document.getElementById("marketGuige");
	           var miaoshu=document.getElementById("miaoshu");
	           var tijiao=document.getElementById("tijiao");
	           var tips=document.getElementById("tips");
	           var yunfei=document.getElementById("yunfei");
	           var yunfeishuoming=document.getElementById("yunfeishuoming");
	    
	           
	 tijiao.onclick=function (){
	        	   
	        	    var optios= fenlei.getElementsByTagName("option");
	        	  var optionChosenIndex=0;
	        	
	        	  for(var i=0;i<optios.length;i++){
	        		
		        		  if(optios[i].selected){
		        	        alert(optios[i].index);
		        		 }
	        	   }
	        	  
	        	  if(optionChosenIndex==0){
	        		  tips.innerHTML="请选择分类";
	        		  tips.style.display="block";
	        	  }
	        	  var cateIdChosen=cateList[optionChosenIndex].cateId;
	        	  
	        	   
	        	 if(goodsName.value==""){
	        		 tips.innerHTML="请输入商品名";
	        		 tips.style.display="block";
	        		 return;
	        	 }  
	        	 if(price.value==""){
	        		 tips.innerHTML="请输入商品商城价格";
	        		 tips.style.display="block";
	        		 return;
	        	 }  
	        	 if(num.value==""){
	        		 tips.innerHTML="请输入商品库存量";
	        		 tips.style.display="block";
	        		 return;
	        	 }  
	        	 if(marketPrice.value==""){
	        		 tips.innerHTML="请输入商品市场价格";
	        		 tips.style.display="block";
	        		 return;
	        	 }  
	        	 if(weight.value==""){
	        		 tips.innerHTML="请输入商品重量";
	        		 tips.style.display="block";
	        		 return;
	        	 } 
	        	  if(guige.value==""){
	        		 tips.innerHTML="请输入商品商城规格";
	        		 tips.style.display="block";
	        		 return;
	        	 }
	        	  if(marketGuige.value==""){
	        		 tips.innerHTML="请输入商品市场规格";
	        		 tips.style.display="block";
	        		 return;
	        	 }
	        	   if(miaoshu.value==""){
	        		 tips.innerHTML="请输入商品描述";
	        		 tips.style.display="block";
	        		 return;
	        	 }
	        	   if(yunfei.value==""){
	        		 tips.innerHTML="请输入运费";
	        		 tips.style.display="block";
	        		 return;
	        	 }
	        	   if(yunfeishuoming.value==""){
	        		 tips.innerHTML="请输入运费说明";
	        		 tips.style.display="block";
	        		 return;
	        	 }
	        	   if(miaoshu.value==""){
	        		 tips.innerHTML="请输入商品描述";
	        		 tips.style.display="block";
	        		 return;
	        	 }
	        	
	      	$.ajax({
			//提交数据的类型 POST GET
			type:"POST",
			//提交的网址
			url:"http://localhost:8080/huotui/admin/queryGoods.do",
			//提交的数据
			data:{ cateId:cateIdChosen,
	      		   goodsName:goodsName.value,
	      		   price:price.value,
	      		   num:num.value,
                   trueprice:marketPrice.value,
                   weight:weight.value,
                   standar:guige.value,
                   truestandar:marketGuige.value,
                   yunfei:yunfei.value,
                   yunfeiText:yunfeishuoming.value,
                   discrible:miaoshu.value,
               },
			//返回数据的格式
			datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
			//在请求之前调用的函数
			//beforeSend:function(){$("#msg").html("logining");},
			//成功返回之后调用的函数             
			success:function(data){
					var json=$.parseJSON(data); 
                   console.log(json.data);
                  
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
	 var fenlei=document.getElementById("fenlei");
     var goodsName=document.getElementById("goodsName");
     var price=document.getElementById("price");
     var num=document.getElementById("num");
     var marketPrice=document.getElementById("marketPrice");
     var weight=document.getElementById("weight");
     var guige=document.getElementById("guige");
     var marketGuige=document.getElementById("marketGuige");
     var miaoshu=document.getElementById("miaoshu");
     var tijiao=document.getElementById("tijiao");
     var tips=document.getElementById("tips");
     var yunfei=document.getElementById("yunfei");
     var yunfeishuoming=document.getElementById("yunfeishuoming");
	
     function  getGoodsDetail(gid){
   		
		 newGoodsWin.style.display="block";
   		
   	}
	  
}