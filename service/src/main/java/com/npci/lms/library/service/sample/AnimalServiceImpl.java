package com.npci.lms.library.service.sample;

import com.npci.lms.library.api.sample.AnimalService;
import com.npci.lms.library.model.dao.sample.AnimalDao;
import com.npci.lms.library.model.to.Animal;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(AnimalService.class)
public class AnimalServiceImpl implements AnimalService {
    @EJB
    AnimalDao dao;

    @Override
    public Animal save(Animal animal) {
        return dao.save(animal);
    }
}

