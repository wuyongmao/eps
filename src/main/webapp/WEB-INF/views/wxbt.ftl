<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>外箱标</title>
<style type="text/css">
table {
	width: 100%;
   	TABLE-LAYOUT: fixed;
}

td {word-wrap：break-word;
 	 
}

td:nth-child(2n) {
	width: 60%
}
</style>
<meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no" />
<script type="text/javascript" src="/eps/inc/easyui1.5/jquery.min.js"></script>
<script type="text/javascript" src="/eps/inc/js/qr.js"></script>
<script type="text/javascript" src="/eps/inc/jquery.tmpl/1.4.2/jquery.tmpl.min.js"></script>

<div id="div_demo"></div>
 
<script id="demo" type="text/x-jquery-tmpl">
 <div id="ttable" style="width:550px; height:595px; ">
<table  border="1" bordercolor="#a0c6e5" style="border-collapse:collapse;"  > 
<tr><td><labal>厂商：</labal><span> ${wxb["PMMUD02"]} </span></td><td  rowspan="2"><labal>箱号：</labal><span> ${wxb["WXB05"]}</span></td></tr>
<tr><td><labal>料号：</labal><span> ${wxb["PMN04"]}</span></td> </tr>
<tr><td style="WORD-WRAP: break-word" width="100">规格：  ${wxb["IMA021"]}</td><td  rowspan="6"  align="center"  > <div id="qr"></div></td></tr>
<tr><td><labal>品名：</labal><span> ${wxb["PMN041"]}</span></td> </tr>
<tr><td><labal>色号：</labal><span> ${wxb["WXB06"]}</span></td></tr>
<tr><td><labal>缸号：</labal><span> ${wxb["WXB04"]}</span></td></tr>
<tr><td><labal>颜色/客户色号：</labal><span> ${wxb["YS"]}</span></td> </tr>
<tr><td><labal>日期：</labal><span> ${wxb["WXB07"]}</span></td> </tr>
<tr><td><labal>客户订单号：</labal><span> ${wxb["WXB01"]}</span></td><td><labal>项次：</labal><span> ${wxb["WXB02"]}</span></td></tr>
<tr><td><labal>毛重：</labal><span> ${wxb["WXB08"]}</span></td><td><labal>管数：</labal></td></tr>
<tr><td><labal>净重：</labal><span> ${wxb["WXB09"]}</span></td><td><labal>单位：</labal><span> ${wxb["WXB01"]}</span></td></tr>
<tr><td><labal>SIZE 合计：</labal></td><td></td></tr>
<tr><td><labal>&nbsp;&nbsp;左：</labal><span> ${wxb["TC_RVBS16"]}</span></td><td></td></tr>
<tr><td><labal>&nbsp;&nbsp;右：</labal><span> ${wxb["TC_RVBS17"]}</span></td><td></td></tr>
 　  
</table>
</script>
<script type="text/javascript">
  
</script>



<script type="text/javascript">
o= {};
$("#demo").tmpl(o).appendTo('#div_demo');

var t=JSON.stringify(o);
	var qrcode = new QRCode('qr', { 
		  text: '${wxb["WXB05"]}', 
		  width: 260, 
		  height: 260, 
		  colorDark : '#000000', 
		  colorLight : '#ffffff', 
		  correctLevel : QRCode.CorrectLevel.H 
		}); 
   
</script>
  
</div>


</body>
</html>