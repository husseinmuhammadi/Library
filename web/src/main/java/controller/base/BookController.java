package controller.base;

import dao.BookDao;
import to.Book;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class BookController implements Serializable {

    @EJB
    private BookDao dao;

    private Book book;

    public BookController() {
        book = new Book();
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String insertBook() {
        dao.save(book);
        // return "insertResponse";
        return null;
    }
}
