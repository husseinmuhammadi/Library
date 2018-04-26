package com.npci.lms.library.service;

import com.npci.lms.library.api.BookService;
import com.npci.lms.library.model.dao.BookDao;
import com.npci.lms.library.model.to.Book;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(BookService.class)
public class BookServiceImpl implements BookService {
    @EJB
    BookDao dao;

    @Override
    public Book save(Book book) {
        return dao.save(book);
    }
}

