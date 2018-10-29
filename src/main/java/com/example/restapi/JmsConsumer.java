package com.example.restapi;

import org.springframework.stereotype.Component;

/**
 * Created by Shariq on 29/10/18.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {

    @Autowired
    private MessageStorage customerStorage;

    @JmsListener(destination = "${gkz.activemq.queue}", containerFactory="jsaFactory")
    public void receive(Customer customer){
        System.out.println("Recieved Message: " + customer);
        customerStorage.add(customer);
    }
}
