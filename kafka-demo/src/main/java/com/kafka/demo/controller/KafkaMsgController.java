package com.kafka.demo.controller;

import com.kafka.demo.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class KafkaMsgController {

    @Autowired
    private Producer producer;

    @GetMapping("/producerMsg")
    public void getMessgaFromClient(@RequestParam("message") String message) {
        producer.sendMsgToTopic(message);
    }
}
