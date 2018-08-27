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

LODOP.SET_PRINT_PAGESIZE(1,900,1130,"");



for (j = 1; j < 8; j++) {
LODOP.NewPage();
//LODOP.ADD_PRINT_HTML(1,160,149,149,"<img border='0' src='" +src+ "' width='145' height='145' />");
LODOP.SET_PRINT_STYLE("Bold",1);
LODOP.SET_PRINT_STYLE("FontSize",7.5);
LODOP.ADD_PRINT_TEXT(15,2,37,10,"品名:");
LODOP.SET_PRINT_STYLE("Bold",1);
LODOP.ADD_PRINT_TEXT(15,30,135,140,"${wxb["PMN041"]}");
LODOP.SET_PRINT_STYLE("Bold",1);
LODOP.SET_PRINT_STYLE("Bold",1);
LODOP.ADD_PRINT_TEXT(155,5,40,10,"箱号:");
LODOP.ADD_PRINT_TEXT(155,31,140,10,"${wxb["WXB05"]}");
LODOP.ADD_PRINT_TEXT(155,168,40,10,"日期:");
LODOP.ADD_PRINT_TEXT(152,198,145,10,"${wxb["WXB07"]}");

LODOP.ADD_PRINT_RECT(152,160,144,44,0,1);

LODOP.ADD_PRINT_TEXT(170,5,50,10,"订单号:");
LODOP.ADD_PRINT_TEXT(170,38,100,10,"${wxb["WXB01"]}");
LODOP.ADD_PRINT_TEXT(170,138,10,10,"${wxb["WXB02"]}");
LODOP.ADD_PRINT_TEXT(170,168,40,10,'单位:');
LODOP.ADD_PRINT_TEXT(170,198,45,10,'${wxb["PMN07"]}');


LODOP.ADD_PRINT_TEXT(185,5,40,10,"色号:");
LODOP.ADD_PRINT_TEXT(185,31,145,10,"${wxb["WXB06"]}");
 LODOP.ADD_PRINT_TEXT(185,168,40,10,"缸号:");
LODOP.ADD_PRINT_TEXT(185,198,145,10,"${wxb["WXB04"]}");


LODOP.ADD_PRINT_TEXT(200,5,50,10,"净重:");
LODOP.ADD_PRINT_TEXT(200,38,60,10,"${wxb["WXB08"]}");
LODOP.ADD_PRINT_TEXT(200,110,50,10,"毛重:");
LODOP.ADD_PRINT_TEXT(200,138,60,10,"${wxb["WXB09"]}"); 
 
LODOP.ADD_PRINT_TEXT(200,200,40,10,'管数:');
LODOP.ADD_PRINT_TEXT(200,230,60,10,'${wxb["WXB10"]}');
LODOP.ADD_PRINT_TEXT(215,5,40,10,'规格:');
LODOP.ADD_PRINT_TEXT(215,45,160,10,'${wxb["IMA021"]}');   
 LODOP.ADD_PRINT_TEXT(230,5,40,10,'颜色:');
LODOP.ADD_PRINT_TEXT(230,35,270,210,"${wxb["YS"]}");
 


LODOP.ADD_PRINT_RECT(340,5,299,1,0,1);
LODOP.ADD_PRINT_TEXT(343,10,40,10,"SIZE");

LODOP.ADD_PRINT_RECT(355,5,299,1,0,1);

LODOP.ADD_PRINT_TEXT(360,15,40,10,"左");
LODOP.ADD_PRINT_RECT(370,5,299,1,0,1);

LODOP.ADD_PRINT_TEXT(375,15,40,10,"右");
LODOP.ADD_PRINT_RECT(385,5,299,1,0,1);



LODOP.ADD_PRINT_RECT(341,35,1,44,0,1);

LODOP.ADD_PRINT_RECT(152,3,301,30,0,1);

LODOP.ADD_PRINT_RECT(168,3,301,28,0,1); 
LODOP.ADD_PRINT_RECT(196,3,301,16,0,1); 
LODOP.ADD_PRINT_RECT(212,3,301,16,0,1);
LODOP.ADD_PRINT_RECT(228,3,301,157,0,1);
  
		for (var i= 1; i < 3; i++) {
		LODOP.ADD_PRINT_TEXT(343,10+30*i,40,10,i+2+"T");
		LODOP.ADD_PRINT_TEXT(360,10+30*i,40,10,"100");
		LODOP.ADD_PRINT_TEXT(375,10+30*i,40,10,"100");
		LODOP.ADD_PRINT_RECT(341,35+30*i,1,44,0,1);
		}
}





};  
  
  
</script>
  
</div>


</body>
</html>