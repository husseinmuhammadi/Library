package com.npci.lms.library.web.controller.book;

import com.npci.lms.library.api.BookService;
import com.npci.lms.library.api.GeneralService;
import com.npci.lms.library.model.to.Book;
import com.npci.lms.library.web.controller.base.ControllerBase;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.application.ProjectStage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.xml.transform.Templates;
import java.io.Serializable;

@Named
@ViewScoped
public class BookController extends ControllerBase<Book> implements Serializable {

    //region Constants
    private static final long serialVersionUID = -2013781764891045591L;
    //endregion Constants

    //region Service
    @EJB
    private BookService service;
    //endregion Service

    //region Overrides
    @Override
    public GeneralService<Book> getGeneralServiceApi() {
        return service;
    }

    @Override
    public void afterLoad() {

    }
    //endregion Overrides

    @PostConstruct
    private void init() {
        templateObject = new Book();
    }
}
