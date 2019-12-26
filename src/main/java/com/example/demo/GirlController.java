package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;
import java.util.ArrayList;
import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;
    @GetMapping(value = "/girls")
    public List<Girl> girls(){
        return girlRepository.findAll();
    }

    @PostMapping(value = "/girls")
    public List<Girl> addGirls(@RequestParam("cupSize") String cupSize,
                               @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        girlRepository.save(girl);
        return girlRepository.findAll();
    }
}
