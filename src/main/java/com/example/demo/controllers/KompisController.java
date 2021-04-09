package com.example.demo.controllers;

import com.example.demo.models.Book;
import com.example.demo.models.Kompis;
import com.example.demo.repos.DAO;
import com.example.demo.repos.DAOKompis;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KompisController {
    DAOKompis db=new DAOKompis();
    List<Kompis> minkompis= db.getAllKompis();

    @RequestMapping("/myfriends")
    public List<Kompis> index2(){
        return minkompis;
    }
    //return en kompis
    @RequestMapping("/myfriends/{id}")
    public Kompis kompisById (@PathVariable int id) {
        for (Kompis b : minkompis) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }
    @PostMapping("/myfriends/add")
    public String addKompis(@RequestBody Kompis e){
        minkompis.add(e);
        return"Kompis added";
    }
}
