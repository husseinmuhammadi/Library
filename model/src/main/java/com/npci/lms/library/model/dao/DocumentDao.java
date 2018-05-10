package com.npci.lms.library.model.dao;

import com.npci.lms.library.model.base.GenericDao;
import com.npci.lms.library.model.to.Book;
import com.npci.lms.library.model.to.Document;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class DocumentDao extends GenericDao<Document> {
    public DocumentDao() {
        super(Document.class);
    }

    @Override
    public List<Document> findAll() {
        return createNamedQuery(Document.FIND_ALL).getResultList();
    }
}
