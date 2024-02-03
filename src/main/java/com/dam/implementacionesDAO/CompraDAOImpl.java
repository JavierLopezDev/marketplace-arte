package com.dam.implementacionesDAO;

import com.dam.DAOs.CompraDAO;
import com.dam.entidades.Compra;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class CompraDAOImpl implements CompraDAO {

    EntityManagerFactory emf;
    EntityManager em;
    String up = "upArte";

    public CompraDAOImpl() {
        emf = Persistence.createEntityManagerFactory(up);
    }
    @Override
    public boolean insertarCompra(Compra compra) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(compra);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean editarCompra(Compra compra) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(compra);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean borrarCompra(Compra compra) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(compra);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public Compra obtenerCompra(int idCompra) {
        em = emf.createEntityManager();
        return em.find(Compra.class, idCompra);
    }

    @Override
    public List<Compra> obtenerCompras(int idComprador) {
        em = emf.createEntityManager();
        return em.createQuery("SELECT c FROM Compra c WHERE c.idComprador = :idComprador").getResultList();
    }
}
