package com.pov.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/")
    public String start() {
        System.out.println("Это строка в методе старт");
        return "index";
    }
    @GetMapping("/index")
    public String index() {
        System.out.println("Этот строка в методе index");
        return "index";
    }

    @GetMapping("/customer")
    public String second() {
        System.out.println("Это строка в методе customer");
        return "customer";
    }

    @GetMapping("/goods")
    public String goods() {
        System.out.println("Это строка из метода goods");
        return "goods";
    }

    @GetMapping("/orders")
    public String orders() {
        System.out.println("Это строка из метода orders");
        return "orders";
    }

    @GetMapping("/orderIter")
    public String orderIter() {
        System.out.println("Это строка из метода orderIter");
        return "orderIter";
    }








}
