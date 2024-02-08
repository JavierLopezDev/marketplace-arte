package com.dam.pruebas;

import com.dam.DAOs.CompradorDAO;
import com.dam.entidades.Comprador;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InsertarComprador {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext("com.dam");

        CompradorDAO compradorDAO = appContext.getBean("compradorDAOImpl",CompradorDAO.class);
        Comprador comprador = appContext.getBean("comprador",Comprador.class);

        comprador.setUsuario("comprador1");
        comprador.setPassword("1234");
        comprador.setNombreCompleto("Comprador 1");
        comprador.setEmail("comprador1@gmail.com");
        comprador.setSaldo(10);
        compradorDAO.insertarComprador(comprador);
    }
}
