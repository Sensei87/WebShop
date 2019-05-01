package com.pov.webshop.controllers;

import com.pov.webshop.Services.OrdersServices;
import com.pov.webshop.entities.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController {

    @Autowired
    OrdersServices ordersServices;
    @GetMapping("orders/all")
    ResponseEntity<List<Orders>> findAll() {
        List<Orders> result = ordersServices.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
