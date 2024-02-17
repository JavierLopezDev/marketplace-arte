package com.dam.controladores;

import com.dam.DAOs.*;
import com.dam.entidades.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    ObraDAO obraDAO;
    @Autowired
    Obra obra;

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

    @GetMapping("/insertarObra")
    public String procesarObra(@RequestParam("user") String user, @ModelAttribute("obra") Obra obra, Model model) {
        Artista artistap = artistaDAO.obtenerArtista(user);
        model.addAttribute("obra", obra);
        return "insertarObra";
    }

    @PostMapping("/insertarObra")
    public String insertarObra(@ModelAttribute("obra") Obra obra, Model model) {
        obraDAO.editarObra(obra);
        obraDAO.addArtista(obra.getNombre(), "artista1");
        Artista artistap = artistaDAO.obtenerArtista("artista1");
        model.addAttribute("artista", artistap);
        return "artista";
    }

}
