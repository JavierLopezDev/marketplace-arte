package com.dam.datos;

import com.dam.DAOs.ArtistaDAO;
import com.dam.DAOs.ObraDAO;
import com.dam.entidades.Artista;
import com.dam.entidades.Obra;
import com.dam.implementacionesDAO.ArtistaDAOImpl;
import com.dam.implementacionesDAO.ObraDAOImpl;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InsertarObras {
    public static void main(String[] args) throws IOException {

        ApplicationContext appContext = new AnnotationConfigApplicationContext("com.dam");

        ArtistaDAO artistaDAO = appContext.getBean("artistaDAOImpl",ArtistaDAO.class);
        Artista artista = appContext.getBean("artista",Artista.class);

        artista.setIdArtista(1);
        artista.setUsuario("artista1");
        artista.setPassword("1234");
        artista.setNombreCompleto("Artista 1");
        artista.setEmail("artista1@gmail.com");
        artista.setNacionalidad("España");
        artista.setBiografia("Amante artista de los NFTs");
        artista.setTelefono("123456789");
        artista.setFechaNacimiento("08/05/2003");
        artistaDAO.insertarArtista(artista);



        /*File file;
        FileInputStream fis;
        byte[] imagen;

        ObraDAO obraDAO = new ObraDAOImpl();
        Obra obra = new Obra();
        obra.setNombre("Best Friend #1");
        obra.setDisponibleVenta(true);
        obra.setPrecio(5);
        *//*file = new File("src/main/java/com/dam/imagenes/BestFriend#1.png");
        fis = new FileInputStream(file);
        imagen = new byte[(int) file.length()];
        fis.read(imagen);
        obra.setImagen(imagen);*//*

        obraDAO.addArtista(obra.getIdObra(), artista.getIdArtista());
        *//*obraDAO.addArtista(obra2.getIdObra(), artista.getIdArtista());
        obraDAO.addArtista(obra3.getIdObra(), artista.getIdArtista());*//*

        obraDAO.insertarObra(obra);*/


        //System.out.println(obra);

        ((AnnotationConfigApplicationContext) appContext).close();
    }
}
