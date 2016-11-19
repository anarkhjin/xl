Ext.namespace("DesignConfig");

var plPersonalCenter = new Ext.TabPanel({
	id : 'plPersonalCenter',
	activeTab : 0,
	width : 1500,
	height : 1200,
	plain : true,
    hidden: true,
	defaults : {
		autoScroll : true 
	},
	items : [ {
		title : '个人信息',
		autoLoad : Context.getURL() + '/html/pmessage.html'
	}, {
		title : '修改密码',
		autoLoad : '/html/cpassword.html'
	} ]
});

var cm = new Ext.grid.ColumnModel([
		                	         new Ext.grid.RowNumberer(),//排序
		                	         new Ext.grid.CheckboxSelectionModel(),//复选框
		                	         {header:'日志详情',dataIndex:'descn',width:200,sortable:true,renderer:renderDescn},
		                	 	     {header:'日期',dataIndex:'date',type:'date',renderer:Ext.util.Format.dateRenderer('Y年m月d日')}
		                	]);
var store = new Ext.data.Store({
	autoLoad: true,//自动加载
	proxy : new Ext.data.HttpProxy({ //用于远程获取数据
	url:'http://localhost:8080/Practice/jsp/3.9.2_Grid.jsp'
	}),
	reader : new Ext.data.JsonReader({
		totalProperty : 'totalProperty',
		root : 'root'
	}, [ {name : 'id'}, 
	     {name : 'sex'}, 
	     {name : 'name'}, 
	     {name : 'descn'},
	     {name : 'date'}
	   ]),
	   remoteSort:true
});

var bbar = new Ext.PagingToolbar({
	pagesize:2,
	store:new Ext.data.Store({
		proxy : new Ext.data.HttpProxy({ //用于远程
			url:'http://localhost:8080/Practice/jsp/3.9.2_Grid.jsp'
		}),
		reader : new Ext.data.JsonReader({
			totalProperty : 'totalProperty',
			root : 'root'
		}, [ {name : 'id'}, 
		     {name : 'sex'}, 
		     {name : 'name'}, 
		     {name : 'descn'},
		     {name : 'date'}
		   ]),
		   remoteSort:true
	}),
	displayInfo:true,
	displayMsg:'显示第{0}条到第{1}条记录，一共{2}条',
	emptyMsg:'没有记录'
});

var tabPlDailyDairy = new Ext.TabPanel({
	id : 'tabPlDailyDairy',
    activeTab: 0,
    width:1500,
    height:1200,
    plain:true,
    hidden: true,
    defaults:{autoScroll: true},
    items:[
        new Ext.Panel({
		id:'rzlb',
		title:'日志列表',
		layout:'column',
		items:[
		       new Ext.grid.GridPanel({
					id: 'rizhiGridPanel',
					width:500,
					autoHeight:true,
					store:store,
					cm:cm,
					bbar:bbar
	}),new Ext.Panel({
		id:'rzright',
		title:'rzright',
		layout:'column',//让其成列的形式
		style:'margin-left:20px',
		defaults:{baseCls:"X-plain"},
		width:300,
		height:400,
		frame:true,
		items:[new Ext.FormPanel({
	        header: false,
	        border: false,
	        width: 250,
	        height: 26,
	        x:156,
	        items: [new Ext.form.DateField({
	            id: 'ssrz',
	            width: 140,
	            height: 26,
	            fieldLabel: '搜索日志',
	            style: {
	                fontSize: '14px'
	            },
	            labelStyle: 'font-weight:bold;font-size:16px;'
	        })]
	    }),new Ext.Button({
			id:'cx',
			text:'查询',
			handler:function(){
				alert("查询");
			}
		})]
	})]
}),new Ext.Panel({
	id:'xrz',
	title:'新日志',
	items:new Ext.FormPanel({
		width:600,
		frame:true,
		layout:'form',
		labelAlign:'top',
        items: [{
			xtype:'htmleditor',
			fieldLabel:'在线编辑',
			id:'editor',
			anchor:'98%'
		}],
		buttons:[{
			text:'保存',
			handler:function(){
				alert("保存？");
			}
		},{
			text:'取消',
			handler:function(){
				
			}
		}
		]
    })
})]
});

var tabPlProblemCheck = new Ext.TabPanel({
	id : 'tabPlProblemCheck',
    activeTab: 0,
    width:1500,
    height:1200,
    plain:true,
    hidden: true,
    defaults:{autoScroll: true},
    items:[
        new Ext.Panel({
			id:'wtp',
			title:'问题票',
			html:'这就是问题票的内容',
			items:[new Ext.grid.GridPanel({
				id:'wtpGridPanel',
				frame:true,
				width:500,
				autoHeight:true,
				store:new Ext.data.Store({
					autoLoad: true,//自动加载
					proxy : new Ext.data.HttpProxy({ //用于远程
						url:'http://localhost:8080/Practice/jsp/3.9.21_Grid.jsp'
					}),
					reader : new Ext.data.JsonReader({
						totalProperty : 'totalProperty',
						root : 'root'
					}, [ {name : 'id'}, 
					     {name : 'sex'}, 
					     {name : 'name'}, 
					     {name : 'descnwt'},
					     {name : 'date'}
					   ]),
					   remoteSort:true
				}),
				cm:new Ext.grid.ColumnModel([
				                    	     new Ext.grid.RowNumberer(),//排序
				                    	     new Ext.grid.CheckboxSelectionModel(),//复选框
				                    	     {header:'所出问题',dataIndex:'descnwt',width:200,sortable:true,renderer:renderDescn},
				                    	     {header:'日期',dataIndex:'date',type:'date',renderer:Ext.util.Format.dateRenderer('Y年m月d日')}
				                      	]),
				//sm:new Ext.grid.CheckboxSelectionModel(),
				bbar:new Ext.PagingToolbar({
					pagesize:2,
					store:new Ext.data.Store({
						proxy : new Ext.data.HttpProxy({ //用于远程
							url:'http://localhost:8080/Practice/jsp/3.9.21_Grid.jsp'
						}),
						reader : new Ext.data.JsonReader({
							totalProperty : 'totalProperty',
							root : 'root'
						}, [ {name : 'id'}, 
						     {name : 'sex'}, 
						     {name : 'name'}, 
						     {name : 'descnwt'},
						     {name : 'date'}
						   ]),
						   remoteSort:true
					}),
					displayInfo:true,
					displayMsg:'显示第{0}条到第{1}条记录，一共{2}条',
					emptyMsg:'没有记录'
				}),
				stripeRows:true,//让隔行显示颜色不同
				buttons:[{
					text:'修改',
				},{
					text:'取消'
				}],
			})
			]
		})
    ]
})


var designCenter = new Ext.Panel({// -------------展示各种页面的panel---------->>>>>>>>>>>>>>>>>>>
	id : 'designCenter',
	region : 'center',
	title : '',
	layout : 'absolute',
	items : [plPersonalCenter, tabPlDailyDairy, tabPlProblemCheck],
	listeners: {
		'render' :　function(p) {
			plPersonalCenter.setVisible(true);
		}
	}
});

function renderDescn(value,cellmeta,record,rowIndex,columnIndex,store){
	//alert(value);
	var str = "<input type='button' value='查看详细信息' onclick='alert(\" "+ "这个单元格的值是:" + value +"\\n" + 
	 "这个单元的配置是：{cellId:" + cellmeta.cellId +",id:"+ cellmeta.id +",css:"+ cellmeta.css +"}\\n" +
	 "这个单元格对应的record是：" + record.data["id"] + "," + "一行数据都在这里边\\n" +
	 "这是第"+ rowIndex +"行\\n" +
	 "这是第"+ columnIndex +"列\\n" + 
	 "这个表格对应Ext.data.store在这里："+ store +",可用。"
	
	+" \")'/>";
	return str;
}