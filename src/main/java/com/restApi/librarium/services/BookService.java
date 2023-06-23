package com.restApi.librarium.services;

import com.restApi.librarium.models.BookModel;
import com.restApi.librarium.repos.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private IBookRepo bookRepo;

    public BookModel getBook(Long ID) throws Exception {
        if (ID < 0) throw new Exception("ID must be positive number");
        return bookRepo.getReferenceById(ID);
    }

    @GetMapping("books")
    public List<BookModel> getBooks() {
        return bookRepo.findAll();
    }
    public void setBook(BookModel book) {
        bookRepo.save(book);
    }
}
