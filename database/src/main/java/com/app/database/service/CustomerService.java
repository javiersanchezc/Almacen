package com.app.database.service;

import com.app.database.repository.CustomerRepository;
import com.app.database.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
