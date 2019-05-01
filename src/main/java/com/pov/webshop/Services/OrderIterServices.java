package com.pov.webshop.Services;

import com.pov.webshop.entities.OrderIter;
import com.pov.webshop.repositories.OrderIterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderIterServices {

    @Autowired
    OrderIterRepository orderIterRepository;

    public List<OrderIter> findAll() {
        return orderIterRepository.findAll();
    }
}
