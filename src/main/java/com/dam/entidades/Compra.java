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
    private Comprador compradorId;

    @ManyToOne
    @JoinColumn(name = "idObra")
    private Obra obraId;

    public Compra() {}

    public Compra(int idCompra, String fecha, double importe, Comprador compradorId, Obra obraId) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.importe = importe;
        this.compradorId = compradorId;
        this.obraId = obraId;
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

    public Comprador getCompradorId() {
        return compradorId;
    }

    public void setCompradorId(Comprador idComprador) {
        this.compradorId = idComprador;
    }

    public Obra getObraId() {
        return obraId;
    }

    public void setObraId(Obra idObra) {
        this.obraId = idObra;
    }

    @Override
    public String toString() {
        return "Compra --> " +
                "idCompra: " + idCompra +
                " | fecha: '" + fecha +
                " | importe: " + importe +
                " | idComprador: " + compradorId.getIdComprador() +
                " | idObra: " + obraId.getIdObra();
    }
}
