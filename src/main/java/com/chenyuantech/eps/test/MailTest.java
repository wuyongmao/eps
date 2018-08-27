package com.chenyuantech.eps.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chenyuantech.eps.utils.MailUtil;

/** 
 * 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class) // @RunWith(SpringJUnit4ClassRunner.class)
										// 来启动 Spring 对测试类的支持
@ContextConfiguration("/spring-mail.xml") // @ContextConfiguration 注释标签来指定
											// Spring 配置文件或者配置类的位置
public class MailTest {
	private static final Logger log = LoggerFactory.getLogger(MailTest.class);

	@Autowired
	private MailUtil mailUtil;

	@Test
	public void sendTempEmailTest() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userName", "吴永茂");
		LinkedHashMap<String, Object> linkedHashMap=new LinkedHashMap<>();
		String t="wuyongmao@proknittextile.com/wuyongmao@proknittextile.com";
		 boolean b=false;
 		  
	   b=	mailUtil.sendTempEmail( t, "subject", linkedHashMap, "/mailvm/交期信息确认函.vm");
		System.out.println( "sendTempEmail=="+b );
	}

	 
}