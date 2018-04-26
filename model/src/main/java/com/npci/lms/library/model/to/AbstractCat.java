package com.npci.lms.library.model.to;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public abstract class AbstractCat extends Animal {
    @Column(name = "CAT_SPEC")
    private String catSpecification;
}
