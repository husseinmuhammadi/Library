package com.npci.lms.library.model.to;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RolePermission {

    @Id
    private Long id;

    private String permission;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
