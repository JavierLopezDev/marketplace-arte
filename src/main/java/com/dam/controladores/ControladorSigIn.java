package com.dam.controladores;

import com.dam.entidades.Administrador;
import com.dam.entidades.Artista;
import com.dam.entidades.Comprador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorSigIn {

    Administrador admin = new Administrador();
    Artista artista = new Artista();
    Comprador comprador = new Comprador();

    @GetMapping("/registerAdmin")
    public String irRegisterAdmin(Model model) {
        model.addAttribute("recibirRegisroAdmin", admin);
        return "registerAdmin";
    }

    @GetMapping("/registerArtista")
    public String irRegisterArtista(Model model) {
        model.addAttribute("recibirRegisroArtista", artista);
        return "registerArtista";
    }

    @GetMapping("/registerComprador")
    public String irRegisterComprador(Model model) {
        model.addAttribute("recibirRegisroComprador", comprador);
        return "registerComprador";
    }
}
