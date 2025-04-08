package com.example.controller;

import com.example.model.Message;
import com.example.service.KafkaProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProducerController {
    private final KafkaProducerService producerService;

    public ProducerController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/send/topic1")
    public String sendToTopic1(@RequestBody Message message) {
        producerService.sendToTopic1(message);
        return "Message sent to topic1";
    }

    @PostMapping("/send/topic2")
    public String sendToTopic2(@RequestBody Message message) {
        producerService.sendToTopic2(message);
        return "Message sent to topic2";
    }
}