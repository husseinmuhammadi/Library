package com.npci.lms.library.model.to;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ANIMAL_TYPE")
public abstract class Animal implements Serializable{
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "ANIMAL_TYPE", length = 1, nullable = false, insertable = false, updatable = false)
    private String animalType;

    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
