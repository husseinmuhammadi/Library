package com.npci.lms.library.web.controller.document;

import com.npci.lms.library.api.DocumentService;
import com.npci.lms.library.model.to.Document;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Part;
import java.io.InputStream;
import java.io.Serializable;

@Named
@ViewScoped
public class DocumentUploadController implements Serializable {

    //region Constants
    private static final long serialVersionUID = 3574461255586383003L;
    //endregion Constants

    //region Service
    @EJB
    private DocumentService service;
    //endregion Service

    //region Fields
    private Part part;

    private Document document;
    //endregion Fields

    //region Getter & Setter

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    //endregion Getter & Setter

    //region Methods
    public void uploadFile() {
        Document document = new Document();
        try (InputStream is = part.getInputStream();) {
            document.setContent(new byte[new Long(part.getSize()).intValue()]);
            is.read(document.getContent());

            service.save(document);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //endregion Methods
}

