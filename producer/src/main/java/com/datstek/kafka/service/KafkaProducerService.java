package com.datstek.kafka.service;

import com.datstek.kafka.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, Course> kafkaTemplate;

    public String sendMessage(Course course
    ) {
        kafkaTemplate.send("datstek", "course", course);
        return "Course message sent to the Kafka server.";
    }
}
