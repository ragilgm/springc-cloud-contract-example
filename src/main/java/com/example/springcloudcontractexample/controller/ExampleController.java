package com.example.springcloudcontractexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : Ragil Gilang Maulana
 * @Date : 17/03/22
 **/

@RestController
public class ExampleController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
