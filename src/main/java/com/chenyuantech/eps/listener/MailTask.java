//package com.chenyuantech.eps.listener;
//
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.TimerTask;
//
//import javax.servlet.ServletContext;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.context.support.WebApplicationContextUtils;
//
//import com.chenyuantech.eps.core.DataSourceContextHolder;
//import com.chenyuantech.eps.core.DataSourceInterceptor;
//import com.chenyuantech.eps.core.DynamicDataSource;
//import com.chenyuantech.eps.service.DdlogService;
//import com.chenyuantech.eps.service.RvaService;
//import com.chenyuantech.eps.service.USERSService;
//import com.chenyuantech.eps.utils.MailUtil;
//
//public class MailTask extends TimerTask {
//	private static boolean isRunning = false;
//	private RvaService rvaService;
//	private DdlogService ddlogService;
//	private USERSService usersService;
//	private List<String> jqemaillist = new ArrayList<>();
//	private List<LinkedHashMap<String, Object>> list;
//	private LinkedHashMap<String, Object> linkedHashMap;
//	private MailUtil mailUtil;
//	private boolean flag = false; // 邮件发送成功标记
//	private ServletContext context = null;
//	@Autowired
//	private WebApplicationContext webApplicationContext;
//
//	public MailTask() {
//		super();
//	}
//
//	public MailTask(ServletContext context) {
//		this.context = context;
//		this.webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(context);
//		this.rvaService = webApplicationContext.getBean(RvaService.class);
//
//		this.mailUtil = WebApplicationContextUtils.getWebApplicationContext(this.context).getBean(MailUtil.class);
//
//		this.ddlogService = webApplicationContext.getBean(DdlogService.class);
//
//		this.usersService = webApplicationContext.getBean(USERSService.class);
//
//	}
//
//	@Override
//	public void run() {
//
//		// sendQCmail();
//		// sendJQmail();
//
//	}
//
//	/**
//	 * QC时间过长发送邮件
//	 */
//	public void sendQCmail() {
//		list = rvaService.getsendmail(); // 查询所有要发送邮件的List
//
//		for (int i = 0; i < list.size(); i++) {
//			linkedHashMap = list.get(i);
//
//			try {
//				if (linkedHashMap.get("EMAIL") != null) {
//					// QC时间过长发送给采购
//					flag = mailUtil.sendTempEmail(linkedHashMap.get("EMAIL").toString(), "QC时间过长提示", linkedHashMap, "/mailvm/QC时间过长提示.vm");
//					if (flag) {
//						// System.out.println("成功发送的邮件----->" +
//						// linkedHashMap.get("EMAIL"));
//						if (linkedHashMap.get("RVB01") != null && linkedHashMap.get("RVB02") != null)
//							rvaService.updateRvb(linkedHashMap.get("RVB01").toString(), Integer.parseInt(linkedHashMap.get("RVB02").toString()), "Y");
//					}
//
//				}
//
//			} catch (Exception e) {
//
//				e.printStackTrace();
//			}
//
//		}
//
//	}
//
//	/**
//	 * .两天之内供应商没有回复交期,发送邮件
//	 */
//	public void sendJQmail() {
//		int updaterows = 0;
//
//		list = ddlogService.getddlogsendmail();
//
//		for (int i = 0; i < list.size(); i++) {
//			linkedHashMap = list.get(i);
//			jqemaillist = usersService.getPMCEmaillist(linkedHashMap.get("PMMUD02").toString());
//
//			updaterows = ddlogService.updateReplydd(linkedHashMap.get("REQUIREMENTDD").toString(), linkedHashMap.get("DDID").toString());
//
//			if (jqemaillist != null && updaterows > 0)
//				try {
//					if (jqemaillist.size() > 0) {
//						// 发起变更两天后没有回复发送邮件，并且修改默认同意
//
//						for (String string : jqemaillist) {
//
//							flag = mailUtil.sendTempEmail(string, "交期信息确认函", linkedHashMap, "/mailvm/交期信息确认函.vm");
//
//						}
//
//					}
//
//				} catch (Exception e) {
//
//					e.printStackTrace();
//				}
//
//		}
//
//	}
//
//}
