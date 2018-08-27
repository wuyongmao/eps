<html>
<head>
<meta charset="UTF-8">
<style media="print">
@page {
	size: auto; /* auto is the initial value */
	margin: 0mm; /* this affects the margin in the printer settings */
}
</style>
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
	height: 35px;
	text-align: left;
	border: 1px solid #777777;
}

#con #ta_con tr:first-child {
	text-align: center;
}

#con #ta_con tr td:first-child1 {
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

.tg-us34 {
	width: 600px
}

.tg-us36 {
	width: 100px
}
</style>



<style type="text/css" id="style1">
#table1 td {
	border: 1px solid #777;
	font-size: 9pt;
}

#table1  th {
	border: 1px solid #777;
	font-size: 10pt;
	height: 18pt;
	text-align:center;
}
 
	

#table1  table {

                border-collapse: collapse; 
                
}

#table1  tr {
	border-bottom: 1px solid #FFF;
}

#table1  .trs .WXB01 {
     width: 90pt;
     height: 38pt;
     text-align:left;
     
}
#table1  .trs .PMN041 {
     width: 300pt;
     height: 38pt;
        word-break: break-word;
      text-align:left;            
}
#table1  .trs .WXB06 {
     width: 60pt;
     text-align:left;
     word-break: break-word; 
}
#table1  .trs .WXB09 {
     width: 60pt;
     text-align:right;
     word-break: break-word; 
}
#table1 .trs .PMN07 {
     width: 30pt;
      text-align:left;
     word-break: break-word; 
}
#table1 .trs .WXB05 {
     width: 60pt;
      text-align:right;
     word-break: break-word;
                
}
#table1 .trs .WXB02 {
     width: 60pt;
     text-align:right;
     word-break: break-word;
                
}

#table1 .trs .CQ {
     width: 60pt;
     text-align:right;
     word-break: break-word;
                
}
#table1 .trs .WXB04 {
     width: 80pt;
     text-align:right;
     word-break: break-word;
                
}

#table1 .trs .PMNUD05_DS {
     width: 30pt;
     text-align:left;
     word-break: break-word;
                
}

</style>

<script type="text/javascript" src="/eps/inc/easyui1.5/jquery.min.js"></script>
<script type="text/javascript" src="/eps/inc/js/qr.js"></script>
<script type="text/javascript"
	src="/eps/inc/jquery.tmpl/1.4.2/jquery.tmpl.min.js"></script>
<script language="javascript" src="/eps/inc/js/LodopFuncs.js"></script>

</head>

<body>

	<input onclick="printCnt()" value="打印" type="button" />

	<div id="main">

		<div id="title">${pmc.PMC081!}</div>
		<div id="atr">

			<table id="td_ad" align="center" width=100%>
				<tr>
					<td colspan="2">&nbsp;</td>
					<td colspan="2">&nbsp;</td>
					<td colspan="2" align="center">地址:${pmc.PMC091!}</td>
					<td rowspan="2"><div id="qr" align="right"
							style="padding: 5px"></div></td>

				</tr>

				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
					<td align="right">&nbsp;&nbsp;&nbsp;电话:${pmc.PMC10!}</td>
					<td align="left">&nbsp;&nbsp;&nbsp;传真:${pmc.PMC11!}</td>
				</tr>
			</table>
		</div>
		<div id="head">


			<div>
				<span style="font-size: 21px; margin-top: 15px; font-weight: bold">送货单</span>
			</div>
			<table id="ta_ti" class="ta_th">
				<tr>
					<td>客户: ${shd["PLANT"]!}</td>
					<td>出货单号: ${shd["SHD01"]!}</td>
					<td>日期:${shd["SHD02"]!}</td>
				</tr>
			</table>
		</div>
		<div id="con">
			<table id="ta_con" cellspacing="0">
				<tbody>
					<tr>
						<td style="border: 1px solid #777">采购单号</td>
						<td style="border: 1px solid #777" align="right">项次</td>
						<td style="border: 1px solid #777" class="tg-us34">材料名称</td>
						<td style="border: 1px solid #777">色号</td>

						<td style="border: 1px solid #777" align="right">数量</td>
						<td style="border: 1px solid #777">单位</td>
						<td style="border: 1px solid #777">缸号</td>
						<td style="border: 1px solid #777" align="right">箱数</td>
						<td style="border: 1px solid #777" align="right">抽样</td>

						<td style="border: 1px solid #777">季节</td>
					</tr>
					<#list shds as shdl>
					<tr>
						<td style="border: 1px solid #777">${shdl["WXB01"]!}</td>
						<td style="border: 1px solid #777" align="right">${shdl["WXB02"]!}</td>
						<td style="border: 1px solid #777">${shdl["PMN041"]!}</td>
						<td style="border: 1px solid #777">${shdl["WXB06"]!}</td>
						<td style="border: 1px solid #777" align="right">${shdl["WXB09"]!}</td>
						<td style="border: 1px solid #777">${shdl["PMN07"]!}</td>
						<td style="border: 1px solid #777">${shdl["WXB04"]!}</td>
						<td style="border: 1px solid #777" align="right">${shdl["WXB05"]!}</td>
						<td style="border: 1px solid #777" align="right">${shdl["CQ"]!}</td>

						<td style="border: 1px solid #777">${shdl["PMNUD05_DS"]!}</td>
					</tr>
					
					</#list> <#if shds?size<6 > <#assign sps=6 - shds?size > <#list
					1..sps as t>
					<tr>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
					</tr>
					</#list>
					<tr>
						<td style="border: 1px solid #777">合计:</td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
						<td style="border: 1px solid #777"></td>
					</tr>
 
					</#if>
  
				</tbody>
				<tfoot>
					<td style="border: 1px solid #777" colspan="10">备注:${shd["SHD08"]!}</td>
				</tfoot>
				<table>
					</div>
					<div id="signnote1">
						<table id="ta_fo" class="ta_th">
							<tr>
								<td>开单人:${shd["SHD03"]!}</td>
								<td>送货人:${shd["SHD04"]!}</td>
								<td>客户签收:</td>
							</tr>
						</table>
					</div>
					<br>

					</div>
					
			<div hidden="true" >  
 	<form id="form1">


				<table id="table1" cellspacing="0">
					<tbody>
						<tr class="trsh">
							<th  class="WXB01">单号/项次</th>
							<th class="PMN041">材料名称</th>
							<th class="WXB06">色号</th>
							<th class="WXB09">数量</th>
							<th class="PMN07">单位</th>
							<th class="WXB04">缸号</th>
							<th class="WXB05">箱数</th>
							<th class="CQ">抽样</th>
							<th class="PMNUD05_DS">季节</th>
						</tr>
						 <#list shds as shdl>
						<tr class="trs">
							<td class="WXB01"> ${shdl["WXB01"]!}/${shdl["WXB02"]!}</td>
							<td class="PMN041">${shdl["PMN041"]!} </td>
							<td class="WXB06"> ${shdl["WXB06"]!}</td>
							<td class="WXB09"> ${shdl["WXB09"]!}</td>
							<td class="PMN07"> ${shdl["PMN07"]!}</td>
							<td class="WXB04"> ${shdl["WXB04"]!}</td>
							<td class="WXB05"> ${shdl["WXB05"]!}</td>
							<td class="CQ"> ${shdl["CQ"]!}</td>
							<td class="PMNUD05_DS">${shdl["PMNUD05_DS"]!}</td>
							
							<#if shdl["PMN041"]?length gt 120>   
							 <#assign sps=1 >
							<#else> 
							 <#assign sps=3 >  
							</#if>


							
							
						</tr>
						</#list> 
						<#if shds?size<sps >
						
						  <#list 1..sps as t>
					<tr class="trs" >            
					     	<td class="WXB01"> </td>
							<td class="PMN041">  </td>
							<td class="WXB06">  </td>
							<td class="WXB09">  </td>
							<td class="PMN07">  </td>
							<td class="WXB04">  </td>
							<td class="WXB05">  </td>
							<td class="CQ">  </td>  
							<td class="PMNUD05_DS"> </td>
					</tr>
					</#list>
					
	
                    </#if>
                    					<tr class="trs">
							<td>合计:</td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td colspan="9">备注:${shd["SHD08"]!}</td>
						</tr>
					</tfoot>
				</table> 
			</form>
</div>


 <script type="text/javascript">
						o = {};

						var t = JSON.stringify(o);
						var qrcode = new QRCode('qr', {
							text : '${shd["SHD01"]!}',
							width : 99,
							height : 99,
							colorDark : '#000000',
							colorLight : '#ffffff',
							correctLevel : QRCode.CorrectLevel.H
						});

						function printCnt() {

							CreateOnePage();
							LODOP.SET_PRINT_MODE("PRINT_PAGE_PERCENT", "Auto-Width");
							LODOP.PREVIEW();

						}
						function CreateOnePage() {
						LODOP = getLodop();
			LODOP.SET_PRINT_MODE("POS_BASEON_PAPER", true);
			LODOP.SET_PRINT_PAGESIZE(1, 2140, 1400, "");
			LODOP.NewPage();
			LODOP.SET_PRINT_STYLE("Bold", 1);
			LODOP.SET_PRINT_STYLE("FontSize", 14);
			LODOP.SET_PRINT_STYLE("Alignment", 2)
			LODOP.ADD_PRINT_TEXT(20, 20, 800, 30, "${pmc.PMC081!}");
			src=$("#qr img").attr("src") ;
            LODOP.ADD_PRINT_HTML(15,680,'100%','100%',"<img border='0' src='" +src+ "'   height='100' />");
			LODOP.SET_PRINT_STYLE("Alignment", 1)
			LODOP.SET_PRINT_STYLE("FontSize", 9);
			LODOP.SET_PRINT_STYLE("Bold", 0);
			LODOP.ADD_PRINT_TEXT(40, 100, 50, 30, "地址:");
			LODOP.ADD_PRINT_TEXT(40, 128, 550, 50, "${pmc.PMC091!}");
			LODOP.ADD_PRINT_TEXT(60, 100, 50, 30, "电话：");
			LODOP.ADD_PRINT_TEXT(60, 128, 350, 30, "${pmc.PMC10!}");
			LODOP.ADD_PRINT_TEXT(60, 500, 54, 30, "传真:");
			LODOP.ADD_PRINT_TEXT(60, 530, 154, 30, "${pmc.PMC11!}");

			LODOP.SET_PRINT_STYLE("Bold", 1);
			LODOP.SET_PRINT_STYLE("FontSize", 13);
			LODOP.SET_PRINT_STYLE("Alignment", 2)
			LODOP.ADD_PRINT_TEXT(70, 20, 800, 30, "送货单");
			LODOP.SET_PRINT_STYLE("Alignment", 1)
			LODOP.SET_PRINT_STYLE("FontSize", 9);
			LODOP.SET_PRINT_STYLE("Bold", 0);

			LODOP.ADD_PRINT_TEXT(110, 20, 50, 30, "客户:");
			LODOP.ADD_PRINT_TEXT(110, 48, 150, 30, "${shd["PLANT"]!}");
			LODOP.ADD_PRINT_TEXT(110, 300, 70, 30, "出货单号:");
			LODOP.ADD_PRINT_TEXT(110, 354, 130, 30, "${shd["SHD01"]!}");
			LODOP.ADD_PRINT_TEXT(110, 580, 50, 30, "日期:");
			LODOP.ADD_PRINT_TEXT(110, 610, 80, 30, "${shd["SHD02"]!}");

			//	LODOP.ADD_PRINT_RECT(130, 20, 740, 300, 0, 1);

			var strBodyStyle = "<style>" + document.getElementById("style1").innerHTML + "</style>";
			var strFormHtml = strBodyStyle + "<body>" + $("#form1").html() + "</body>";

			LODOP.ADD_PRINT_TABLE(130, 20, 740, "100%", strFormHtml);
 

            LODOP.SET_PRINT_STYLE("Alignment",1)
            LODOP.ADD_PRINT_TEXT(490,40,800,30,'开单人:${shd["SHD03"]!}                             送货人:${shd["SHD04"]!}                             客户签收:');  
		    LODOP.SET_PRINT_STYLEA(0, "PageIndex", "Last"); 
			LODOP.PREVIEW(); 
			LODOP.SET_PREVIEW_WINDOW(0, 0, 0, 0, 0, "");
	 	};
</script>
</body>
</html>