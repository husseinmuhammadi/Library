package com.npci.lms.library.model.dao;

import com.npci.lms.library.model.base.GenericDao;
import com.npci.lms.library.model.to.Book;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class BookDao extends GenericDao<Book> {
    public BookDao() {
        super(Book.class);
    }

    @Override
    public List<Book> findAll() {
        return createNamedQuery(Book.FIND_ALL).getResultList();
    }
}
