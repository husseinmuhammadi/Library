package com.npci.lms.library.model.to;

import javax.persistence.*;

import static com.npci.lms.library.model.to.Book.FIND_ALL;

@Entity
@Table(name = "BOOK")
@SequenceGenerator(name = "SEQ_GENERATOR", sequenceName = "BOOK_SEQ")
@NamedQueries({
        @NamedQuery(name = FIND_ALL, query = "select t from Book t where t.deleted = false ")
})
public class Book extends EntityBase {
    //region Constants
    public static final String FIND_ALL = "Book.findAll";
    //endregion Constants

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
