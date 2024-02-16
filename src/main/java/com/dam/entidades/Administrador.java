package com.dam.entidades;

import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "ADMINISTRADOR")
@Scope("prototype")
public class Administrador {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idAdministrador")
    @SequenceGenerator(name = "idAdministrador", sequenceName = "SEQ_ADMINISTRADOR", allocationSize = 1)
    @Id
    private int idAdministrador;

    @Column(unique = true)
    private String usuario;
    private String password;

    public Administrador() {}

    public Administrador(int idAdministrador, String usuario, String password) {
        this.idAdministrador = idAdministrador;
        this.usuario = usuario;
        this.password = password;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
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

    @Override
    public String toString() {
        return "Administrador --> " +
                " | idAdministrador: " + idAdministrador +
                " | usuario: " + usuario;
    }
}
