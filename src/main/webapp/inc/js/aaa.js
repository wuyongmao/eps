function acceptdata(op, ob) {
	var row = {};

	var accepturl = '';
	if (op == 'insert') {
		accepturl = "/eps/wxb/addwxbsize";

	} else if (op == 'update') {

		accepturl = "/eps/wxb/updatewxbsize";
	}

	$.each(ob, function(i, n) {

		if (n.WXB01 != undefined) {
 
			row.WXB05 = n.WXB05;
			row.TC_RVBS01 = n.TC_RVBS01;
			row.TC_RVBS02 = n.TC_RVBS02;
			row.TC_RVBS03 = n.TC_RVBS03;
			row.TC_RVBS04 = n.TC_RVBS04;
			row.TC_RVBS06 = n.TC_RVBS06;
			row.TC_RVBS016 = n.TC_RVBS016;
			row.TC_RVBS017 = n.TC_RVBS017;  
			row.op = op;

			//----------------------------提交新增/更新
			$.ajax({
				url : accepturl,
				type : "POST",
				dataType : "json",
				data : n,
				async : false,
				success : function(data) {

					if (data.code == "100") {
						$.messager.show({
							title : '提示',
							msg : data.msg
						});

						row = {};
						$('#dialog_m_dataGrid_size').datagrid('reload');
					} else {
						$.messager.show({
							title : '提示',
							msg : data.msg
						});
					}
				}
			});
			//----------------------------

		}

	});
};