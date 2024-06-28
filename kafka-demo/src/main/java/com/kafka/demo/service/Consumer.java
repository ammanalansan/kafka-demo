package com.kafka.demo.service;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Consumer {

    @KafkaListener(topics = "myFirstTopic", groupId = "myFirstTopic_group")
    public void listenToTopic(String receivedMessage) {
        log.info("Message Received: " + receivedMessage);
    }
}
