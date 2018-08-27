/**
 *   初始化栏位  --------》来料目测矩阵
 */
initcolumn = function() {
	return [
				{
					"field" : "ck",
					checkbox : true
				},
	        	
		        {
		        	"field" : "DELLOTMIN",
		    		"title" : "来料下限",
		    		"width" : 140,
		    		"sortable" : true,
		    		"align" : 'right',
		    		"halign": 'center'
		        },
		        
		        {
		        	"field" : "DELLOTMAX",
		    		"title" : "来料上限",
		    		"width" : 140,
		    		"sortable":true,
		    		"align" : 'right',
		    		"halign": 'center'
		        },
		        
		        {
		        	"field" : "SAMPLES",
		    		"title" : "样本数量",
		    		"width" : 140,
		    		"sortable":true,
		    		"align" : 'right',
		    		"halign": 'center'
		        },
		        
		        {
		        	"field" : "AC",
		    		"title" : "接受箱数",
		    		"width" : 140,
		    		"sortable":true,
		    		"align" : 'right',
		    		"halign": 'center'
		        },
		        
		        {
		        	"field" : "RE",
		    		"title" : "拒绝箱数",
		    		"width" : 140,
		    		"sortable":true,
		    		"align" : 'right',
		    		"halign": 'center'
		        },
		        
		        {
		        	"field" : "INPUTTER",
		    		"title" : "建立者",
		    		"width" : 140,
		    		"sortable":true,
		    		"halign": 'center'
		        },
		        
		        {
		        	"field" : "INPUTDATE",
		    		"title" : "建立时间",
		    		"width" : 140,
		    		"sortable":true,
		    		"halign": 'center'
		        },

	        	{
	        		"field" : "REGULATIONID",
		    		"title" : "id",
		    		"width" : 140,
		    		"hidden" : true
	        	}
	       ]
}