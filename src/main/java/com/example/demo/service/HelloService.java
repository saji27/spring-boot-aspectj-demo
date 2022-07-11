package com.example.demo.service;

import com.example.demo.annotation.Timed;
import com.example.demo.model.Message;
import org.springframework.stereotype.Service;


@Service
public class HelloService {

    @Timed
    public Message sayHello(){
        return Message.builder().messageBody("Message: Hello !! How are you ? ".concat(offerHelp())).build();
    }

    @Timed
    private String offerHelp(){
        return "How can i help you ? " + HelloService.getCurrentTimeInMillis();
    }

    @Timed
    private static long getCurrentTimeInMillis(){
        return System.currentTimeMillis();
    }

}
