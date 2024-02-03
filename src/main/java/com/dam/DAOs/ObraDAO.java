package com.dam.DAOs;

import com.dam.entidades.Obra;

public interface ObraDAO {

    public boolean insertar(Obra obra);
    public boolean editar(Obra obra);
    public boolean borrar(Obra obra);
    public Obra obtenerObra(int idObra);
    public boolean disponibilidadObra(int idObra, boolean disponibleVenta);
    public boolean addImagenObra(int idObra, byte[] imagen);
    public boolean editarDescripcion(int idObra, String descripcion);
    public boolean addComprador(int idObra, int idComprador);
    public boolean addArtista(int idObra, int idArtista);
    public boolean editarPrecioObra(int idObra, double precio);
    public boolean borrarComprador(int idObra);

}
