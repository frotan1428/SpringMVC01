package com.tpe.service;

import com.tpe.domain.Message;

public class MailService implements MessageService{


    @Override
    public void sentMessage(Message message){
        System.out.println("I am MailService to sent this message in :"+ message.getMessage());
    }
}
