package com.dam.DAOs;

import com.dam.entidades.Comprador;

import java.util.List;

public interface CompradorDAO {

    public boolean insertarComprador(Comprador comprador);
    public boolean editarComprador(Comprador comprador);
    public boolean borrarComprador(Comprador comprador);
    public Comprador obtenerComprador(int idComprador);
    public Comprador obtenerComprador(String usuario);
    public boolean editarSaldo(int idComprador, double saldo);
    public List<Comprador> obtenerCompradores();

}
