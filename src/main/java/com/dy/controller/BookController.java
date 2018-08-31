package com.dy.controller;

import com.dy.bean.Book;
import com.dy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by dy on 2018/8/31.
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/addOneBook", method = RequestMethod.PUT)
    public void addOneBook(@RequestBody Book book) {
        bookService.addOneBook(book);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
