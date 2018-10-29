package com.example.restapi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shariq on 29/10/18.
 */
public class MessageStorage {

    private List<Customer> customers = new ArrayList<>();

    public void add(Customer customer) {
        customers.add(customer);
    }

    public void clear() {
        customers.clear();
    }

    public List<Customer> getAll(){
        return customers;
    }
}
