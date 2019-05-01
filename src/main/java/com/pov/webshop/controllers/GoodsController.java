package com.pov.webshop.controllers;

import com.pov.webshop.Services.GoodsServices;
import com.pov.webshop.entities.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    GoodsServices goodsServices;

    @GetMapping("goods/all")
    ResponseEntity<List<Goods>> findAll() {
        List<Goods> result = goodsServices.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
