package com.npci.lms.library.api;

import com.npci.lms.library.model.to.Book;
import com.npci.lms.library.model.to.Document;

import java.util.List;

public interface DocumentService {
    List<Document> findAll();

    Document save(Document document);

    Document update(Document document);
}
