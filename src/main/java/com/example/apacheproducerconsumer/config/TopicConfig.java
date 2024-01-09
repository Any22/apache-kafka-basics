package com.example.apacheproducerconsumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;



// 2. Creating Kafka topic here after adding dependency and setting properties
// for starting kafka server .\bin\windows\kafka-server-start.bat .\config\server.properties
@Configuration
public class TopicConfig {

    @Bean
    public NewTopic myFirstTopic(){
        //just topic instance is created without partitions
        return TopicBuilder.name("myfirstmessage")
                .build();
    }
    @Bean
    public NewTopic myFirstTopicJson(){
        //just topic instance is created without partitions
        return TopicBuilder.name("myfirstmessage_Json")
                .build();
    }
}
