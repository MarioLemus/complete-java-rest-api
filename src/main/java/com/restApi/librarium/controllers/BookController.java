package com.restApi.librarium.controllers;

import com.restApi.librarium.models.BookModel;
import com.restApi.librarium.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping(value = "book/{ID}")
    public BookModel getBook(@PathVariable Long ID) {
        BookModel data = null;
        try {
            data = bookService.getBook(ID);
        } catch (Exception e) {
            System.out.println(e);
        }
        return data;
    }

    @GetMapping(value = "books")
    public List<BookModel> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping(value = "book")
    public void setBook(@RequestBody BookModel book) {
        bookService.setBook(book);
    }
}
