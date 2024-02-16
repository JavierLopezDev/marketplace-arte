package com.dam.controladores;

import com.dam.DAOs.AdministradorDAO;
import com.dam.DAOs.ArtistaDAO;
import com.dam.DAOs.CompraDAO;
import com.dam.DAOs.CompradorDAO;
import com.dam.entidades.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ControladorArtista {

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

    @GetMapping("/ajustesArtista")
    public String ajustesArtista(@RequestParam("idArtista") int idArtista, Model model) {
        artista = artistaDAO.obtenerArtista(idArtista);
        model.addAttribute("artista", artista);
        return "ajustesArtista";
    }

    @PostMapping("/ajustesArtista")
    public String procesarAjustesArtista(@ModelAttribute("artista") Artista artista, Model model) {
        artistaDAO.editarArtista(artista);
        Artista artistap = artistaDAO.obtenerArtista(artista.getIdArtista());
        model.addAttribute("artista", artistap);
        return "artista";
    }

    @GetMapping("/addObra")
    public String addObra(@RequestParam("idArtista") int idArtista, Model model) {
        Obra obra = new Obra();
        model.addAttribute("obra", obra);
        return "insertarObra";
    }

    @PostMapping("/ajustesArtista")
    public String procesarObra(@ModelAttribute("artista") Artista artista, Model model) {
        artistaDAO.editarArtista(artista);
        Artista artistap = artistaDAO.obtenerArtista(artista.getIdArtista());
        model.addAttribute("artista", artistap);
        return "artista";
    }

}
