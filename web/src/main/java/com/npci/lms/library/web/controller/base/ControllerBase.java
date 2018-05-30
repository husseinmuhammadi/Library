package com.npci.lms.library.web.controller.base;

import com.npci.lms.library.api.GeneralService;
import com.npci.lms.library.model.to.Book;
import com.npci.lms.library.model.to.EntityBase;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.IOException;

public abstract class ControllerBase<T extends EntityBase> extends SimpleController implements Controller {

    //region Constants

    private static final long serialVersionUID = 3458464883193090157L;

    //endregion Constants

    //region Fields

    private Long id;

    protected T t;

    //endregion Fields

    //region Overrides

    @Override
    public void onLoad() {
        if (id != null) {
            t = getGeneralServiceApi().find(id);
            if (t == null) {
                try {
                    FacesContext.getCurrentInstance().getExternalContext().dispatch("index");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        afterLoad();
    }

    //endregion Overrides

    //region Methods

    public abstract GeneralService<T> getGeneralServiceApi();

    public void save() {
        try {
            getGeneralServiceApi().save(t);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Book saved successfully"));
        } catch (Exception e) {
            e.printStackTrace();
            // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error while saving book", e.getMessage()));
            printErrorMessage(e);
        }
    }

    public void edit() {
        try {
            t = getGeneralServiceApi().update(t);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Book edited successfully to version " + t.getVersion()));
        } catch (Exception e) {
            e.printStackTrace();
            // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error while saving book", e.getMessage()));
            printErrorMessage(e);
        }
    }

    //endregion Methods

    //region Getter & Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public T getTemplateObject() {
        return t;
    }

    public void setTemplateObject(T t) {
        this.t = t;
    }

    //endregion Getter & Setter
}
