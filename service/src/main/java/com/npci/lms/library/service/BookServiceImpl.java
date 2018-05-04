package com.npci.lms.library.service;

import com.npci.lms.library.api.BookService;
import com.npci.lms.library.model.dao.BookDao;
import com.npci.lms.library.model.to.Book;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
@Local(BookService.class)
public class BookServiceImpl implements BookService {
    @EJB
    BookDao dao;

    @Override
    public List<Book> findAll() {
        return dao.findAll();
    }

    @Override
    public Book save(Book book) {
        return dao.create(book);
    }
}

