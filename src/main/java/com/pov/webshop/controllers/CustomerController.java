package com.pov.webshop.controllers;

import com.pov.webshop.Services.CustomerServices;
import com.pov.webshop.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerServices customerServices;

    @GetMapping("customer/all")
    ResponseEntity<List<Customer>> findAll() {
        List<Customer> result =customerServices.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @GetMapping("customer/getById")
    ResponseEntity<List<Customer>> getById(Integer id) {
        List<Customer> result = customerServices.getById(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @GetMapping("customer/save")
    ResponseEntity<Customer> save(Customer customer) {
        Customer result = customerServices.save(customer);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @GetMapping("customer/update")
    ResponseEntity<Customer> update(Integer customer) {
        Customer result = customerServices.update(customer);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
