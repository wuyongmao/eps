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
<script language="javascript" src="/eps/inc/js/LodopFuncs.js"></script>

<input type="button" value="打印" id="printp"   />
<div id="div_demo"></div>
 
<script id="demo" type="text/x-jquery-tmpl">
<div id="ttable" style="width: 550px; height: 595px;">
	<table border="1" style="border-collapse: collapse; font-size: 10px">
		<colgroup>
			<col style="width: 180px">
			<col style="width: 120px">
			<col style="width: 60px">
		</colgroup>
		<tr>
			<td style="WORD-WRAP: break-word" width="300" class="tg-aoj8"
				rowspan="7">品名:${wxb["PMN041"]}</td>
			<td class="tg-0brl" colspan="2" rowspan="7"><div id="qr"></div></td>
		</tr>
		<tr>
		</tr>
		<tr>
		</tr>
		<tr>
		</tr>
		<tr>
		</tr>
		<tr>
		</tr>
		<tr>
		</tr>
		<tr>
			<td class="tg-aoj8" rowspan="2">规格: ${wxb["IMA021"]}</td>
			<td class="tg-aoj8" colspan="2">厂商:${wxb["PMMUD02"]}</td>
		</tr>
		<tr>
			<td class="tg-aoj8" colspan="2">料号:${wxb["PMN04"]}</td>
		</tr>
		<tr>
			<td class="tg-aoj8" rowspan="7">颜色:${wxb["YS"]}</td>
			<td class="tg-aoj8" colspan="2">色号:${wxb["WXB06"]}</td>
		</tr>
		<tr>
			<td class="tg-aoj8" colspan="2">缸号:${wxb["WXB04"]}</td>
		</tr>
		<tr>
			<td class="tg-aoj8" colspan="2">箱号:${wxb["WXB05"]}</td>
		</tr>

		<tr>
			<td class="tg-aoj8" colspan="2">日期:${wxb["WXB07"]}</td>
		</tr>
		<tr>
			<td class="tg-aoj8">单号:${wxb["WXB01"]}</td>
			<td class="tg-aoj8">项次:${wxb["WXB02"]}</td>
		</tr>
		<tr>
			<td class="tg-aoj8">毛重:${wxb["WXB08"]}</td>
			<td class="tg-aoj8">单位:${wxb["PMN07"]}</td>
		</tr>
		<tr>
			<td class="tg-aoj8">净重:${wxb["WXB09"]}</td>
			<td class="tg-aoj8">管数:${wxb["WXB10"]}</td>
		</tr>
		<tr>
			<td class="tg-akyt">size</td>
			<td class="tg-akyt"></td>
			<td class="tg-akyt"></td>
		</tr>
		<tr>
			<td class="tg-gzo9">左</td>
			<td class="tg-akyt"></td>
			<td class="tg-akyt"></td>
		</tr>
		<tr>
			<td class="tg-g5xs">右</td>
			<td class="tg-q19q"></td>
			<td class="tg-q19q"></td>
		</tr>
	</table>
</script>
<script type="text/javascript">
  
</script>



<script type="text/javascript">
o= {"WXB04" :"${wxb["WXB04"]}",
    "WXB05" :"${wxb["WXB05"]}",
    "WXB08" :'${wxb["WXB08"]}',
    "WXB09" :'${wxb["WXB09"]}',
    	"PMN04" : "${wxb["PMN04"]}" 
 
};
console.info(o);
$("#demo").tmpl(o).appendTo('#div_demo');
	$("#printp").on("click", function(){
		prn1_preview();
        		  
	});
var t=JSON.stringify(o);
	var qrcode = new QRCode('qr', { 
		  text: t, 
		  width: 260, 
		  height: 260, 
		  colorDark : '#000000', 
		  colorLight : '#ffffff', 
		  correctLevel : QRCode.CorrectLevel.H 
		}); 
function prn1_preview( ) {
		CreateOneFormPage( );
		LODOP.PREVIEW();
	};

	function CreateOneFormPage(  ) { 
		   src=$("img").attr("src") ;
LODOP.SET_PRINT_PAGESIZE(1,1000,1000,"");
for (j = 1; j < 3; j++) {
LODOP.NewPage();
LODOP.SET_PRINT_STYLE("Bold",1);
LODOP.SET_PRINT_STYLE("FontSize",7.5);

LODOP.ADD_PRINT_RECT(10,2,210,134,0,1);
LODOP.ADD_PRINT_TEXT(15,2,37,10,"品名:");
LODOP.ADD_PRINT_TEXT(15,30,194,140,"${wxb["PMN041"]}");

LODOP.ADD_PRINT_RECT(125,2,210,37,0,1);
LODOP.ADD_PRINT_TEXT(130,5,40,10,"料号:");
LODOP.ADD_PRINT_TEXT(130,45,80,10,"${wxb["PMN04"]}");
LODOP.ADD_PRINT_TEXT(130,150,40,10,"单位:");
LODOP.ADD_PRINT_TEXT(130,190,145,10,"${wxb["PMN07"]}");

 

LODOP.ADD_PRINT_TEXT(150,5,40,10,"订单号:");
LODOP.ADD_PRINT_TEXT(150,31,140,10,"${wxb["WXB01"]}");
LODOP.ADD_PRINT_TEXT(150,150,10,10,"${wxb["WXB02"]}");


LODOP.ADD_PRINT_RECT(162,2,370,40,0,1);
LODOP.ADD_PRINT_TEXT(170,5,50,10,"箱号:");
LODOP.ADD_PRINT_TEXT(170,38,100,10,"${wxb["WXB05"]}");
LODOP.ADD_PRINT_TEXT(170,220,40,10,"色号:");
LODOP.ADD_PRINT_TEXT(170,260,145,10,"${wxb["WXB06"]}");



LODOP.ADD_PRINT_RECT(185,2,370,39,0,1);
LODOP.ADD_PRINT_TEXT(190,5,40,10,"缸号:");
LODOP.ADD_PRINT_TEXT(190,31,145,10,"${wxb["WXB04"]}"); 
LODOP.ADD_PRINT_TEXT(190,220,40,10,"日期:");
LODOP.ADD_PRINT_TEXT(190,260,145,10,"${wxb["WXB07"]}");



LODOP.ADD_PRINT_TEXT(210,5,50,10,"净重:");
LODOP.ADD_PRINT_TEXT(210,38,60,10,"${wxb["WXB09"]}");
LODOP.ADD_PRINT_TEXT(210,110,50,10,"毛重:");
LODOP.ADD_PRINT_TEXT(210,138,60,10,"${wxb["WXB08"]}"); 
 
LODOP.ADD_PRINT_TEXT(210,220,40,10,'管数:');
LODOP.ADD_PRINT_TEXT(210,260,60,10,'${wxb["WXB10"]}');

LODOP.ADD_PRINT_RECT(223,2,370,141,0,1);
LODOP.ADD_PRINT_TEXT(230,5,40,10,'规格:');
LODOP.ADD_PRINT_TEXT(230,45,160,10,'${wxb["IMA021"]}');   
LODOP.ADD_PRINT_RECT(243,2,370,78,0,1);
LODOP.ADD_PRINT_TEXT(250,5,40,10,'颜色:');
LODOP.ADD_PRINT_TEXT(250,35,330,230,"${wxb["YS"]}");
 


LODOP.ADD_PRINT_RECT(320,2,370,1,0,1);
LODOP.ADD_PRINT_TEXT(323,10,40,10,"SIZE");

LODOP.ADD_PRINT_RECT(335,2,370,1,0,1);

LODOP.ADD_PRINT_TEXT(340,15,40,10,"左");
LODOP.ADD_PRINT_RECT(350,2,370,1,0,1);

LODOP.ADD_PRINT_TEXT(355,15,40,10,"右");
LODOP.ADD_PRINT_RECT(365,2,370,1,0,1);


LODOP.ADD_PRINT_HTML(10,215,150,150,"<img border='0'  src='data:image/png;base64,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' width='145' height='145' />");
 
LODOP.ADD_PRINT_RECT(321,35,1,44,0,1);
 
 
 
		for (var i= 1; i < 3; i++) {
		LODOP.ADD_PRINT_TEXT(323,10+30*i,40,10,i+2+"T");
		LODOP.ADD_PRINT_TEXT(340,10+30*i,40,10,"100");
		LODOP.ADD_PRINT_TEXT(355,10+30*i,40,10,"100");
		LODOP.ADD_PRINT_RECT(321,35+30*i,1,44,0,1);
		}
		
		
		
		
		
}




 



};  
  
  
</script>
  
</div>


</body>
</html>