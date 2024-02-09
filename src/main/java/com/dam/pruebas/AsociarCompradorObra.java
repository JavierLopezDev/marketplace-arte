package com.dam.pruebas;

import com.dam.DAOs.ObraDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AsociarCompradorObra {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext("com.dam");
        ObraDAO obraDAO = appContext.getBean("obraDAOImpl", ObraDAO.class);
        obraDAO.addComprador(1,1);
    }
}
