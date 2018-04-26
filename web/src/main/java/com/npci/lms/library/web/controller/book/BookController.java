package com.npci.lms.library.web.controller.book;

import com.npci.lms.library.api.BookService;
import com.npci.lms.library.api.sample.AnimalService;
import com.npci.lms.library.model.to.Animal;
import com.npci.lms.library.model.to.Book;
import com.npci.lms.library.model.to.Kitten;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class BookController implements Serializable {

    private Book book;

    @EJB
    private BookService service;

    @PostConstruct
    private void init() {
        book = new Book();
    }

    public void save() {
        service.save(book);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
