package com.tpe.main;

import com.tpe.domain.Message;
import com.tpe.service.MailService;
import com.tpe.service.MessageService;
import com.tpe.service.SMSService;
import com.tpe.service.WhatsAppService;

public class main {

    public static void main(String[] args) {


        Message message= new Message();
        message.setMessage("Orders have been submitted with cargo .... ");
        /*
        //----------------- 1 set Level code  --------

        MailService mailService= new MailService();
        mailService.sentMessage(message);

        SMSService smsService = new SMSService();
        smsService.sentMessage(message);

        WhatsAppService whatsAppService= new WhatsAppService();
        whatsAppService.sentMessage(message);

        // ----------------- 2nd  level----------



        MessageService service=  new MailService();
        service.sentMessage(message);

        MessageService SMSService= new SMSService();
        SMSService.sentMessage(message);

        MessageService whatsAppService = new WhatsAppService();
        whatsAppService.sentMessage(message);


         */

        // ---------------- 3th Level -----------------------------


        String serviceName ="smsService";

        MessageService service;

        if (args.length>0){
            serviceName =args[0];
        }

        if (serviceName.equalsIgnoreCase("whatsAppService")){
            service= new WhatsAppService();
        }else if(serviceName.equalsIgnoreCase("smsService")){
            service= new SMSService();
        }else {
          service= new MailService();
        }
        service.sentMessage(message);



    }
}
