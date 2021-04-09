package com.example.demo.repos;

import com.example.demo.models.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAO {
    public List<Book>getAllBooks(){

        Book b1=new Book(1,"t1","a1");
        Book b2=new Book(2,"t2","a2");
        Book b3=new Book(3,"t3","a3");
        Book b4=new Book(4,"t4","a4");
       List<Book>mybooks=new ArrayList<>();
        mybooks.add(b1);
        mybooks.add(b2);
        mybooks.add(b3);
        mybooks.add(b4);

        return mybooks;
        //return Arrays.asList(b1,b2,b3,b4);

    }

}
