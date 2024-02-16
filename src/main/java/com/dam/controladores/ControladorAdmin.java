package com.dam.controladores;

import com.dam.DAOs.AdministradorDAO;
import com.dam.DAOs.ArtistaDAO;
import com.dam.DAOs.CompraDAO;
import com.dam.DAOs.CompradorDAO;
import com.dam.entidades.Administrador;
import com.dam.entidades.Artista;
import com.dam.entidades.Compra;
import com.dam.entidades.Comprador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ControladorAdmin {

    @Autowired
    Administrador admin;
    @Autowired
    AdministradorDAO adminDAO;
    @Autowired
    Artista artista;
    @Autowired
    ArtistaDAO artistaDAO;
    @Autowired
    Comprador comprador;
    @Autowired
    CompradorDAO compradorDAO;
    @Autowired
    Compra compra;
    @Autowired
    CompraDAO compraDAO;

    @GetMapping("/verArtistas")
    public String verArtistas(Model model) {
        List<Artista> listaArtistas = artistaDAO.obtenerArtistas();
        model.addAttribute("artista", listaArtistas);
        return "verArtistas";
    }

    @GetMapping("/verCompras")
    public String verCompras(Model model) {
        List<Compra> listaCompras = compraDAO.obtenerCompras();
        model.addAttribute("compras", listaCompras);
        return "verCompras";
    }
    @GetMapping("/verCompradores")
    public String verCompradores(Model model) {
        List<Comprador> listaCompradores = compradorDAO.obtenerCompradores();
        model.addAttribute("compradores", listaCompradores);
        return "verCompradores";
    }
}
