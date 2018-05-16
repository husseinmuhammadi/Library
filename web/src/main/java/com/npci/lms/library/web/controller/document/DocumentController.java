package com.npci.lms.library.web.controller.document;

import com.npci.lms.library.api.DocumentService;
import com.npci.lms.library.api.GeneralService;
import com.npci.lms.library.model.to.Document;
import com.npci.lms.library.web.controller.base.ControllerBase;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@Named
@ViewScoped
public class DocumentController extends ControllerBase<Document> {
    //region Constants

    private static final long serialVersionUID = -1325253760855767960L;

    //endregion Constants

    //region Service

    @EJB
    private DocumentService service;

    //endregion Service

    //region Fields

    //endregion Fields

    //region Overrides

    @Override
    public GeneralService<Document> getGeneralServiceApi() {
        return service;
    }

    @Override
    public void afterLoad() {

    }

    //endregion Overrides

    //region Methods

    public void download() {
        HttpServletResponse response = getHttpServletResponse();
        String fileName = t.getSubmittedFileName();
        response.setContentType(t.getContentType());
        response.setHeader("Content-Disposition", "inline;filename=\"" + fileName + "\"");
        byte[] content = getDocument().getContent();
        response.setContentLength(content.length);

        try (OutputStream outputStream = response.getOutputStream()) {
            outputStream.write(content, 0, content.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //endregion Methods

    //region Getter & Setter

    public Document getDocument() {
        return super.t;
    }

    public void setDocument(Document document) {
        super.t = document;
    }

    //endregion Getter & Setter
}
