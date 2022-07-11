package com.example.demo.controller;

import com.example.demo.annotation.Timed;
import com.example.demo.model.Message;
import com.example.demo.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @Timed
    @GetMapping("/hello")
    public String sayHelloInController(){
        return helloService.sayHello().getMessageBody();
    }

}
