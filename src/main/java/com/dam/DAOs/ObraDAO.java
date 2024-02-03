package com.dam.DAOs;

import com.dam.entidades.Obra;

public interface ObraDAO {

    public boolean insertarObra(Obra obra);
    public boolean editarObra(Obra obra);
    public boolean borrarObra(Obra obra);
    public Obra obtenerObra(int idObra);
    public boolean disponibilidadObra(int idObra, boolean disponibleVenta);
    public boolean addImagenObra(int idObra, byte[] imagen);
    public boolean editarDescripcion(int idObra, String descripcion);
    public boolean addComprador(int idObra, int idComprador);
    public boolean addArtista(int idObra, int idArtista);
    public boolean editarPrecioObra(int idObra, double precio);
    public boolean borrarComprador(int idObra);

}
