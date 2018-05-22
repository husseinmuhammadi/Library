package com.npci.lms.library.model.base;

import com.npci.lms.library.model.annotation.Secondary;

import javax.ejb.Singleton;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;

@Singleton
public class SecondaryEntityManagerProvider {
    @PersistenceContext(unitName = "secondary-persistence-unit")
    private EntityManager entityManager;

    @Secondary
    @Produces
    @RequestScoped
    public EntityManager getEntityManager() {
        entityManager.setFlushMode(FlushModeType.COMMIT);
        return entityManager;
    }
}
