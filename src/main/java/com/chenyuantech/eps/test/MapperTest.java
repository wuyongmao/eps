package com.chenyuantech.eps.test;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chenyuantech.eps.bean.Colorchklog;
import com.chenyuantech.eps.bean.USERS;
import com.chenyuantech.eps.bean.USERSExample;
import com.chenyuantech.eps.bean.WXB;
import com.chenyuantech.eps.dao.DdlogExtMapper;
import com.chenyuantech.eps.dao.PMCMapper;
import com.chenyuantech.eps.dao.PMM_PMNExtMapper;
import com.chenyuantech.eps.dao.RvaExtMapper;
import com.chenyuantech.eps.dao.USERSExtMapper;
import com.chenyuantech.eps.dao.USERSMapper;
import com.chenyuantech.eps.dao.WXB_ExtMapper;
import com.chenyuantech.eps.service.ColorchklogService;
import com.chenyuantech.eps.service.DdlogService;
import com.chenyuantech.eps.service.DeliverylogService;
import com.chenyuantech.eps.service.PMCService;
import com.chenyuantech.eps.service.PMMPMNService;
import com.chenyuantech.eps.service.PnbService;
import com.chenyuantech.eps.service.USERSService;
import com.chenyuantech.eps.service.WXBService;
  
/**
 * 测试dao层的工作
  *推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件
 *1、导入SpringTest模块
 *2、@ContextConfiguration指定Spring配置文件的位置
 *3、直接autowired要使用的组件即可
 */
 @RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	PMCMapper pMCMapper;
	
	@Autowired
	PMM_PMNExtMapper  pMM_PMNExtMapper;	
	 
	@Autowired
	USERSService usersService;
	
	@Autowired
	PMMPMNService pmmpmnService;
	
	@Autowired
	USERSExtMapper   uSERSExtMapper ;	
	@Autowired
	USERSMapper   uSERSMapper ;
	 
	@Autowired
	PMCService  pmcService;
	@Autowired
	USERSService  uSERSService;
	
	@Autowired
	DeliverylogService deliverylogService;
	
	@Autowired
 	DdlogExtMapper  ddlogExtMapper;
	
	@Autowired
	ColorchklogService ColorchklogService;
	
	@Autowired
	RvaExtMapper rvaExtMapper;
	
	@Autowired
	DdlogService ddlogService;
	
	@Autowired
	PnbService pnbService;
	@Autowired
	WXBService ws;
	
	@Autowired
	WXB_ExtMapper w;
	
	 @Test
	public void test(){
	// System.out.println(  	pnbService.getPnb( "C364-1709090014",2 ));
	    String [] s= {"HZ0001201804230001","HZ0001201804230001"} ;
		System.out.print("============"+w.getWXBByWXB05s(s) .size() ); 
	}
	
	
	 @Test
	public void test2() throws Exception{
		
		WXB record=new WXB();
		record.setWXB01("C302-1805040004");
		record.setWXB02(2);
		record.setWXB03("AA");
		record.setWXB04("AA");
		record.setWXB05("HZ0001201804230031");
		record.setWXB08(new BigDecimal(2371.615));
		record.setWXB09(new BigDecimal(2315));
		WXB record2=new WXB();
		record2.setWXB01("C302-1805040004");
		record2.setWXB02(2);
		record2.setWXB03("AA");
		record2.setWXB04("AA");
		record2.setWXB05("HZ0001201804230029");
		record2.setWXB08(new BigDecimal(2371.615));
		record2.setWXB09(new BigDecimal(2315));
		/*
		record.setWXB02(2);
		record.setWXB03("C368-1702280001");
		record.setWXB04("21A");
		record.setWXB05(40);
		record.setWXB06("QS0001201804140001");
		record.setWXB07("2018-04-14");
		record.setWXB08(new BigDecimal(37.65));
		record.setWXB09(new BigDecimal(35));
		record.setWXB10(40);
 		System.out.println(ws.insertWXB(record));
	*/
		 
		//	System.out.print( ws.getWXB2("C302-1709160001", 1));;
		try {
		//	System.out.println( ws.insertWXB2(record,record2));;
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		
	}
	
	
	
	
	
	
	
	
	private  List<Map<String, Object>>  exportlist ;

	
	public List<Map<String, Object>> getExportlist() {
		return exportlist;
	}




	public void setExportlist(List<Map<String, Object>> exportlist) {
		this.exportlist = exportlist;
	}

	
	
	
	static String concat(String  a, String  b) {  
		  String s = "";
	      String[] r1=a.split(",");
	      String[] r2=b.split(",");
          for( int i=0;i<r1.length;i++){
        	  if(s.length()>0)
        	  {
        		  s=s+","+r1[i]+" "+ r2[i];
        	  }else{
        		  s=s +r1[i]+" "+ r2[i];

        	  }
          }
		return s;
		
		}  
	 
	
	
	//@Test
	public void testMultdatasource() throws SQLException{
		// MultipleDataSource.setDataSourceKey("dataSourceOne");
		// 设置数据源为SqlServer,使用AOP测试时请将下面这行注释
		// MultipleDataSource.setDataSourceKey("dataSourceOne");

		// DataSourceContextHolder.setDbType("dataSourceTwo");
	    System.out.println(uSERSService.getAllUSERS().size());
	  //   System.out.println(user.getuser() .size() );
		// System.out.println(pmmpmnService.getUser().size());

	 
 	}
	//@Test
	public void TestAop(){
		  System.out.println(uSERSService.getAllUSERS() .size());
	}


	//@Test
	public void Export() throws Exception{
		
	 //	System.out.println(rvaExtMapper.updateFlag("C303-1707190021", 1, "Y") );
//	List<	LinkedHashMap<String, Object>> list=ddlogService.getddlogsendmail();
		
		
		
	System.out.println(usersService.getPMC03("BC0003"));	
 //	System.out.println(list.size());
	  	
	 // 	for(int i=0;i<list.size();i++){
	
//	LinkedHashMap<?, ?> lm=list.get(0);
	
//	System.out.println("PMN01-->"+ lm.get("PMN01") );        //收货单号   
//	System.out.println( "PMN02-->"+  lm.get("PMN02") );      //收货单项次  
//	System.out.println( "PMC03-->"+  lm.get("PMC03") );        //采购人员Email  
//	System.out.println( "PMMUD02-->"+  lm.get("PMMUD02") );        //采购人员  QC时间
//	System.out.println( "NOW-->"+  lm.get("NOW") );        //采购人员  QC时间
	
 	// usersService.getPMCEmaillist( lm.get("PMMUD02").toString()   ) ;
	  	
 	//  List l= uSERSExtMapper.getPMCEmaillist("YXH001" );
 	 
 	// System.out.println(lm);
	// System.out.println( usersService.getPMCEmaillist( lm.get("PMMUD02").toString()   )   );
	  	 
	}
	
	
	
	//@Test
	public void Export2() throws Exception{
		
	 //	System.out.println(rvaExtMapper.updateFlag("C303-1707190021", 1, "Y") );
	List<	LinkedHashMap<String, Object>> list=rvaExtMapper.getsendmail() ;
		
	 	System.out.println(list.size());
	  	
	 // 	for(int i=0;i<list.size();i++){
	/*
	LinkedHashMap<?, ?> lm=list.get(0);
	
	System.out.println("RVB01-->"+ lm.get("RVB01") );        //收货单号   
	System.out.println( "RVB02-->"+  lm.get("RVB02") );      //收货单项次  
	System.out.println( "RVB04-->"+  lm.get("RVB04") );      //采购单号  
	System.out.println( "RVB03-->"+  lm.get("RVB03") );      //采购单项次项次  
	System.out.println( "FLAG-->"+  lm.get("FLAG") );        //收货单邮件发送标记  
	System.out.println( "PMM12-->"+  lm.get("PMM12") );        //采购人员  
	System.out.println( "NAME-->"+  lm.get("NAME") );        //采购人员  
	System.out.println( "EMAIL-->"+  lm.get("EMAIL") );        //采购人员Email  
	System.out.println( "QCSJ-->"+  lm.get("QCSJ") );        //采购人员  QC时间
	System.out.println( "NOW-->"+  lm.get("NOW") );        //采购人员  QC时间
	
	
	  	 System.out.println(list.get(0));
	  		*/
	//  	}
	  	
	  	
	  	
	  	

//		PMM m=new PMM();
//		PMN n=new PMN();
//		
//		exportlist=pMMPMNService.getPMMPMN(m, n);
//		System.out.println( exportlist.size());
//		
//	  System.out.println(exportlist.get(0).keySet() );
		
 		
//		PMCExample example=new PMCExample();;
//		example.createCriteria().andPMC01EqualTo("BC0003");
//		;
//		System.out.println(pMCMapper.selectByExample(null));
		
		// System.out.println(ddlogExtMapper.selectPMCByPMN01PMN02("C302-1704130009", 1).size());
	//	  System.out.println(ddlogService.getDdlog2("C302-1704130009", 1).size());
		
		
 		
	}
	
	 
	
	/**
	 * 测试DepartmentMapper
	 * @throws Exception 
	 */
	//@Test
	public void testCRUD() throws Exception{
	 //1、创建SpringIOC容器
		//ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		////2、从容器中获取mapper
		//DepartmentMapper bean = ioc.getBean(DepartmentMapper.class); 
//		System.out.println(USERSMapper.selectByExample(null).get(1).getUsername());
//		Book record=new Book();
//		record.setBookname("oracle");
//		record.setBookid("book13");
//		bookMapper.insert(record);
//		DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
	
		USERS  users=new USERS();
	//	users.setACCID("5282A2DC9AE4B765E050007F010046AF");
		users.setNAME("吴永茂");
		users.setQQ("7412164");
		USERSExample example=new USERSExample();
		example.createCriteria().andACCEqualTo("===");
		example.clear();
//		System.out.println(uSERSMapper.selectByExample(example)+"============");
		
		Colorchklog colorchklog=new Colorchklog();
		colorchklog.setChkid("53616CE0F006EFFFE050007F0100104B");
		colorchklog.setChktime("2017-02-04");
 	 
     //  	System.out.println(ColorchklogService.insertColorchklog(colorchklog));   //536023D0F3C61672E050007F01000D77
 		//   System.out.println(ColorchklogService.deleteColorchklog("53616CE0F006EFFFE050007F0100104B"));
// 		  System.out.println(ColorchklogService.updateColorchklog(colorchklog));
    	System.out.println(ColorchklogService.findByPrimaryKey( "53616CE0F006EFFFE050007F0100104B").toString());

 		 	
 		 	
 		 	
		//users.setEMAIL("741262164@qq.com");
		//System.out.println("====="+uSERSExtMapper.findUsersByParam(users).get(0).getNAME());
	//	System.out.println("====="+uSERSService.);
 		//System.out.println("====="+uSERSService.getUSERSByKey("5282A2DC9AE4B765E050007F010046AF").toString());
		//System.out.println("==>>>>>>>=="+uSERSService.getUSERSByObject(users).toString());
		
		 
		//System.out.println("==>>>>>>>=="+uSERSMapper.updateByPrimaryKeySelective(users));
	//	System.out.println("==>>>>>>>=="+uSERSService.updateUSER(users));
		
//		System.out.println(deliverylogService.findByPrimaryKey("5323E3417085EEC3E050007F01001100"));	 
		
		
		
		
		/*
		System.out.println(pMM_PMNExtMapper);
	 	//USERSMapper sUSERSMapper = sqlSession.getMapper(USERSMapper.class);
		PMM pmm=new PMM();
		pmm.setPMM01("C302-1703090053");
		//TableColumsMapper tt = sqlSession.getMapper(TableColumsMapper.class);
		PMN pmn=new PMN();
		pmn.setPMN01("C302-1703090053");
		pmm.setPMM01("");
		pmn.setPMN01("");
		System.out.println (pMM_PMNExtMapper.findPMMPMNLinkList(pmm,pmn).size());
		*/
		
		
//		USERS uSERS=new USERS();
//		uSERS.setEMAIL("741262164@qq.com");
//		uSERS.setNAME("吴永茂");
//		USERSExample example =new USERSExample();
//		 example.createCriteria().andNAMEEqualTo("吴永茂");
	//	 uSERSMapper.deleteByExample(example);
		//sqlSession.commit();
	//	 uSERSMapper.insert(uSERS);
		
		 
		 
		 
		//1、插入几个部门
//   		for(int i = 0;i<1000;i++){
//			String uid = UUID.randomUUID().toString().substring(0,5)+i;
//			departmentMapper.insert(new Department(i+20, uid));
//		} 
//   		sqlSession.commit();
		//2、生成员工数据，测试员工插入
		//employeeMapper.insertSelective(new Employee(null, "Jerry", "M", "Jerry@atguigu.com", 1));
		
		//3、批量插入多个员工；批量，使用可以执行批量操作的sqlSession。
		
//		for(){
//			employeeMapper.insertSelective(new Employee(null, , "M", "Jerry@atguigu.com", 1));
//		}
//		 EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//		for(int i = 0;i<1000;i++){
//			String uid = UUID.randomUUID().toString().substring(0,5)+i;
//			mapper.insertSelective(new Employee(null,uid, "M", uid+"@atguigu.com", 1));
//		} 
//		System.out.println("批量完成");
//		
   		
   		
   		
   		//测试扩展的mapper
   		
   		//System.out.println(deptExtMapper.getRolesByUserId().size());
   		
 	}

}
