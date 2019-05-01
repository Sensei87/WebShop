package com.pov.webshop.controllers;

import com.pov.webshop.Services.OrderIterServices;
import com.pov.webshop.entities.OrderIter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderIterController {

    @Autowired
    OrderIterServices orderIterServices;

    @GetMapping("orderIter/all")
    ResponseEntity<List<OrderIter>> findAll() {
        List<OrderIter> result = orderIterServices.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
