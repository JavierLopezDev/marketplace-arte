package com.dam.implementacionesDAO;

import com.dam.DAOs.ArtistaDAO;
import com.dam.entidades.Artista;
import com.dam.entidades.Obra;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ArtistaDAOImpl implements ArtistaDAO {

    EntityManagerFactory emf;
    EntityManager em;
    String up = "upArte";

    public ArtistaDAOImpl() {
        emf = Persistence.createEntityManagerFactory(up);
    }

    @Override
    public boolean insertar(Artista artista) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(artista);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean editar(Artista artista) {
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
    public boolean borrar(Artista artista) {
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
    public boolean asignarPrecioObra(int idObra, double precio) {
        em = emf.createEntityManager();
        Obra obra = em.find(Obra.class, idObra);
        if (obra == null) {
            return false;
        } else {
            try {
                em.getTransaction().begin();
                obra.setPrecio(precio);
                em.merge(obra);
                em.getTransaction().commit();
                return true;
            } catch (Exception e) {
                em.getTransaction().rollback();
                return false;
            }
        }
    }

    @Override
    public boolean disponibilidadObra(int idObra, boolean disponibleVenta) {
        em = emf.createEntityManager();
        Obra obra = em.find(Obra.class, idObra);
        if (obra == null) {
            return false;
        } else {
            try {
                em.getTransaction().begin();
                obra.setDisponibleVenta(disponibleVenta);
                em.merge(obra);
                em.getTransaction().commit();
                return true;
            } catch (Exception e) {
                em.getTransaction().rollback();
                return false;
            }
        }
    }

    @Override
    public boolean addImagenObra(int idObra, byte[] imagen) {
        em = emf.createEntityManager();
        Obra obra = em.find(Obra.class, idObra);
        if (obra == null) {
            return false;
        } else {
            try {
                em.getTransaction().begin();
                obra.setImagen(imagen);
                em.merge(obra);
                em.getTransaction().commit();
                return true;
            } catch (Exception e) {
                em.getTransaction().rollback();
                return false;
            }
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
}
