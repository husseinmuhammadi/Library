package com.npci.lms.library.web.controller.document;

import com.npci.lms.library.api.DocumentService;
import com.npci.lms.library.api.GeneralService;
import com.npci.lms.library.model.to.Document;
import com.npci.lms.library.web.controller.base.ManagerBase;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.List;

@Named
@ViewScoped
public class DocumentManager extends ManagerBase<Document> {
    //region Constants

    private static final long serialVersionUID = -5002171001755740308L;

    //endregion Constants

    //region Service

    @EJB
    private DocumentService service;

    //endregion Service

    //region Fields

    //endregion Fields

    //region Methods

    //endregion Methods

    //region Overrides

    @Override
    public GeneralService<Document> getGeneralServiceApi() {
        return service;
    }

    //endregion Overrides

    //region Getter & Setter

    //endregion Getter & Setter
}
