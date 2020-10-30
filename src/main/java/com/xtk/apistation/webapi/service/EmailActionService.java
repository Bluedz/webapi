package com.xtk.apistation.webapi.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.util.StringUtils;

public class EmailActionService {
    private String sendName;
    private final JavaMailSender mailSender;
    public EmailActionService(JavaMailSender mailSender, String sn) {
        this.mailSender = mailSender;
        this.sendName = sn;
    }

    public String sendSimpleMsg(String msg, String email, String subject){
        if (StringUtils.isEmpty(msg) || StringUtils.isEmpty(email)){
            return "请输入要发送消息和目标邮箱";
        }

        try{
            SimpleMailMessage mail = new SimpleMailMessage();
            mail.setFrom(sendName);
            mail.setTo(email);
            mail.setSubject(subject);
            mail.setText(msg);
            mailSender.send(mail);
            return "Mail发送成功";
        }catch (Exception ex){
            ex.printStackTrace();
            return "Mail发送失败:" + ex.getMessage();
        }
    }

}
