package com.dam.DAOs;

import com.dam.entidades.Comprador;

public interface CompradorDAO {

    public boolean insertarComprador(Comprador comprador);
    public boolean editarComprador(Comprador comprador);
    public boolean borrarComprador(Comprador comprador);
    public Comprador obtenerComprador(int idComprador);
    public boolean editarSaldo(int idComprador, double saldo);

}
