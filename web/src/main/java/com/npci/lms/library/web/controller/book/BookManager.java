package com.npci.lms.library.web.controller.book;

import com.npci.lms.library.api.BookService;
import com.npci.lms.library.model.to.Book;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class BookManager implements Serializable {

    private static final long serialVersionUID = -7262624294036362746L;

    private List<Book> books;

    @EJB
    private BookService service;

    @PostConstruct
    private void init() {
        books = service.findAll();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
