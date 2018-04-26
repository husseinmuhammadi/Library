package com.npci.financial.isc.controller;

import com.npci.financial.isc.api.SampleService;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class SampleController implements Serializable {
    private static final long serialVersionUID = -4429041252452493563L;

    @EJB
    private SampleService service;

    public void request() {
        service.request();
    }

}
