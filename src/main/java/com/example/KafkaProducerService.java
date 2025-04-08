package com.example.service;

import com.example.model.Message;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private final KafkaTemplate<String, Message> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, Message> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendToTopic1(Message message) {
        kafkaTemplate.send("topic1", message);
    }

    public void sendToTopic2(Message message) {
        kafkaTemplate.send("topic2", message);
    }
}