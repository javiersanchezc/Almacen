package com.app.almacen.web;

import com.app.database.service.CustomerService;
import com.app.database.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class custumerController {
    @Autowired
    private CustomerService customerService;

    public custumerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer createCustomer( @org.springframework.web.bind.annotation.RequestBody Customer customer){
        try {
            return customerService.saveCustomer(customer);
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegrityViolationException("Data integrity violation - this customer may already exist.");
        }

    }
    @GetMapping("/api/customers" )

    public String getAllCustumer(){
        return "custumers";
    }
}
