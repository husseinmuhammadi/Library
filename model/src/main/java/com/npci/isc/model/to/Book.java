package com.npci.isc.model.to;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private Long id;

    private String name;

    private String title;

    private String description;
}
