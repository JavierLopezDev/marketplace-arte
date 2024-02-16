package com.dam.pruebas;

import com.dam.DAOs.ArtistaDAO;
import com.dam.DAOs.CompradorDAO;
import com.dam.DAOs.ObraDAO;
import com.dam.entidades.Artista;
import com.dam.entidades.Comprador;
import com.dam.entidades.Obra;
import com.dam.implementacionesDAO.ArtistaDAOImpl;
import com.dam.implementacionesDAO.CompradorDAOImpl;
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

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("upArte");
        EntityManager em = emf.createEntityManager();

        ObraDAO obraDAO = appContext.getBean("obraDAOImpl", ObraDAO.class);
        Obra obra = appContext.getBean("obra", Obra.class);

        File file;
        FileInputStream fis;
        byte[] imagen;

        /*obra.setNombre("Best Friend #1");
        obra.setDisponibleVenta(true);
        obra.setPrecio(5);
        obra.setDescripcion("Best Friend #1 obra");
        file = new File("src/main/java/com/dam/imagenes/BestFriend#1.png");
        fis = new FileInputStream(file);
        imagen = new byte[(int) file.length()];
        fis.read(imagen);
        obra.setImagen(imagen);
        obraDAO.insertarObra(obra);*/

        ((AnnotationConfigApplicationContext) appContext).close();
    }
}
