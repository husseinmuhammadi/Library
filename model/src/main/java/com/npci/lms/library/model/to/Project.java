package com.npci.lms.library.model.to;

import javax.persistence.*;

/**
 * https://marcin-chwedczuk.github.io/mapping-inheritance-in-hibernate
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Project {
    @Id
    private long id;
}