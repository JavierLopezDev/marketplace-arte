package com.dam.controladores;

import com.dam.DAOs.AdministradorDAO;
import com.dam.DAOs.ArtistaDAO;
import com.dam.DAOs.CompradorDAO;
import com.dam.entidades.Administrador;
import com.dam.entidades.Artista;
import com.dam.entidades.Comprador;
import com.dam.implementacionesDAO.AdministradorDAOImpl;
import com.dam.implementacionesDAO.ArtistaDAOImpl;
import com.dam.implementacionesDAO.CompradorDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorLogIn {
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

    @GetMapping("/loginAdmin")
    public String irLoginAdmin(Model model) {
        model.addAttribute("recibirLogin", admin);
        return "login";
    }

    @GetMapping("/loginArtista")
    public String irLoginArtista(Model model) {
        model.addAttribute("recibirLogin", artista);
        return "loginArtista";
    }

    @GetMapping("/loginComprador")
    public String irLoginComprador(Model model) {
        model.addAttribute("recibirLogin", comprador);
        return "loginComprador";
    }

    @PostMapping("/loginAdmin")
    public String procesarLoginAdmin(@ModelAttribute("recibirLogin") Administrador admin, Model model) {
        Administrador adminUser = adminDAO.obtenerAdministrador(admin.getUsuario());
        if (adminUser != null && adminUser.getPassword().equals(admin.getPassword())) {
            model.addAttribute("admin", adminUser);
            return "admin";
        } else {
            return "redirect:/loginAdmin";
        }
    }

    @PostMapping("/loginArtista")
    public String procesarLoginArtista(@ModelAttribute("recibirLogin") Artista artista, Model model) {
        Artista artistaUser = artistaDAO.obtenerArtista(artista.getUsuario());
        if (artistaUser != null && artistaUser.getPassword().equals(artista.getPassword())) {
            model.addAttribute("artista", artistaUser);
            return "artista";
        } else {
            return "redirect:/loginArtista";
        }
    }

    @PostMapping("/loginComprador")
    public String procesarLoginComprador(@ModelAttribute("recibirLogin") Comprador comprador, Model model) {
        Comprador compradorUser = compradorDAO.obtenerComprador(comprador.getUsuario());
        if (compradorUser != null && compradorUser.getPassword().equals(comprador.getPassword())) {
            model.addAttribute("comprador", compradorUser);
            return "comprador";
        } else {
            return "redirect:/loginComprador";
        }
    }
}
