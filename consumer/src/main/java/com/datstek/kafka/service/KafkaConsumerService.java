package com.datstek.kafka.service;

import com.datstek.kafka.model.Course;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private String message;

    @KafkaListener(topics = "datstek", groupId = "datstek-group")
    public void consumer(Course course
    ) {
        message = course + "Got the data from Kafka";
        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }
}
