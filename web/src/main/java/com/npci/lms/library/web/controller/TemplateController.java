package com.npci.lms.library.web.controller;

import com.npci.lms.library.web.controller.user.UserInformation;
import org.apache.shiro.SecurityUtils;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Locale;

@Named
@SessionScoped
public class TemplateController implements Serializable {

    private static final long serialVersionUID = -4753352775816088030L;
    @Inject
    private UserInformation userInformation;

    private String localeValue = "en_US";

    private boolean administrator = true;

    public String getLocaleValue() {
        // administrator = SecurityUtils.getSubject().hasRole("administrator");
        return localeValue;
    }

    @PostConstruct
    private void init() {
        FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale("en", "US"));
    }

    public UserInformation getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    public boolean isAdministrator() {
        return administrator;
    }
}
