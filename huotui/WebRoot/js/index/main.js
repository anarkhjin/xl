Ext.namespace("DesignConfig");

function init(employeeId, name, position, telephone) {

	var mainPanel = new Ext.Panel({
		title:'',
		renderTo : Ext.getBody(),
		width : 1500, 
		height : 800, 
		layout:'border', 
		items:[
		       designNorth, designWest, designCenter
		]
	});
		
//	center1.on('activate',function(p){//方法的写法
//		//alert('8586');
//		this.removeAll();
//		this.add(grzx);
//		this.doLayout(true); 
//	});
	
}
