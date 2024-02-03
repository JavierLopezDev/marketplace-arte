package com.dam.implementacionesDAO;

import com.dam.DAOs.CompradorDAO;
import com.dam.entidades.Comprador;
import com.dam.entidades.Obra;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CompradorDAOImpl implements CompradorDAO {

    EntityManagerFactory emf;
    EntityManager em;
    String up = "upArte";

    public CompradorDAOImpl() {
        emf = Persistence.createEntityManagerFactory(up);
    }

    @Override
    public boolean insertarComprador(Comprador comprador) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(comprador);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean editarComprador(Comprador comprador) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(comprador);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean borrarComprador(Comprador comprador) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(comprador);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public Comprador obtenerComprador(int idComprador) {
        em = emf.createEntityManager();
        return em.find(Comprador.class, idComprador);
    }

    @Override
    public boolean editarSaldo(int idComprador, double saldo) {
        em = emf.createEntityManager();
        Comprador comprador = obtenerComprador(idComprador);
        if (comprador == null) {
            return false;
        } else {
            try {
                em.getTransaction().begin();
                comprador.setSaldo(saldo);
                em.merge(comprador);
                em.getTransaction().commit();
                return true;
            } catch (Exception e) {
                em.getTransaction().rollback();
                return false;
            }
        }
    }
}