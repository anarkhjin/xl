Ext.namespace("DesignConfig");

var designWest = new Ext.Panel({
	id : 'designWest',
	width : 300,
	title : '',
	region : 'west',
	layout: 'absolute',
	items : [ new Ext.Panel({
		id : 'headerPhoto',
		x : 50,
		y : 70,
		width : 200,
		height : 200,
		style : 'border: 1px solid red',
		html : '<img width="200" height="200" src="../../images/img1.png" />'
	}), new Ext.Button({
		id:'btnPersonCenter',
		x:50,
		y:270,
		width:200,
		height:50,
		text:'个人中心',
		listeners: {
			'click' : function() {
				Ext.getCmp('plPersonalCenter').setVisible(true);//显示
				Ext.getCmp('tabPlDailyDairy').setVisible(false);//隐藏
				Ext.getCmp('tabPlProblemCheck').setVisible(false);//隐藏
			}
		}
	}), new Ext.Button({
		id:'btnDailyDairy',
		x: 50,
		y: 320,
		width:200,
		height:50,
		text:'每日日志',
		listeners: {
			'click' : function() {
				Ext.getCmp('plPersonalCenter').setVisible(false);
				Ext.getCmp('tabPlDailyDairy').setVisible(true);
				Ext.getCmp('tabPlProblemCheck').setVisible(false);
			}
		}
	}), new Ext.Button({
		id:'btnProblemCheck',
		x:50,
		y:370, 
		width:200, 
		height:50,
		text:'查看问题',
		listeners: {
			'click' : function() {
				Ext.getCmp('plPersonalCenter').setVisible(false);  
				Ext.getCmp('tabPlDailyDairy').setVisible(false);
				Ext.getCmp('tabPlProblemCheck').setVisible(true);
			}
		}
	}) ]
});
