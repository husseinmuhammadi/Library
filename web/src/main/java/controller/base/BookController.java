package controller.base;

import to.Book;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class BookController implements Serializable {
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
//        EntityManager entityManager = JPAProvider.getEntityManagerFactory().createEntityManager();
//        EntityTransaction entityTransaction = entityManager.getTransaction();
//        entityTransaction.begin();
//        entityManager.persist(book);
//        entityTransaction.commit();
//        entityManager.close();
        return "insertResponse";
    }
}
