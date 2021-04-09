package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
   public String index(){
        return "Hello World";
 }
    @RequestMapping("/a")
    public String index2(){
        return "Hola Mundo";
    }
    @RequestMapping("/num")
    public int index3() {
        Random rand = new Random();
        int numbers = rand.nextInt(10)+1;
        return numbers;
    }



}

