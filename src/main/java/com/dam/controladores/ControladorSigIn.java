package com.dam.controladores;

import com.dam.DAOs.AdministradorDAO;
import com.dam.DAOs.ArtistaDAO;
import com.dam.DAOs.CompradorDAO;
import com.dam.entidades.Administrador;
import com.dam.entidades.Artista;
import com.dam.entidades.Comprador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorSigIn {

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

    @GetMapping("/registerAdmin")
    public String irRegisterAdmin(Model model) {
        model.addAttribute("recibirRegisroAdmin", admin);
        return "registerAdmin";
    }

    @PostMapping("/registerAdmin")
    public String procesarRegisterAdmin(@ModelAttribute("admin") Administrador admin) {
        adminDAO.insertarAdministrador(admin);
        return "elegirUsuario";
    }

    @GetMapping("/registerArtista")
    public String irRegisterArtista(Model model) {
        model.addAttribute("recibirRegisroArtista", artista);
        return "registerArtista";
    }

    @PostMapping("/registerArtista")
    public String procesarRegisterArtista(@ModelAttribute("artista") Artista artista) {
        artistaDAO.insertarArtista(artista);
        return "elegirUsuario";
    }

    @GetMapping("/registerComprador")
    public String irRegisterComprador(Model model) {
        model.addAttribute("recibirRegisroComprador", comprador);
        return "registerComprador";
    }

    @PostMapping("/registerComprador")
    public String procesarRegisterComprador(@ModelAttribute("comprador") Comprador comprador) {
        compradorDAO.insertarComprador(comprador);
        return "elegirUsuario";
    }
}
