package com.example.rabbitmqconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @RabbitListener(queues = "${custom.rabbitmq.queue}")
    public void listener(MessageModel messageModel){
        System.out.println(messageModel.getMessage());
    }
}
