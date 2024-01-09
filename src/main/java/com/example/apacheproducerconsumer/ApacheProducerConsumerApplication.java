package com.example.apacheproducerconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

//Creating Kafka configuration first in a config folder and @configuration annotation and set few
// properties in application.properties file , create topic inside configuration class
//2. creating Kafka consumer and producer
//3.
@SpringBootApplication
@EnableKafka
public class ApacheProducerConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheProducerConsumerApplication.class, args);
	}

}
