package com.npci.lms.library.service.base;

import com.npci.lms.library.api.GeneralService;
import com.npci.lms.library.model.base.GenericDao;
import com.npci.lms.library.model.to.EntityBase;

import java.util.List;

public abstract class GeneralServiceImpl<T extends EntityBase> implements GeneralService<T> {

    public GeneralServiceImpl() {
    }

    public abstract GenericDao<T> getGenericDao();

    @Override
    public T save(T t) {
        return getGenericDao().create(t);
    }

    @Override
    public List<T> findAll() {
        return getGenericDao().findAll();
    }

    @Override
    public T find(Long id) {
        return getGenericDao().findById(id);
    }

    @Override
    public T update(T t) {
        return getGenericDao().update(t);
    }

    @Override
    public void remove(T t) {
        getGenericDao().remove(t);
    }
}