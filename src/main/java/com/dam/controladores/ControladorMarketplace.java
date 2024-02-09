package com.dam.controladores;

import com.dam.entidades.Administrador;
import com.dam.entidades.Artista;
import com.dam.entidades.Comprador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorMarketplace {

    Administrador admin = new Administrador();
    Artista artista = new Artista();
    Comprador comprador = new Comprador();

    @RequestMapping("/")
    public String inicio() {
        return "index";
    }

    @GetMapping("/elegirUser")
    public String elegirUser() {
        return "elegirUsuario";
    }

    @GetMapping("/rEscogerUsuario")
    public String rEscogerUsuario() {
        return "rElegirUsuario";
    }

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
        model.addAttribute("recibirLogin", admin);
        return "login";
    }

    @GetMapping("/registerAdmin")
    public String irRegisterAdmin(Model model) {
        model.addAttribute("recibirRegisroAdmin", admin);
        return "registerAdmin";
    }

    @GetMapping("/registerArtista")
    public String irRegisterArtista(Model model) {
        model.addAttribute("recibirLogin", artista);
        return "login";
    }

    @GetMapping("/registerComprador")
    public String irRegisterComprador(Model model) {
        model.addAttribute("recibirLogin", admin);
        return "login";
    }
}
