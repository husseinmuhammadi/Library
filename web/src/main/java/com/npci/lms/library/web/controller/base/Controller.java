package com.npci.lms.library.web.controller.base;

import java.io.Serializable;

public interface Controller extends Serializable {
    void onLoad();

    void afterLoad();
}
