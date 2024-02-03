package com.dam.entidades;

import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "COMPRA")
@Scope("prototype")
public class Compra {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idCompra")
    @SequenceGenerator(name = "idCompra", sequenceName = "SEQ_COMPRA", allocationSize = 1)
    @Id
    private int idCompra;
    private String fecha;
    private double importe;

    @ManyToOne
    @JoinColumn(name = "idComprador")
    private Comprador idComprador;

    @ManyToOne
    @JoinColumn(name = "idObra")
    private Obra idObra;

    public Compra() {}

    public Compra(int idCompra, String fecha, double importe, Comprador idComprador, Obra idObra) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.importe = importe;
        this.idComprador = idComprador;
        this.idObra = idObra;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Comprador getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(Comprador idComprador) {
        this.idComprador = idComprador;
    }

    public Obra getIdObra() {
        return idObra;
    }

    public void setIdObra(Obra idObra) {
        this.idObra = idObra;
    }

    @Override
    public String toString() {
        return "Compra --> " +
                "idCompra: " + idCompra +
                " | fecha: '" + fecha +
                " | importe: " + importe +
                " | idComprador: " + idComprador +
                " | idObra: " + idObra;
    }
}
