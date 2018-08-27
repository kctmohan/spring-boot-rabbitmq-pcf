package com.pras.springbootpcfrabbitmqmessageproducer;

import com.pras.springbootpcfrabbitmqmessageproducer.model.SampleRequest;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    private final RabbitTemplate rabbitTemplate;

    public MessageProducer(ConnectionFactory connectionFactory){
        this.rabbitTemplate = new RabbitTemplate(connectionFactory);
    }

    public void sendMessage(SampleRequest request) {
        rabbitTemplate.convertAndSend("SAMPLE-INPUT", request.toString());
    }
}
