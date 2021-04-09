package com.example.demo.controllers;

import com.example.demo.models.Book;
import com.example.demo.models.Kompis;
import com.example.demo.repos.DAO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    DAO db = new DAO();
    List<Book> mybooks = db.getAllBooks();

    @RequestMapping("/books")
    public List<Book> books() {
        return mybooks;
    }

    @RequestMapping("/book/{id}")
    public Book bookById(@PathVariable int id) {
        for (Book b : mybooks) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    @RequestMapping("/book/{id}/delete")
    public String deletebookById(@PathVariable int id) {
        int indexbookToRemove = -1;
        for (int i = 0; i < mybooks.size(); i++) {
            if (mybooks.get(i).getId() == id) {
                indexbookToRemove = i;
            }
        }
        if (indexbookToRemove != -1) {
            mybooks.remove(indexbookToRemove);
            return "Boken med id " + id + "är borttagen";
        }
        return "Boken med id " + id + "Kunde inte tas bort";

    }
    @PostMapping("/book/add")
    public String addBook(@RequestBody Book b6){
    mybooks.add(b6);
    return"Book added";
    }

}
