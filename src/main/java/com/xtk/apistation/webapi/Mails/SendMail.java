package com.xtk.apistation.webapi.Mails;

import com.xtk.apistation.webapi.service.EmailActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessagePreparator;

import javax.mail.internet.MimeMessage;
import java.io.InputStream;

public class SendMail {

    private JavaMailSender mailSender;
    // ************
    private static String[] emailto = {"zhaoyuheng@setechchina.com", "fahuo_nd@setechchina.com"};
    // ************
//    private static String subject = "PMS申请通过提醒";

    public SendMail(){
        JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
        javaMailSenderImpl.setPort(25);
        javaMailSenderImpl.setUsername("saic_pms_remind@setechchina.com");
        javaMailSenderImpl.setPassword("ab12@pms20");
        javaMailSenderImpl.setHost("smtp.setechchina.com");
        JavaMailSender javaMailSender = javaMailSenderImpl;
        this.mailSender = javaMailSender;
    }

    public void sendSimpleMail(String sendName, String message, String subj){
        EmailActionService emailActionService = new EmailActionService(mailSender, sendName);
        System.out.println(
            emailActionService.sendSimpleMsg(message, emailto, subj)
        );
    }

    public static void main(String[] args){
        String sendName = "saic_pms_remind@setechchina.com";
//        String message = "编号为" + "x" + "的领料或订购申请已通过，请去styeline开始后续步骤处理。";
        MailTemplate mailTemplate = new MailTemplate();
        mailTemplate.buildSimpleContent1("xx3");
        String message = mailTemplate.getMailContent();
        String subj = mailTemplate.getMailSubject();
        new SendMail().sendSimpleMail(sendName, message, subj);

/*
        String str = "'ss'\\, 'dd'"; // "\"ss\", \"dd\"";
        String[] tt = new String[]{str};
        String[] tt2 = new String[]{"ss", "dd"};
        System.out.println(tt[0]+ " : " +tt2[0]);
*/

    }
}
