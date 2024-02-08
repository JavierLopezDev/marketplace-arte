package com.dam.pruebas;

import com.dam.DAOs.ArtistaDAO;
import com.dam.entidades.Artista;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InsertarArtista {
    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext("com.dam");

        ArtistaDAO artistaDAO = appContext.getBean("artistaDAOImpl",ArtistaDAO.class);
        Artista artista = appContext.getBean("artista",Artista.class);

        artista.setUsuario("artista1");
        artista.setPassword("1234");
        artista.setNombreCompleto("Artista 1");
        artista.setEmail("artista1@gmail.com");
        artista.setNacionalidad("España");
        artista.setBiografia("Amante artista de los NFTs");
        artista.setTelefono("123456789");
        artista.setFechaNacimiento("08/05/2003");
        artistaDAO.insertarArtista(artista);
    }
}
