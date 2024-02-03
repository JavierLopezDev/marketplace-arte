package com.dam.DAOs;

import com.dam.entidades.Artista;
import com.dam.entidades.Obra;

public interface ArtistaDAO {

    public boolean insertar(Artista artista);
    public boolean editar(Artista artista);
    public boolean borrar(Artista artista);
    public Artista obtenerArtista(int idArtista);
    public boolean addBiografia(int idArtista, String biografia);
}
