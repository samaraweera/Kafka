package com.apache.kafka.controller;

import com.apache.kafka.model.SimpleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    private KafkaTemplate<String,SimpleModel> kafkaTemplateForJson;

    private static final String TOPIC = "Kafka_String_Example";
    private static final String JSON_TOPIC = "Kafka_Json_Example";

    @GetMapping("/{message}")
    public String post(@PathVariable("message") String message){
        kafkaTemplate.send(TOPIC,message);
        return "Kafka_String_Example update Successfully";
    }

    @GetMapping("/{message}/{name}")
    public String jsonExample(@PathVariable("name") String name,@PathVariable("message") String message){
        kafkaTemplateForJson.send(JSON_TOPIC,new SimpleModel(name,message));
        return "Kafka_Json_Example update Successfully";
    }




}
