package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pesu on 2018/3/29.
 */
@RestController
@RequestMapping("/springboot")
public class HelloWorldController {

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public String showWorld(@PathVariable("name") String name){
        return " hello " +name;
    }
}
