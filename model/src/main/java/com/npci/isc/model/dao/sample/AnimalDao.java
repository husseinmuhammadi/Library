package com.npci.isc.model.dao.sample;

import com.npci.isc.model.to.Animal;

import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Dependent
@Stateless
public class AnimalDao {
    @Inject
    private EntityManager entityManager;

    public Animal save(Animal animal){
        entityManager.persist(animal);
        return animal;
    }
}
