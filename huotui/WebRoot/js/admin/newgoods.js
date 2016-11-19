window.onload=function(){
   
   var user ={};
   var goods ={};
   var imgs =[];
   var cate =[];
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
                   
                 for(var i= 0;i<cate.length;i++){
                	
                	var option=document.createElement("option");
                	option.innerHTML=cate[i].name;
                	
                	fenlei.appendChild(option);
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
	    var cateId = -1;
	    var state = -1;
	    
	   
	 
	 
	 var newGoodsWin=document.getElementById("newGoodsWin");
	 
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
	        	      
	        			  optionChosenIndex=i;
	        		 
	        		  }
	        	   }
	        	  
	        	  if(optionChosenIndex-1<0){
	        		  tips.innerHTML="请选择分类";
	        		  tips.style.display="block";
	        		   return;
	        	  }
	        	  var cateIdChosen=cate[optionChosenIndex-1].cateId;
	        	  
	        	   
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
	        	if(goods.gid>0){
	        		
	        		$.ajax({
			//提交数据的类型 POST GET
			type:"POST",
			contentType:'application/x-www-form-urlencoded; charset=UTF-8',
			//提交的网址
			url:"http://localhost:8080/huotui/admin/updateGoods.do",
			//提交的数据
			data:{ 
	        	   gid:goods.gid,
	        	   sid:goods.sid,
	        	   uuid:goods.uuid,
	        	   cateId:cateIdChosen,
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
                   goods=json.data;
                   getGoodsImg();
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
	        		
	        }else{
	      //新增商品
	       $.ajax({
			//提交数据的类型 POST GET
			type:"POST",
			contentType:'application/x-www-form-urlencoded; charset=UTF-8',
			//提交的网址
			url:"http://localhost:8080/huotui/admin/saveGoods.do",
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
                  goods=json.data;
                  initZXXFILE();//初始化批量文件上传的相关东西
                   showUploadImg();
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
	function showUploadImg(){
		var content=document.getElementById("content")
		content.style.display="block";
		
	}; 
	//初始化文件上传的对象
function initZXXFILE(){
	var params = {
	fileInput: $("#fileImage").get(0),
	dragDrop: $("#fileDragArea").get(0),
	upButton: $("#fileSubmit").get(0),
	url: $("#uploadForm").attr("action"),
	gid: goods.gid,
	filter: function(files) {
		var arrFiles = [];
		for (var i = 0, file; file = files[i]; i++) {
			if (file.type.indexOf("image") == 0) {
				if (file.size >= 512000) {
					alert('您这张"'+ file.name +'"图片大小过大，应小于500k');	
				} else {
					arrFiles.push(file);	
				}			
			} else {
				alert('文件"' + file.name + '"不是图片。');	
			}
		}
		return arrFiles;
	},
	onSelect: function(files) {
		var html = '', i = 0;
		$("#preview").html('<div class="upload_loading"></div>');
		var funAppendImage = function() {
			file = files[i];
			if (file) {
				var reader = new FileReader()
				reader.onload = function(e) {
					html = html + '<div id="uploadList_'+ i +'" class="upload_append_list"><p><strong>' + file.name + '</strong>'+ 
						'<a href="javascript:" class="upload_delete" title="删除" data-index="'+ i +'">删除</a><br />' +
						'<img id="uploadImage_' + i + '" src="' + e.target.result + '" class="upload_image" /></p>'+ 
						'<span id="uploadProgress_' + i + '" class="upload_progress"></span>' +
					'</div>';
					
					i++;
					funAppendImage();
				}
				reader.readAsDataURL(file);
			} else {
				$("#preview").html(html);
				if (html) {
					//删除方法
					$(".upload_delete").click(function() {
						ZXXFILE.funDeleteFile(files[parseInt($(this).attr("data-index"))]);
						return false;	
					});
					//提交按钮显示
					$("#fileSubmit").show();	
				} else {
					//提交按钮隐藏
					$("#fileSubmit").hide();	
				}
			}
		};
		funAppendImage();		
	},
	onDelete: function(file) {
		$("#uploadList_" + file.index).fadeOut();
	},
	onDragOver: function() {
		$(this).addClass("upload_drag_hover");
	},
	onDragLeave: function() {
		$(this).removeClass("upload_drag_hover");
	},
	onProgress: function(file, loaded, total) {
		var eleProgress = $("#uploadProgress_" + file.index), percent = (loaded / total * 100).toFixed(2) + '%';
		eleProgress.show().html(percent);
	},
	onSuccess: function(file, response) {
		$("#uploadInf").append("<p>上传成功，图片地址是：" + response + "</p>");
	  getGoodsImg();
	},
	onFailure: function(file) {
		$("#uploadInf").append("<p>图片" + file.name + "上传失败！</p>");	
		$("#uploadImage_" + file.index).css("opacity", 0.2);
	},
	onComplete: function() {
		//提交按钮隐藏
		$("#fileSubmit").hide();
		//file控件value置空
		$("#fileImage").val("");
		$("#uploadInf").append("<p>当前图片全部上传完毕，可继续添加上传。</p>");
	}
};
	
ZXXFILE = $.extend(ZXXFILE, params);
ZXXFILE.init();
};
 var goodsImaList=document.getElementById("goodsImaList");
	  function getGoodsImg(){
		   $.ajax({
			//提交数据的类型 POST GET
			type:"POST",
			//提交的网址
			url:"http://localhost:8080/huotui/admin/goodsImgs.do",
			//提交的数据
			data:{ gid:goods.gid },
			//返回数据的格式
			datatype: "json",//"xml", "html", "script", "json", "jsonp", "text".
			//在请求之前调用的函数
			//beforeSend:function(){$("#msg").html("logining");},
			//成功返回之后调用的函数             
			success:function(data){
					var json=$.parseJSON(data); 
                    console.log(json.data);
                    imgs=json.data;
                  goodsImaList.innerHTML="";
                  for(var i =0 ;i<imgs.length;i++){
                	  var li1=document.createElement("li");
                	  var img=document.createElement("img");
                	  img.src="/huotui/"+imgs[i].url;
                	  li1.appendChild(img);
                	   goodsImaList.appendChild(li1);
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