package com.sprinttesting.springboottesting.controllers;


import com.sprinttesting.springboottesting.entities.Customer;
import com.sprinttesting.springboottesting.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public String save(@RequestBody Customer customer){
        return customerService.save(customer);
    }
}
