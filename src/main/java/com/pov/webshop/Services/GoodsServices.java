package com.pov.webshop.Services;

import com.pov.webshop.entities.Goods;
import com.pov.webshop.repositories.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServices {

    @Autowired
    GoodsRepository goodsRepository;

    public List<Goods> findAll() {
        return goodsRepository.findAll();
    }

}
