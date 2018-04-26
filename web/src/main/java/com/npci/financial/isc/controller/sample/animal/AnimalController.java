package com.npci.financial.isc.controller.sample.animal;

import com.npci.financial.isc.api.sample.AnimalService;
import com.npci.isc.model.to.Animal;
import com.npci.isc.model.to.Dog;
import com.npci.isc.model.to.Kitten;
import com.npci.isc.model.to.LargeProject;

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
