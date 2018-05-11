package com.npci.lms.library.api;

import com.npci.lms.library.model.to.EntityBase;

import java.util.List;

public interface GeneralService<T extends EntityBase> {
    T find(Long id);

    List<T> findAll();

    T save(T t);

    T update(T t);

    void remove(T t);
}