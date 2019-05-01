package com.pov.webshop.Services;

import com.pov.webshop.entities.Orders;
import com.pov.webshop.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersServices {

    @Autowired
    OrdersRepository ordersRepository;

    public List<Orders> findAll() {
        return ordersRepository.findAll();
    }

}
