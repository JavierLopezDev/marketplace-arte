package com.dam.pruebas;

import com.dam.DAOs.ArtistaDAO;
import com.dam.DAOs.ObraDAO;
import com.dam.entidades.Artista;
import com.dam.entidades.Obra;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AsociarArtistasObras {
    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext("com.dam");

        Obra obra = appContext.getBean("obra", Obra.class);
        ObraDAO obraDAO = appContext.getBean("obraDAOImpl", ObraDAO.class);
        Artista artista = appContext.getBean("artista", Artista.class);
        ArtistaDAO artistaDAO = appContext.getBean("artistaDAOImpl", ArtistaDAO.class);

        obraDAO.addArtista(2,1);

        /*obra = obraDAO.obtenerObra(1);
        artista = artistaDAO.obtenerArtista(1);

        obra.setArtista(artista);
        artista.getObras().add(obra);

        obraDAO.editarObra(obra);

        obra = obraDAO.obtenerObra(2);
        obra.setArtista(artista);
        artista.getObras().add(obra);

        obraDAO.editarObra(obra);

        obra = obraDAO.obtenerObra(3);
        obra.setArtista(artista);
        artista.getObras().add(obra);

        obraDAO.editarObra(obra);*/

    }
}
