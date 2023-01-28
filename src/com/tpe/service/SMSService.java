package com.tpe.service;

import com.tpe.domain.Message;

public class SMSService  implements MessageService{

    public void sentMessage(Message message){

        System.out.println("I am SMS Service to sent this message in :"+ message.getMessage());
    }
}
