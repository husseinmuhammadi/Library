package com.npci.lms.library.controller.sample.animal;

import com.npci.lms.library.api.sample.AnimalService;
import com.npci.lms.library.model.to.Animal;
import com.npci.lms.library.model.to.Kitten;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class AnimalController implements Serializable {

    private Animal animal;

    @EJB
    private AnimalService service;

    @PostConstruct
    private void init() {
        animal = new Kitten();
    }

    public void save() {
        service.save(animal);
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
