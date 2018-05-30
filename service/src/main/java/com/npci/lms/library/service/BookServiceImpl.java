package com.npci.lms.library.service;

import com.npci.lms.library.api.BookService;
import com.npci.lms.library.model.base.GenericDao;
import com.npci.lms.library.model.dao.BookDao;
import com.npci.lms.library.model.to.Book;
import com.npci.lms.library.service.base.GeneralServiceImpl;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(BookService.class)
public class BookServiceImpl extends GeneralServiceImpl<Book> implements BookService {
    @EJB
    BookDao dao;

    @Override
    public GenericDao<Book> getGenericDao() {
        return dao;
    }
}

