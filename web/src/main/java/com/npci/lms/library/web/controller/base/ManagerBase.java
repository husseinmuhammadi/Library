package com.npci.lms.library.web.controller.base;

import com.npci.lms.library.api.GeneralService;
import com.npci.lms.library.model.to.Book;
import com.npci.lms.library.model.to.EntityBase;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

public abstract class ManagerBase<T extends EntityBase> implements Serializable {
    private List<T> templateObjects;

    public abstract GeneralService<T> getGeneralServiceApi();

    @PostConstruct
    private void init() {
        templateObjects = getGeneralServiceApi().findAll();
    }

    public List<T> getTemplateObjects() {
        return templateObjects;
    }

    public void setTemplateObjects(List<T> templateObjects) {
        this.templateObjects = templateObjects;
    }
}
