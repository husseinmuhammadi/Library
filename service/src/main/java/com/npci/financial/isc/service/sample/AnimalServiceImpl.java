package com.npci.financial.isc.service.sample;

import com.npci.financial.isc.api.sample.AnimalService;
import com.npci.isc.model.dao.sample.AnimalDao;
import com.npci.isc.model.to.Animal;

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

