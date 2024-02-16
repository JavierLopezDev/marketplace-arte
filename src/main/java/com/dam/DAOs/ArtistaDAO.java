package com.dam.DAOs;

import com.dam.entidades.Artista;

import java.util.List;

public interface ArtistaDAO {

    public boolean insertarArtista(Artista artista);
    public boolean editarArtista(Artista artista);
    public boolean borrarArtista(Artista artista);
    public Artista obtenerArtista(int idArtista);
    public Artista obtenerArtista(String usuario);
    public boolean addBiografia(int idArtista, String biografia);
    public List<Artista> obtenerArtistas();
}
