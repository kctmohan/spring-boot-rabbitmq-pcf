package com.pras.springbootpcfrabbitmqmessageproducer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pras.springbootpcfrabbitmqmessageproducer.model.SampleRequest;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MessageConsumer {

    @RabbitListener(queues = "SAMPLE-INPUT")
    public void handleForwardEngineeringRequest(String jsonString) throws IOException {
        SampleRequest request = new ObjectMapper().readValue(jsonString, SampleRequest.class);
        System.out.println("User Id **************" + request.getUserId());
        System.out.println("Password **************" + request.getPassword());
    }
}
