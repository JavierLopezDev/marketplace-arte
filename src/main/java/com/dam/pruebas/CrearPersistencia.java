package com.dam.pruebas;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CrearPersistencia {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("upArte");
        EntityManager em = emf.createEntityManager();

        em.close();
        emf.close();

    }
}
