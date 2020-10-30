package com.xtk.apistation.webapi.Mails;

public class MailTemplate {
    private String mailContent = "Mail Content haven't init!";
    private String mailSubject = "Mail Subject haven't init!";

    // Simple Mail 1
    public static String mailContentPart1 = "编号为";
    public static String mailContentPart2 = "的领料或订购申请已通过，请开始后续步骤处理。";
    public void buildSimpleContent1(String Str){
        this.mailContent = mailContentPart1 + " [ " + Str + " ] " + mailContentPart2;
        this.mailSubject = "PMS申请通过提醒";
    }

    public String getMailContent(){
        return this.mailContent;
    }

    public String getMailSubject(){
        return this.mailSubject;
    }
}
