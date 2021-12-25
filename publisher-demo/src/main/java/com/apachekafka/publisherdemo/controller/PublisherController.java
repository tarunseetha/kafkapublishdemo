package com.apachekafka.publisherdemo.controller;

import com.apachekafka.publisherdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class PublisherController {

    @Value("${apache.kafka.topic}")
    private String topic;

    @Value("${apache.kafka.publisher_server}")
    private String publisher_server;

    @Autowired
    KafkaTemplate<String, Employee> kafkaTemplate;

    @GetMapping("/publish/{name}")
    public String doPublish(@PathVariable("name") String name){

        System.out.println("publisher_server=>" + publisher_server);

        Employee employee = new Employee(name, "Technology", "Developer");
        kafkaTemplate.send(topic, employee);

        return "You entered: " + name;
    }
}
