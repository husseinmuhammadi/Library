package com.npci.lms.library.service;

import com.npci.lms.library.api.DocumentService;
import com.npci.lms.library.model.dao.DocumentDao;
import com.npci.lms.library.model.to.Document;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
@Local(DocumentService.class)
public class DocumentServiceImpl implements DocumentService {
    @EJB
    DocumentDao dao;

    @Override
    public List<Document> findAll() {
        return dao.findAll();
    }

    @Override
    public Document save(Document book) {
        return dao.create(book);
    }

    @Override
    public Document update(Document book) {
        return dao.update(book);
    }
}

