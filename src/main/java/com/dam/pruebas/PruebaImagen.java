package com.dam.pruebas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PruebaImagen {
    public static void main(String[] args) throws IOException {

        File file;
        FileInputStream fis;
        byte[] imagen;

        file = new File("src/main/java/com/dam/imagenes/BestFriend#1.png");
        fis = new FileInputStream(file);
        imagen = new byte[(int) file.length()];
        System.out.println(fis.read(imagen));
    }
}
