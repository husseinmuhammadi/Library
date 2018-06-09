package com.npci.lms.library.web.controller.sample.animal;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.time.LocalDateTime;

@Named
@SessionScoped
public class DateTimeViewerController implements Serializable {
    private static final long serialVersionUID = 6197192552516777095L;

    public String getMessage() {
        return "Hi there!";
    }

    public LocalDateTime getTime() {
        return LocalDateTime.now();
    }
}
