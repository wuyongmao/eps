<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
#main {
	width: 1000px;
	height1: 1000px;
	margin: auto;
}

#head {
	width: 1000px;
	height: 60px;
	text-align: center;
	margin-top: 30px;
}

#title {
	font-size: 24px;
	margin-top: 15px;
	text-align: center;
}

#head span {
	font-size: 21px;
	margin-top: 15px;
}

#atr {
	text-align: center;
}

#con {
	width: 1000px;
	height1: 250px;
	text-align: center;
	font-size: 20px;
	margin-top: 30px;
}

#con #ta_con {
	width: 800px height:100%;
 	border: 1px solid #777777;
}

.ta_th {
	width: 910px;
	height1: 1090px;
 	border: none;
}

#con #ta_con tr td {
	width: 300px;
	height: 35px;
	text-align: left;
	border: 1px solid #777777;
}

#con #ta_con tr:first-child {
	text-align: center;
}

#con #ta_con tr td:first-child1 {
	width1: 300px;
	height: 35px;
	text-align: left;
	border: 1px solid #777777;
}

#con #ta_con tr td:last-child1 {
	width: 500px;
	height: 35px;
	text-align: left;
	border: 1px solid #777777;
}

#signnote1 {
	width: 820px;
	text-align: center;
	margin: auto;
	font-size: 12px;
}

#signnote1 #signnote1_title {
	text-align: left;
	width: 820px;
}

#signnote1 tr td:first-child {
	width: 300px;
	height: 35px;
	text-align: left;
	border: 1px solid #777777;
}

#signnote1 tr td:last-child {
	width: 500px;
	height: 35px;
	text-align: left;
	border: 1px solid #777777;
}

#signimg {
	width: 800px;
	height: 200px;
	text-align: center;
	margin: auto;
}

#signimg #ta_signimg {
	float: right;
	font-size: 12px;
}

textArea {
	font-weight1: bold;
	font-size: 22px;
}

/*table tr first-child{width:200px; height:35px;}*/
</style>


<script type="text/javascript" src="/eps/inc/easyui1.5/jquery.min.js"></script>
<script type="text/javascript" src="/eps/inc/js/qr.js"></script>
<script type="text/javascript"
	src="/eps/inc/jquery.tmpl/1.4.2/jquery.tmpl.min.js"></script>

</head>

<body>
	<div id="main">
		<div id="title">${pmc.PMC081!}</div>
		<div id="atr">

			<table id="td_ad"   align="center" width=100%>
				<tr>
					<td colspan="2">&nbsp;</td>
					<td colspan="2">&nbsp;</td>
					<td colspan="2" align="center">地址：${pmc.PMC091!}</td>
					<td rowspan="2"><div id="qr"></div></td>

				</tr>

				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td align="right">&nbsp;&nbsp;&nbsp;电话：${pmc.PMC10!}</td>
					<td align="left">&nbsp;&nbsp;&nbsp;传真：${pmc.PMC11!}</td>
				</tr>
			</table>
		</div>
		<div id="head">


			<div>
				<span>送货单</span>
			</div>
			<table id="ta_ti" class="ta_th">
				<tr>
					<td>客户：</td>
					<td>出货单号： ${shd["SHD01"]!}</td>
					<td>日期：${shd["SHD02"]!}</td>
				</tr>
			</table>
		</div>
		<div id="con">
			<table id="ta_con" cellspacing="0">
				<tbody>
					<tr>
						<td>采购单号</td>
						<td  align="right" >采购项次</td>
						<td>材料名称</td>
						<td>色号</td>
						<td>颜色</td>
						<td align="right">数量</td>
						<td>单位</td>
						<td>缸号</td>
						<td align="right">箱数</td>
						<td>季节</td>
					</tr>
					<#list shds as shdl>
					<tr>
						<td>${shdl["WXB01"]!} </td>
						<td align="right">${shdl["WXB02"]!}</td>
						<td>${shdl["PMN041"]!}</td>
						<td>${shdl["WXB06"]!}</td>
						<td>${shdl["YS"]!}</td>
						<td align="right">${shdl["WXB09"]!}</td>
						<td>${shdl["PMN07"]!}</td>
						<td>${shdl["WXB04"]!}</td>
						<td align="right">${shdl["WXB05"]!}</td>
						<td>${shdl["PMNUD05_DS"]!}</td>
					</tr>
					</#list>
					<#if shds?size<6 >  
                      <#assign sps=6 - shds?size >
					<#list 1..sps as t>
                       <tr>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
                    </#list>
				  <tr>
						<td>合计:</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					
					
                    </#if>  
					
					
		 			 
					
		  
				</tbody>
				<tfoot>
					<td colspan="10">备注：</td>
				</tfoot>
				<table>
					</div>
					<div id="signnote1">
						<table id="ta_fo" class="ta_th">
							<tr>
								<td>开单人：${shd["SHD03"]!}</td> 
								<td>送货人：${shd["SHD04"]!}</td>
								<td>客户签收：</td>
							</tr>
						</table>
					</div>
					<br>

					</div>

<script type="text/javascript">
o= {};
 

var t=JSON.stringify(o);
	var qrcode = new QRCode('qr', { 
		  text: 'HZ00012018042100', 
		  width: 70, 
		  height: 70, 
		  colorDark : '#000000', 
		  colorLight : '#ffffff', 
		  correctLevel : QRCode.CorrectLevel.H 
		}); 
   
</script>
</body>
</html>