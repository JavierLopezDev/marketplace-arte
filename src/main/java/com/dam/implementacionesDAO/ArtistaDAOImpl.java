package com.dam.implementacionesDAO;

import com.dam.DAOs.ArtistaDAO;
import com.dam.entidades.Administrador;
import com.dam.entidades.Artista;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArtistaDAOImpl implements ArtistaDAO {

    EntityManagerFactory emf;
    EntityManager em;
    String up = "upArte";

    public ArtistaDAOImpl() {
        emf = Persistence.createEntityManagerFactory(up);
    }

    @Override
    public boolean insertarArtista(Artista artista) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(artista);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            em.close();
        }
    }

    @Override
    public boolean editarArtista(Artista artista) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(artista);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean borrarArtista(Artista artista) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(artista);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public Artista obtenerArtista(int idArtista) {
        em = emf.createEntityManager();
        return em.find(Artista.class, idArtista);
    }

    @Override
    public Artista obtenerArtista(String usuario) {
        em = emf.createEntityManager();
        String hql = "from Artista a WHERE a.usuario = :usuario";
        if (em.createQuery(hql, Artista.class).setParameter("usuario", usuario).getResultList().isEmpty()) {
            return null;
        } else {
            return em.createQuery(hql, Artista.class).setParameter("usuario", usuario).getSingleResult();
        }
    }

    @Override
    public boolean addBiografia(int idArtista, String biografia) {
        em = emf.createEntityManager();
        Artista artista = em.find(Artista.class, idArtista);
        if (artista == null) {
            return false;
        } else {
            try {
                em.getTransaction().begin();
                artista.setBiografia(biografia);
                em.merge(artista);
                em.getTransaction().commit();
                return true;
            } catch (Exception e) {
                em.getTransaction().rollback();
                return false;
            }
        }
    }

    @Override
    public List<Artista> obtenerArtistas() {
        em = emf.createEntityManager();
        String hql = "from Artista a";
        return em.createQuery(hql, Artista.class).getResultList();
    }
}
