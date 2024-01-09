package com.example.apacheproducerconsumer.controller;

import com.example.apacheproducerconsumer.kafka.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//run .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
//.\bin\windows\kafka-server-start.bat .\config\server.properties
@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
    private KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer) {

        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/publish")
    //http:localhost:8080/api/v1/kafka/publish?message=hello world
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to kafka topic");
    }
    //http:localhost:8080/api/v1/kafka/hello
    @GetMapping("/hello")
    public String trial(){

        return "testing";
    }
}
