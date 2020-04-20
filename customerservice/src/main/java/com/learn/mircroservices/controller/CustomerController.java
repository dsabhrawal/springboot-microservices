package com.learn.mircroservices.controller;

import com.learn.mircroservices.CustomerServiceApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public Customer findById(@PathVariable Long id){
        return customerService.findById(id);
    }
}
