package com.dam.DAOs;

import com.dam.entidades.Artista;

public interface ArtistaDAO {

    public boolean insertarArtista(Artista artista);
    public boolean editarArtista(Artista artista);
    public boolean borrarArtista(Artista artista);
    public Artista obtenerArtista(int idArtista);
    public boolean addBiografia(int idArtista, String biografia);
}
