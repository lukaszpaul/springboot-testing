package com.sprinttesting.springboottesting.service;

import com.sprinttesting.springboottesting.entities.Customer;
import com.sprinttesting.springboottesting.respositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepo customerrepo;
    @Override
    public String save(Customer customer){
        return customerrepo.save(customer).getEmail();
    }
}
