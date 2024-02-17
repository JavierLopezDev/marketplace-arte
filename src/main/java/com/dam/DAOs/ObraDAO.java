package com.dam.DAOs;

import com.dam.entidades.Obra;

import java.util.List;

public interface ObraDAO {

    public boolean insertarObra(Obra obra);
    public boolean editarObra(Obra obra);
    public boolean borrarObra(Obra obra);
    public Obra obtenerObra(int idObra);
    public boolean disponibilidadObra(int idObra, boolean disponibleVenta);
    public boolean addImagenObra(int idObra, String imagen);
    public boolean editarDescripcion(int idObra, String descripcion);
    public boolean addComprador(int idObra, int idComprador);
    public boolean addComprador(String nomObra, String nomComprador);
    public boolean addArtista(int idObra, int idArtista);
    public boolean addArtista(int idObra, String nomArtista);
    public boolean addArtista(String nombreObra, String nomArtista);
    public List<Obra> obtenerObrasEnVenta();
    public boolean editarPrecioObra(int idObra, double precio);
    public boolean borrarComprador(int idObra);

}
