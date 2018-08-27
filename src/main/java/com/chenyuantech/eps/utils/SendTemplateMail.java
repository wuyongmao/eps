package com.chenyuantech.eps.utils;

import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.ui.velocity.VelocityEngineUtils;

//@Component
public class SendTemplateMail {

    @Autowired
    private JavaMailSenderImpl mailSender;
    @Autowired
    private VelocityEngine velocityEngine;

    public void sendEmail() throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
        helper.setFrom("scm@chenyuantech.com ");
        helper.setTo("741262164@qq.com");
        helper.setSubject("测试HTM主题");
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("userName", "xxx");
        String mailText = VelocityEngineUtils.mergeTemplateIntoString(
                velocityEngine, "mail.vm", "UTF-8", model);
        System.out.println(mailText);
        helper.setText(mailText, true);
        mailSender.send(message);
    }

}