package com.example.rabbitmqconsumer;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class MessageModel {
    private String message;
}
