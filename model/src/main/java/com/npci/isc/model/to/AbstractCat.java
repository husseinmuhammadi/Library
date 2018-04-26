package com.npci.isc.model.to;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@Entity
public abstract class AbstractCat extends Animal {
    @Column(name = "CAT_SPEC")
    private String catSpecification;
}
