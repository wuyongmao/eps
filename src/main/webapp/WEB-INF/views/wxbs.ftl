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

td {word-wrap:break-word;
 	 
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
<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;}
.tg td{      width: 45% ; font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}
.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:black;}
.tg .tg-us36{border-color:inherit;vertical-align:top}
</style>
<#list wxbs as wxb>


<table class="tg">
  <tr>
    <td class="tg-us36" colspan="2">订单号:${wxb["WXB01"]!} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  ${wxb["WXB02"]!}<br></td>
    <td class="tg-us36" rowspan="8">  <div id="qr${wxb_index}"></div></td>
  </tr>
  <tr>
    <td class="tg-us36" >料号:${wxb["PMN04"]!}<br></td>
    <td class="tg-us36" >单位:${wxb["PMN07"]!}<br></td>
  </tr>
  <tr>
    <td class="tg-us36" colspan="2">缸号/季节:${wxb["WXB04"]!}</td>
  </tr>
  <tr>
    <td class="tg-us36" colspan="2">箱号:${wxb["WXB05"]!}</td>
  </tr>
  <tr>
    <td class="tg-us36" colspan="2">色号:${wxb["WXB06"]!}<br></td>
  </tr>
  <tr>
    <td class="tg-us36">净重/数量:${wxb["WXB09"]!}</td>
    <td class="tg-us36">毛重:${wxb["WXB08"]!}</td>
  </tr>
  <tr>
    <td class="tg-us36">管数:${wxb["WXB10"]!}</td>
    <td class="tg-us36">日期:${wxb["WXB07"]!}<br></td>
  </tr>
  <tr>
    <td class="tg-us36" colspan="2">规格:${wxb["IMA021"]!}</td>
  </tr>
  <tr>
    <td class="tg-us36">品名:<br></td>
    <td class="tg-us36" colspan="2">${wxb["PMN041"]!}</td>
  </tr>
</table>
	 
	<hr width=100% size=3 color=#5151A2 style="border:6 double green">
</#list>	
</script>
<script type="text/javascript">
  
</script>



<script type="text/javascript">
<#-- 

 
   -->
<#list wxbs as wxb>
o= { };
</#list>
console.info(o);
$("#demo").tmpl(o).appendTo('#div_demo');
	$("#printp").on("click", function(){
		prn1_preview();
        		  
	});
var t=JSON.stringify(o);

<#list wxbs as wxb>

o= {"W4" :"${wxb["WXB04"]!}", "W5" :"${wxb["WXB05"]!}", "W8" :
<#if wxb["WXB08"]??>
  ${wxb["WXB08"]!}
<#else>
  null
</#if>
 
,  "W9" :${wxb["WXB09"]!}, "W10" :<#if wxb["WXB10"]??>
  ${wxb["WXB10"]!}
<#else>
  null
</#if>, "P4" : "${wxb["PMN04"]!}", "P7" : "${wxb["PMN07"]!}"};

 

var t=JSON.stringify(o);

　 new QRCode('qr${wxb_index}', { 
		  text: t, 
		  width: 180, 
		  height: 180, 
		  colorDark : '#000000', 
		  colorLight : '#ffffff', 
		  correctLevel : QRCode.CorrectLevel.H 
　}); 
</#list>		
		
function prn1_preview( ) {
		CreateOneFormPage( );
		LODOP.PREVIEW();
	};

	function CreateOneFormPage(  ) { 
		  
LODOP.SET_PRINT_PAGESIZE(1,999,999,"");
<#list wxbs as wxb>
LODOP.NewPage();
LODOP.SET_PRINT_STYLE("Bold",1);
LODOP.SET_PRINT_STYLE("FontSize",7.5);
src=$("#qr${wxb_index} img").attr("src") ;
LODOP.ADD_PRINT_HTML(10,185,'100%','100%',"<img border='0' src='" +src+ "'  height='180' />");
LODOP.ADD_PRINT_RECT(6,3,181,40,0,1);
LODOP.ADD_PRINT_TEXT(10,5,50,10,"订单号:");
LODOP.ADD_PRINT_TEXT(10,45,140,10,"${wxb["WXB01"]!}");
LODOP.ADD_PRINT_TEXT(10,150,10,10,"${wxb["WXB02"]!}");
LODOP.ADD_PRINT_RECT(26,3,181,70,0,1);
LODOP.ADD_PRINT_TEXT(30,5,37,10,"料号:");
LODOP.ADD_PRINT_TEXT(30,35,90,10,"${wxb["PMN04"]!}"); 
LODOP.ADD_PRINT_TEXT(30,120,40,10,"单位:"); 
LODOP.ADD_PRINT_TEXT(30,150,75,10,"${wxb["PMN07"]!}"); 
 
  
LODOP.SET_PRINT_STYLE("FontSize",9);  
LODOP.ADD_PRINT_TEXT(48,5,80,10,"缸号/季节:");
LODOP.ADD_PRINT_TEXT(48,68,115,20,"${wxb["WXB04"]!}"); 

LODOP.SET_PRINT_STYLE("FontSize",7.5);  




LODOP.ADD_PRINT_RECT(96,3,181,40,0,1);

LODOP.ADD_PRINT_TEXT(100,5,37,10,"箱号:");
LODOP.ADD_PRINT_TEXT(100,35,140,10,"${wxb["WXB05"]!}");  
  
LODOP.ADD_PRINT_RECT(116,3,181,40,0,1);
LODOP.ADD_PRINT_TEXT(120,5,40,10,"色号:");
LODOP.ADD_PRINT_TEXT(120,36,145,10,"${wxb["WXB06"]!}"); 
  
  

LODOP.ADD_PRINT_RECT(135,3,181,42,0,1);
LODOP.ADD_PRINT_TEXT(140,5,70,10,"净重/数量:");
LODOP.ADD_PRINT_TEXT(140,110,50,10,"毛重");

LODOP.SET_PRINT_STYLE("FontSize",10); 
LODOP.ADD_PRINT_TEXT(140,138,60,10,"${wxb["WXB08"]!}"); 
LODOP.ADD_PRINT_TEXT(140,60,60,10,"${wxb["WXB09"]!}");



 LODOP.SET_PRINT_STYLE("FontSize",7.5); 

LODOP.ADD_PRINT_TEXT(160,5,40,10,'管数:');
LODOP.ADD_PRINT_TEXT(160,35,60,10,'${wxb["WXB10"]!}');
LODOP.ADD_PRINT_TEXT(160,90,140,10,"日期:");
LODOP.ADD_PRINT_TEXT(160,118,145,10,"${wxb["WXB07"]!}");
 
LODOP.ADD_PRINT_RECT(176,3,181,19,0,1);
LODOP.ADD_PRINT_TEXT(180,5,40,10,'规格:');
LODOP.ADD_PRINT_TEXT(180,35,130,30,'${wxb["IMA021"]!}');  
 
  
 
 
//LODOP.ADD_PRINT_RECT(243,2,370,78,0,1);




 
LODOP.SET_PRINT_STYLE("FontSize",12);
LODOP.ADD_PRINT_RECT(196,3,375,164,0,1);
LODOP.ADD_PRINT_RECT(196,3,18,164,0,1);

LODOP.ADD_PRINT_TEXT(230,5,10,40,'品名');
LODOP.ADD_PRINT_TEXT(200,22,360,200,"${wxb["PMN041"]!}"); 

 LODOP.SET_PRINT_STYLE("FontSize",7.5);
  
 
		
</#list>
		
		
		 


 



};  
  
  
</script>
  
</div>


</body>
</html>