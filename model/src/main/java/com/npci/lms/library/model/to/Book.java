package com.npci.lms.library.model.to;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "BOOK_SEQ")
public class Book extends EntityBase {
    //region Fields
    private String name;

    private String title;

    private String description;
    //endregion Fields

    //region Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //endregion Getter & Setter
}
