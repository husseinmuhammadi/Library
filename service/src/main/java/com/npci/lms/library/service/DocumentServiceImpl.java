package com.npci.lms.library.service;

import com.npci.lms.library.api.DocumentService;
import com.npci.lms.library.model.base.GenericDao;
import com.npci.lms.library.model.dao.DocumentDao;
import com.npci.lms.library.model.to.Document;
import com.npci.lms.library.service.base.GeneralServiceImpl;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(DocumentService.class)
public class DocumentServiceImpl extends GeneralServiceImpl<Document> implements DocumentService {

    //region EJB
    @EJB
    private DocumentDao dao;
    //endregion EJB

    //region Overrides
    @Override
    public GenericDao<Document> getGenericDao() {
        return dao;
    }
    //endregion Overrides
}

