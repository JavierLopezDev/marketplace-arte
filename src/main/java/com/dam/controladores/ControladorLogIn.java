package com.dam.controladores;

import com.dam.entidades.Administrador;
import com.dam.entidades.Artista;
import com.dam.entidades.Comprador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorLogIn {
    Administrador admin = new Administrador();
    Artista artista = new Artista();
    Comprador comprador = new Comprador();

    @GetMapping("/loginAdmin")
    public String irLoginAdmin(Model model) {
        model.addAttribute("recibirLogin", admin);
        return "login";
    }

    @GetMapping("/loginArtista")
    public String irLoginArtista(Model model) {
        model.addAttribute("recibirLogin", artista);
        return "login";
    }

    @GetMapping("/loginComprador")
    public String irLoginComprador(Model model) {
        model.addAttribute("recibirLogin", comprador);
        return "login";
    }
}
