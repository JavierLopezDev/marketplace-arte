package com.dam.entidades;


import jakarta.persistence.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Entity
@Table(name = "ARTISTA")
@Scope("prototype")
public class Artista {

    /*@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idArtista")
    @SequenceGenerator(name = "idArtista", sequenceName = "SEQ_ARTISTA", allocationSize = 1)*/
    @Id
    private int idArtista;
    private String usuario;
    private String password;
    private String nombreCompleto;
    private String email;
    private String fechaNacimiento;
    private String nacionalidad;
    private String biografia;
    private String telefono;

    @OneToMany(mappedBy = "artista", cascade = CascadeType.ALL)
    private ArrayList<Obra> obras = new ArrayList<Obra>();

    public Artista() {}

    public Artista(String usuario, String password, String nombreCompleto, String email, String fechaNacimiento, String nacionalidad, String biografia, String telefono) {
        this.usuario = usuario;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
        this.telefono = telefono;
    }

    public Artista(int idArtista, String usuario, String password, String nombreCompleto, String email, String fechaNacimiento, String nacionalidad, String biografia, String telefono) {
        this.idArtista = idArtista;
        this.usuario = usuario;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
        this.telefono = telefono;
    }

    public Artista(int idArtista, String usuario, String password, String nombreCompleto, String email, String fechaNacimiento, String nacionalidad, String biografia, String telefono, ArrayList<Obra> obras) {
        this.idArtista = idArtista;
        this.usuario = usuario;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.biografia = biografia;
        this.telefono = telefono;
        this.obras = obras;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

    @Override
    public String toString() {
        return "Artista --> " +
                "idArtista: " + idArtista +
                " | usuario: " + usuario +
                " | nombreCompleto: " + nombreCompleto +
                " | email: " + email +
                " | fechaNacimiento: " + fechaNacimiento +
                " | nacionalidad: " + nacionalidad +
                " | biografia: " + biografia +
                " | telefono: " + telefono +
                " | {obras: " + obras.toString() + "}";
    }
}
