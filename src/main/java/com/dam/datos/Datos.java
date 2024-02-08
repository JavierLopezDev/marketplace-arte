package com.dam.datos;

import com.dam.DAOs.*;
import com.dam.entidades.*;
import com.dam.implementacionesDAO.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Datos {

    public static void main(String[] args) throws IOException {

        File file;
        FileInputStream fis;
        byte[] imagen = null;

        // ADMINISTRADOR

        AdministradorDAO administradorDAO = new AdministradorDAOImpl();
        Administrador admin = new Administrador();
        admin.setUsuario("admin");
        admin.setPassword("admin");
        administradorDAO.insertarAdministrador(admin);

        // OBRA

        ObraDAO obraDAO = new ObraDAOImpl();
        Obra obra = new Obra();
        obra.setNombre("Best Friend #1");
        obra.setDisponibleVenta(true);
        obra.setPrecio(5);
        file = new File("src/main/java/com/dam/imagenes/BestFriend#1.png");
        fis = new FileInputStream(file);
        imagen = new byte[(int) file.length()];
        fis.read(imagen);
        obra.setImagen(imagen);
        obraDAO.insertarObra(obra);

        Obra obra2 = new Obra();
        obra2.setNombre("Best Friend #5");
        obra2.setDisponibleVenta(true);
        obra2.setPrecio(5);
        file = new File("src/main/java/com/dam/imagenes/BestFriend#5.png");
        fis = new FileInputStream(file);
        fis.read(imagen);
        imagen = new byte[(int) file.length()];
        obra2.setImagen(imagen);
        obraDAO.insertarObra(obra2);

        Obra obra3 = new Obra();
        obra3.setNombre("Best Friend #48");
        obra3.setDisponibleVenta(true);
        obra3.setPrecio(5);
        file = new File("src/main/java/com/dam/imagenes/BestFriend#48.png");
        fis = new FileInputStream(file);
        fis.read(imagen);
        imagen = new byte[(int) file.length()];
        obra3.setImagen(imagen);
        obraDAO.insertarObra(obra3);


        // ARTISTA

        ArtistaDAO artistaDAO = new ArtistaDAOImpl();
        Artista artista = new Artista();
        artista.setUsuario("artista1");
        artista.setPassword("1234");
        artista.setNombreCompleto("Artista 1");
        artista.setEmail("artista1@gmail.com");
        artista.setNacionalidad("España");
        artista.setBiografia("Amante artista de los NFTs");
        artista.setTelefono("123456789");
        artista.setFechaNacimiento("08/05/2003");
        artistaDAO.insertarArtista(artista);

        // COMPRADOR

        CompradorDAO compradorDAO = new CompradorDAOImpl();
        Comprador comprador = new Comprador();
        comprador.setUsuario("comprador1");
        comprador.setPassword("1234");
        comprador.setNombreCompleto("Comprador 1");
        comprador.setEmail("comprador1@gmail.com");
        comprador.setSaldo(10);
        compradorDAO.insertarComprador(comprador);

        // COMPRA

        CompraDAO compraDAO = new CompraDAOImpl();
        Compra compra = new Compra();
        compra.setFecha("07/02/2024");
        compra.setImporte(5);
        compra.setCompradorId(compradorDAO.obtenerComprador(comprador.getIdComprador()));
        compra.setObraId(obraDAO.obtenerObra(obra.getIdObra()));
        compraDAO.insertarCompra(compra);

        // ASOCIAR OBRAS CON ARTISTAS Y COMPRADORES

        obraDAO.addArtista(obra.getIdObra(), artista.getIdArtista());
        obraDAO.addArtista(obra2.getIdObra(), artista.getIdArtista());
        obraDAO.addArtista(obra3.getIdObra(), artista.getIdArtista());

        obraDAO.addComprador(obra.getIdObra(), comprador.getIdComprador());


    }
}
