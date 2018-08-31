package com.dy.mapper;

import com.dy.bean.Book;

import java.util.List;

/**
 * Created by dy on 2018/8/31.
 */

public interface BookMapper {

    boolean addBooks(List<Book> list);

    boolean addOneBook(Book book);

    List<Book> getAllBooks();
}
