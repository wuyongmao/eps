$(function() {
	$("#loginbtn").click(function() {
		var acc = $("#ACC").val();
		var pwd = $("#PWD").val();
		$.ajax({
			type : "POST",
			timeout : 10000, //超时时间设置，单位毫秒       1000ms=1s
			dataType : 'json', //返回的数据格式
			data : $('#loginform').serialize(),
			url : "/eps/users/checklogin1",
			complete : function(XMLHttpRequest, status) {
				if (status == 'timeout') //超时,status还有success,error等值的情况
				{
					alert("超时");
				}
			},
			success : function(msg) {
				if (msg.code == 100) {
					window.open('welcome.jsp', '_self', '');

				} else {
					$("#hidden").show();

				}

			}
		});

		//window.open('index.jsp','_self','');
	});
	$("form").keydown(function(event) {
		if (event.keyCode == "13") {
			$("#loginbtn").click();
		}
	});

	$("#reset").click(function() {
		$("#ACC").val("");
		$("#PWD").val("");
		$("#hidden").hide();

	});

});

function regist() {

	window.open('regist.jsp', '_self', '');

};

