package com.dam.DAOs;

import com.dam.entidades.Administrador;

public interface AdministradorDAO {

    public boolean insertarAdministrador(Administrador administrador);
    public boolean editarAdministrador(Administrador administrador);
    public boolean borrarAdministrador(Administrador administrador);
    public Administrador obtenerAdministrador(int idAdministrador);
    public Administrador obtenerAdministrador(String usuario);
}
