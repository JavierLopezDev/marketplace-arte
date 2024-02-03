package com.dam.implementacionesDAO;

import com.dam.DAOs.ObraDAO;
import com.dam.entidades.Artista;
import com.dam.entidades.Comprador;
import com.dam.entidades.Obra;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ObraDAOImpl implements ObraDAO {

    EntityManagerFactory emf;
    EntityManager em;
    String up = "upArte";

    public ObraDAOImpl() {
        emf = Persistence.createEntityManagerFactory(up);
    }
    @Override
    public boolean insertarObra(Obra obra) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(obra);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean editarObra(Obra obra) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(obra);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean borrarObra(Obra obra) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(obra);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public Obra obtenerObra(int idObra) {
        em = emf.createEntityManager();
        return em.find(Obra.class, idObra);
    }

    @Override
    public boolean disponibilidadObra(int idObra, boolean disponibleVenta) {
        em = emf.createEntityManager();
        Obra obra = obtenerObra(idObra);
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
        Obra obra = obtenerObra(idObra);
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
    public boolean editarDescripcion(int idObra, String descripcion) {
        em = emf.createEntityManager();
        Obra obra = obtenerObra(idObra);
        if (obra == null) {
            return false;
        } else {
            try {
                em.getTransaction().begin();
                obra.setDescripcion(descripcion);
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
    public boolean addComprador(int idObra, int idComprador) {
        em = emf.createEntityManager();
        Obra obra = obtenerObra(idObra);
        Comprador comprador = em.find(Comprador.class, idComprador);
        if (obra == null && comprador == null) {
            return false;
        } else {
            try {
                em.getTransaction().begin();
                obra.setComprador(comprador);
                comprador.getInventario().add(obra);
                em.merge(obra);
                em.merge(comprador);
                em.getTransaction().commit();
                return true;
            } catch (Exception e) {
                em.getTransaction().rollback();
                return false;
            }
        }
    }

    @Override
    public boolean addArtista(int idObra, int idArtista) {
        em = emf.createEntityManager();
        Obra obra = obtenerObra(idObra);
        Artista artista = em.find(Artista.class, idArtista);
        if (obra == null && artista == null) {
            return false;
        } else {
            try {
                em.getTransaction().begin();
                obra.setArtista(artista);
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
    public boolean editarPrecioObra(int idObra, double precio) {
        em = emf.createEntityManager();
        Obra obra = obtenerObra(idObra);
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
    public boolean borrarComprador(int idObra) {
        em = emf.createEntityManager();
        Obra obra = obtenerObra(idObra);
        Comprador comprador = new Comprador();
        if (obra == null) {
            return false;
        } else {
            try {
                em.getTransaction().begin();
                obra.setComprador(comprador);
                comprador.getInventario().remove(obra);
                em.merge(obra);
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
