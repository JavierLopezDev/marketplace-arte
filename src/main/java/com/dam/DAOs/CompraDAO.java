package com.dam.DAOs;

import com.dam.entidades.Compra;

import java.util.List;

public interface CompraDAO {

    public boolean insertarCompra(Compra compra);
    public boolean editarCompra(Compra compra);
    public boolean borrarCompra(Compra compra);
    public Compra obtenerCompra(int idCompra);
    public List<Compra> obtenerCompras(int idComprador);
    public List<Compra> obtenerCompras();
}
