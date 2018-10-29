package com.example.restapi;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shariq on 29/10/18.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
public class RestAPIs {

    @Autowired
    JmsProducer jmsProducer;

    @Autowired
    private MessageStorage customerStorage;

    @PostMapping(value="/api/customer")
    public Customer postCustomer(@RequestBody Customer customer){
        jmsProducer.send(customer);
        return customer;
    }

    @GetMapping(value="/api/customers")
    public List<Customer> getAll(){
        List<Customer> customers = customerStorage.getAll();
        return customers;
    }

    @DeleteMapping(value="/api/customers/clear")
    public String clearCustomerStorage() {
        customerStorage.clear();
        return "Clear All CustomerStorage!";
    }
}
