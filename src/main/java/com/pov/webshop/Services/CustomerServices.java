package com.pov.webshop.Services;

import com.pov.webshop.entities.Customer;
import com.pov.webshop.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    public void setProductRepository(CustomerRepository repository) {
        this.customerRepository = repository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }



    public List<Customer> getById(Integer id) {
        return (List<Customer>) customerRepository.findOne(id);
    }


    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }


    public Customer update(Integer id) {
        Customer updated = customerRepository.findOne(id);
        return customerRepository.save(updated);
    }
/*
    public Customer delete(Integer id) {
        return customerRepository.delete(id);

    }*/
}
