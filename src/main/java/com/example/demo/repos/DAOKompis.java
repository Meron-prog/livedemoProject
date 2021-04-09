package com.example.demo.repos;

import com.example.demo.models.Book;
import com.example.demo.models.Kompis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAOKompis {
    public List<Kompis> getAllKompis(){
        List<Kompis>myfriends=new ArrayList<>();

        Kompis a= new Kompis(1,"Abel","a1","111213");
        Kompis b= new Kompis(2,"Jhon","a2","145213");
        Kompis c= new Kompis(1,"Sile","a3","185213");
        Kompis d= new Kompis(1,"Meron","a4","169213");
         myfriends.add(a);
        myfriends.add(b);
        myfriends.add(c);
        myfriends.add(d);

        //return Arrays.asList(a,b,c,d);
        return myfriends;
    }
}
