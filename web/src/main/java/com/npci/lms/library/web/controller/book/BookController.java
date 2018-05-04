package com.npci.lms.library.web.controller.book;

import com.npci.lms.library.api.BookService;
import com.npci.lms.library.model.to.Book;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.application.ProjectStage;
import javax.faces.context.FacesContext;
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
        try {
            service.save(book);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Book saved sucessfully"));
        } catch (Exception e) {
            e.printStackTrace();
            // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error while saving book", e.getMessage()));
            printErrorMessage(e);
        }
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    protected void printErrorMessage(Throwable e) {
        // ResourceBundle resourceBundle = ResourceManager.getMessageBundle();
        // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(resourceBundle.getString("request.error")));
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("request.error"));

        ProjectStage projectStage = FacesContext.getCurrentInstance().getApplication().getProjectStage();
        if (projectStage != null && projectStage.equals(ProjectStage.Development)) {
            Throwable cause = e.getCause();
            if (cause == null)
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(e.toString()));
            while (cause != null /* && !(cause instanceof SQLException)*/) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(cause.toString()));

                // if (cause instanceof javax.persistence.PersistenceException) entity.setId(null);

                cause = cause.getCause();
            }
        }
    }
}
