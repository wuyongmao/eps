package com.chenyuantech.eps.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.velocity.VelocityEngineUtils;

/**
 * 邮件发送工具类
 * @author yongmao.wu
 *
 */
public class MailUtil {
	@Autowired
	private JavaMailSenderImpl javaMailSenderImpl;
	
	private MailSender mailSender;
	private SimpleMailMessage simpleMailMessage;
    private boolean  b=false;
	@Autowired
	private VelocityEngine velocityEngine;
	@Value("${mail.username}")
    private String mailusername;
	
	public String getMailusername() {
		return mailusername;
	}

	public void setMailusername(String mailusername) {
		this.mailusername = mailusername;
	}

	public String getmailText(String filename, Map<String, Object> model) {
		return VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, filename, "UTF-8", model);
	}

	/**
	 * 群发
	 * 
	 * @param recipients
	 * @param subject
	 * @param content
	 */
	public void send(List<String> recipients, String subject, String content) {
		simpleMailMessage.setTo(recipients.toArray(new String[recipients.size()]));
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(content);
		mailSender.send(simpleMailMessage);
	}

	/**
	 * 单一发送邮件
	 * 
	 * @param recipient
	 * @param subject
	 * @param content
	 */
	public void send(String recipient, String subject, String content) {
		simpleMailMessage.setTo(recipient);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(content);
		mailSender.send(simpleMailMessage);
	}

	public void sendEmail() throws MessagingException {
		MimeMessage message = javaMailSenderImpl.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
		// helper.setFrom("111111111@qq.com");
		helper.setTo("741262164@qq.com");
		helper.setSubject("测试HTM主题");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("userName", "吴永茂");
		String mailText = getmailText("mail.vm", model);
		System.out.println(mailText);
		helper.setText(mailText, true);
		javaMailSenderImpl.send(message);
	}

	
	
	/**
	 * 群发邮件模板发送
	 * @param from               发件人
	 * @param recipient          收件人
	 * @param subject            主题
	 * @param model              模板注入属性
	 * @param filename           模板位置
	 * @throws Exception
	 */
	public boolean sendTempEmail(  List<String>  recipients, String subject, Map<String, Object> model, String filename)
		  {
		
		
		MimeMessage message = javaMailSenderImpl.createMimeMessage();
		MimeMessageHelper helper;
		try {
			helper = new MimeMessageHelper(message, true, "UTF-8");
			helper.setFrom(mailusername, "中山辰元");
			helper.setTo(recipients.toArray(new String[recipients.size()]));
			helper.setSubject(subject);
			helper.setText(getmailText(filename, model), true);
			javaMailSenderImpl.send(message);
			
			
			
			return true;
		} catch ( Exception e) {
 			return false;
		
		}
		

	}
	 
	
	/**
	 * 邮件模板发送
	 * @param from               发件人
	 * @param recipient          收件人
	 * @param subject            主题
	 * @param model              模板注入属性
	 * @param filename           模板位置
	 * @throws Exception
	 */
	public boolean sendTempEmail(   String recipient, String subject, Map<String, Object> model, String filename)
			 {
		MimeMessage message = javaMailSenderImpl.createMimeMessage();
		MimeMessageHelper helper;
			 
			  for (String string : recipient.split("\\|\\*|/|;|,")) {
				    try {
						message = javaMailSenderImpl.createMimeMessage();
				    	helper = new MimeMessageHelper(message, true, "UTF-8");
					    helper.setTo( string.trim() );
						helper.setFrom(mailusername, "中山辰元");
 						helper.setSubject(subject);
						helper.setText(getmailText(filename, model), true);
						javaMailSenderImpl.send(message); 
						b= b || true;
					} catch (Exception e) {
						b= b || false;
						
 					}
					
					
					
					 
				}
				
			 return b;
 		 
		 

	}

	// Spring 依赖注入
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	// Spring 依赖注入
	public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
		this.simpleMailMessage = simpleMailMessage;
	}
}