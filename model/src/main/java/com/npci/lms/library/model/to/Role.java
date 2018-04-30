package com.npci.lms.library.model.to;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "LROLE")
public class Role {
    @Id
    private Long id;

    private String role;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
