
window.onload=function(){
	
	var orderAddList = document.getElementById("orderAddList");
	var orderAddListItems =orderAddList.getElementsByTagName("li");
		
	
	for(var i =0 ;i<orderAddListItems.length;i++){
		
		orderAddListItems[i].index=i;
		
		orderAddListItems[i].onclick=function(){
		
			
			for(var j =0 ;j<orderAddListItems.length;j++){
				orderAddListItems[j].className="";
			 }
			
			orderAddListItems[this.index].className="active";
		}
	}
	
	var submitOrder=document.getElementById("submitOrder");
	submitOrder.onclick=function(){
		
		
		   var index=-1;
			for(var j =0 ;j<orderAddListItems.length;j++){
				if(orderAddListItems[j].className=="active"){
					
					index=orderAddListItems[j].index
				}
				
			 }
			alert(index);
	}
}

