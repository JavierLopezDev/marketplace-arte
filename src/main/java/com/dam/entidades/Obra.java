package com.dam.entidades;


import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Entity
@Table(name = "OBRA")
@Scope("prototype")
public class Obra {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idObra")
    @SequenceGenerator(name = "idObra", sequenceName = "SEQ_OBRA", allocationSize = 1)
    @Id
    private int idObra;
    @Column(unique = true)
    private String nombre;
    private double precio;
    private boolean disponibleVenta;
    private String descripcion;
    private String imagen;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idArtista", nullable = true)
    private Artista artista;

    @ManyToOne
    @JoinColumn(name = "idComprador", nullable = true)
    private Comprador comprador;


    public Obra() {}

    public Obra(String nombre, double precio, boolean disponibleVenta, String descripcion, String imagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponibleVenta = disponibleVenta;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public Obra(int idObra, String nombre, double precio, boolean disponibleVenta, String descripcion, String imagen) {
        this.idObra = idObra;
        this.nombre = nombre;
        this.precio = precio;
        this.disponibleVenta = disponibleVenta;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public Obra( String nombre, double precio, boolean disponibleVenta, String descripcion, String imagen, Artista artista, Comprador comprador) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponibleVenta = disponibleVenta;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.artista = artista;
        this.comprador = comprador;
    }

    public Obra(int idObra, String nombre, double precio, boolean disponibleVenta, String descripcion, String imagen, Artista artista, Comprador comprador) {
        this.idObra = idObra;
        this.nombre = nombre;
        this.precio = precio;
        this.disponibleVenta = disponibleVenta;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.artista = artista;
        this.comprador = comprador;
    }

    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibleVenta() {
        return disponibleVenta;
    }

    public void setDisponibleVenta(boolean disponibleVenta) {
        this.disponibleVenta = disponibleVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    @Override
    public String toString() {
        return "Obra --> " +
                "idObra: " + idObra +
                " | Nombre: '" + nombre +
                " | Precio: "+ precio +
                " | disponibleVenta: " + disponibleVenta +
                " | descripcion: '" + descripcion +
                " | imagen: " + imagen //+
                /*" | artista: " + artista.toString() +
                " | comprador: " + comprador.toString()*/;
    }
}
