package com.npci.lms.library.web.controller;

import com.npci.lms.library.web.controller.base.ManagerBase;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class MenuController extends ManagerBase {

    private static final long serialVersionUID = 6681198964562456692L;

    private String menuSelect;

    public String getMenuSelect() {
        return menuSelect;
    }

    public void setMenuSelect(String menuSelect) {
        this.menuSelect = menuSelect;
    }

    public void showSelected() {

        System.out.println(menuSelect);
    }
}
