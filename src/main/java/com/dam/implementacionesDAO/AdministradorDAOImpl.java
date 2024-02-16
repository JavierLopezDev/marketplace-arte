package com.dam.implementacionesDAO;

import com.dam.DAOs.AdministradorDAO;
import com.dam.entidades.Administrador;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.stereotype.Repository;

@Repository
public class AdministradorDAOImpl implements AdministradorDAO {

    EntityManagerFactory emf;
    EntityManager em;
    String up = "upArte";
    public AdministradorDAOImpl() {
        emf = Persistence.createEntityManagerFactory(up);
    }
    @Override
    public boolean insertarAdministrador(Administrador administrador) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(administrador);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean editarAdministrador(Administrador administrador) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(administrador);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean borrarAdministrador(Administrador administrador) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(administrador);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public Administrador obtenerAdministrador(int idAdministrador) {
        em = emf.createEntityManager();
        return em.find(Administrador.class, idAdministrador);
    }

    @Override
    public Administrador obtenerAdministrador(String usuario) {
        em = emf.createEntityManager();
        return em.find(Administrador.class, usuario);
    }
}
