package com.npci.lms.library.web.controller.book;

import com.npci.lms.library.api.BookService;
import com.npci.lms.library.api.GeneralService;
import com.npci.lms.library.model.to.Book;
import com.npci.lms.library.web.controller.base.ManagerBase;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class BookManager extends ManagerBase<Book> implements Serializable {

    private static final long serialVersionUID = -7262624294036362746L;

    @EJB
    private BookService service;

    @Override
    public GeneralService<Book> getGeneralServiceApi() {
        return service;
    }
}
