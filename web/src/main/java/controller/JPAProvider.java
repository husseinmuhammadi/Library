package controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAProvider {
    private static final EntityManagerFactory entityManagerFactory;
    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("library-persistence-unit");
    }
    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

}
