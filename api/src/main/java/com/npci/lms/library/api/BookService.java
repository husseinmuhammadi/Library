package com.npci.lms.library.api;

import com.npci.lms.library.model.to.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();

    Book save(Book book);

    Book update(Book book);
}
