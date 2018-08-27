var editIndex = undefined;
var singleflag = {
	"flag" : false
};
function endEditing() {
	if (editIndex == undefined) {
		return true;
	}
	;
	if ($('#dialog_m_dataGrid_size').datagrid('validateRow', editIndex)) {
		$('#dialog_m_dataGrid_size').datagrid('endEdit', editIndex);
		editIndex = undefined;
		return true;
	} else {
		return false;
	}
}
function onClickCell(index, field) {
	selectedrow = $('#dialog_m_dataGrid_size').datagrid('getData').rows[index];

	//alert(field);

	if (editIndex != index) {
		if (endEditing()) {
			$('#dialog_m_dataGrid_size').datagrid('selectRow', index).datagrid('beginEdit', index);
			var ed = $('#dialog_m_dataGrid_size').datagrid('getEditor', {
				index : index,
				field : field
			});
			if (ed) {
				($(ed.target).data('textbox') ? $(ed.target).textbox('textbox') : $(ed.target)).focus();
			}
			editIndex = index;
		} else {
			setTimeout(function() {
				$('#dialog_m_dataGrid_size').datagrid('selectRow', editIndex);
			}, 0);
		}
	}
}
function onEndEdit(index, row) {
	var ed = $(this).datagrid('getEditor', {
		index : index,
		field : 'PMN01'
	});

	//row.productname = $(ed.target).combobox('getText');
}
function append() {
	if (endEditing()) {
		$('#dialog_m_dataGrid_size').datagrid('appendRow', {
			status : 'P'
		});
		editIndex = $('#dialog_m_dataGrid_size').datagrid('getRows').length - 1;
		$('#dialog_m_dataGrid_size').datagrid('selectRow', editIndex).datagrid('beginEdit', editIndex);
	}
}
function removeit() {
	if (editIndex == undefined) {
		return;
	}
	;
	$('#dialog_m_dataGrid_size').datagrid('cancelEdit', editIndex).datagrid('deleteRow', editIndex);
	editIndex = undefined;
}

function timetrans() {
	var date = new Date(); //如果date为13位不需要乘1000
	var Y = date.getFullYear() + '-';
	var M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
	var D = (date.getDate() < 10 ? '0' + (date.getDate()) : date.getDate()) + ' ';
	var h = (date.getHours() < 10 ? '0' + date.getHours() : date.getHours()) + ':';
	var m = (date.getMinutes() < 10 ? '0' + date.getMinutes() : date.getMinutes()) + ':';
	var s = (date.getSeconds() < 10 ? '0' + date.getSeconds() : date.getSeconds());
	return Y + M + D;
}

function accept() {
	if (endEditing()) {
		if ($('#dialog_m_dataGrid_size').datagrid('getChanges').length > 0) {

			var row = {};
			if ($('#dialog_m_dataGrid_size').datagrid('getChanges', "inserted").length) {
				/* 新增 */
				row = $('#dialog_m_dataGrid_size').datagrid('getChanges', "inserted");
				$('#dialog_m_dataGrid_size').datagrid('acceptChanges');
				acceptdata("insert", row);
			}

			if ($('#dialog_m_dataGrid_size').datagrid('getChanges', "updated").length) {
				/* 新增 */
				row = $('#dialog_m_dataGrid_size').datagrid('getChanges', "updated");
				$('#dialog_m_dataGrid_size').datagrid('acceptChanges');
				acceptdata("update", row);

			}

		}

	}
}
function reject() {
	$('#dialog_m_dataGrid_size').datagrid('rejectChanges');
	editIndex = undefined;
}
function getChanges() {
	var rows = $('#dialog_m_dataGrid_size').datagrid('getChanges');
	alert(rows.length + ' rows are changed!');
}