package com.chenyuantech.eps.job;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.chenyuantech.eps.service.DdlogService;
import com.chenyuantech.eps.service.RvaService;
import com.chenyuantech.eps.service.USERSService;
import com.chenyuantech.eps.utils.MailUtil;

@Component
@EnableAsync
@EnableScheduling
public class SendMailJob {
	@Autowired
	private RvaService rvaService;
	@Autowired
	private DdlogService ddlogService;
	@Autowired
	private USERSService usersService;

	private List<String> jqemaillist = null;
	private List<LinkedHashMap<String, Object>> list = null;
	private LinkedHashMap<String, Object> linkedHashMap = null;
	@Autowired
	private MailUtil mailUtil;
	private boolean flag = false; // 邮件发送成功标记

	/**
	 * QC时间过长发送邮件
	 */
	@Scheduled(cron = "${job.qc}")
	public void sendQCmail() {
		list = rvaService.getsendmail(); // 查询所有要发送邮件的List
		System.out.println("-------sendjq");

		for (int i = 0; i < list.size(); i++) {
			linkedHashMap = list.get(i);

			try {
				if (linkedHashMap.get("EMAIL") != null) {
					// QC时间过长发送给采购
					flag = mailUtil.sendTempEmail(linkedHashMap.get("EMAIL").toString(), "QC时间过长提示", linkedHashMap, "/mailvm/QC时间过长提示.vm");
					if (flag) {
						if (linkedHashMap.get("RVB01") != null && linkedHashMap.get("RVB02") != null)
							rvaService.updateRvb(linkedHashMap.get("RVB01").toString(), Integer.parseInt(linkedHashMap.get("RVB02").toString()), "Y");
					}

				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * .两天之内供应商没有回复交期,发送邮件
	 */
	@Scheduled(cron = "${job.jq}")
	public void sendJQmail() {
		int updaterows = 0;

		System.out.println("-------sendjq");
		list = ddlogService.getddlogsendmail();

		for (int i = 0; i < list.size(); i++) {
			linkedHashMap = list.get(i);
			jqemaillist = usersService.getPMCEmaillist(linkedHashMap.get("PMMUD02").toString());

			updaterows = ddlogService.updateReplydd(linkedHashMap.get("REQUIREMENTDD").toString(), linkedHashMap.get("DDID").toString());

			if (jqemaillist != null && updaterows > 0)
				try {
					if (jqemaillist.size() > 0) {
						// 发起变更两天后没有回复发送邮件，并且修改默认同意
						for (String string : jqemaillist) {
							flag = mailUtil.sendTempEmail(string, "交期信息确认函", linkedHashMap, "/mailvm/交期信息确认函.vm");
						}
					}

				} catch (Exception e) {

					e.printStackTrace();
				}
		}
	}

	/**
	 * initialDelay=5000 初始化5s执行方法 fixedDelay=2000 该方法的执行周期为120s
	 */
	@Scheduled(initialDelay = 5000, fixedDelay = 11 * 60 * 1000)
	public void doSomething() {
		System.out.println("  定时器： do some thing...--->  ");

	}
}
