package com.dam.entidades;

import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Entity
@Table(name = "COMPRADOR")
@Scope("prototype")
public class Comprador {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idComprador")
    @SequenceGenerator(name = "idComprador", sequenceName = "SEQ_COMPRADOR", allocationSize = 1)
    @Id
    private int idComprador;
    private String usuario;
    private String password;
    private String nombreCompleto;
    private String email;
    private double saldo;

    @OneToMany
    @JoinColumn(name = "idObra")
    private ArrayList<Obra> compras = new ArrayList<Obra>();

    public Comprador() {}

    public Comprador(int idComprador, String usuario, String password, String nombreCompleto, String email, double saldo) {
        this.idComprador = idComprador;
        this.usuario = usuario;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.saldo = saldo;
    }

    public Comprador(int idComprador, String usuario, String password, String nombreCompleto, String email, double saldo, ArrayList<Obra> compras) {
        this.idComprador = idComprador;
        this.usuario = usuario;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.saldo = saldo;
        this.compras = compras;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Obra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Obra> compras) {
        this.compras = compras;
    }
}
