package com.npci.lms.library.model.to;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookHistory {

    @Id
    private Long id;

    private String history;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
