package com.example.candyshop.controller;

import com.example.candyshop.Repository.LollipopRespository;
import com.example.candyshop.model.Lollipop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    LollipopRespository lollipopRespository;

    @RequestMapping("/")
    public String getHello(){
        return "Hello World";
    }

    @RequestMapping("/Tong")
    public String getTong(){
        return "My name is Tong";
    }

    @RequestMapping("/GetAllData")
    public List<Lollipop> getAllData(){
        return lollipopRespository.findAll();
    }
}
