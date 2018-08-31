package com.dy.service;

import com.dy.bean.Book;
import com.dy.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dy on 2018/8/31.
 */
@Service
public class BookService {

    @Autowired
    BookMapper bookMapper;

    /**
     * 往书库添加书
     * @param book
     */
    public void addOneBook(Book book) {
        bookMapper.addOneBook(book);
    }

    /**
     * 获取所有的书籍
     * @return
     */
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }
}
