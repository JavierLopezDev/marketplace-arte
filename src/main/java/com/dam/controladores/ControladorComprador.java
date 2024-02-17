package com.dam.controladores;

import com.dam.DAOs.*;
import com.dam.entidades.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class ControladorComprador {
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

    @GetMapping("/ajustesComprador")
    public String ajustesComprador(@RequestParam("idComprador") int idComprador, Model model) {
        comprador = compradorDAO.obtenerComprador(idComprador);
        model.addAttribute("comprador", comprador);
        return "ajustesComprador";
    }

    @PostMapping("/ajustesComprador")
    public String ajustesComprador(@ModelAttribute("comprador") Comprador comprador, Model model) {
        compradorDAO.editarComprador(comprador);
        Comprador compradorp = compradorDAO.obtenerComprador(comprador.getIdComprador());
        model.addAttribute("comprador", compradorp);
        return "comprador";
    }

    @GetMapping("/obrasEnVenta")
    public String obrasEnVenta(@RequestParam("idComprador") int idComprador, Model model) {
        model.addAttribute("comprador", compradorDAO.obtenerComprador(idComprador));
        model.addAttribute("obras", obraDAO.obtenerObrasEnVenta());
        return "obrasEnVenta";
    }

    @GetMapping("/comprarObra")
    public String comprarObra(@RequestParam("idObra") int idObra, @RequestParam("idComprador") int idComprador, Model model) {
        Obra obra = obraDAO.obtenerObra(idObra);
        Comprador comprador = compradorDAO.obtenerComprador(idComprador);
        LocalDate fechaHoy = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaHoy.format(formatter);
        if (comprador.getSaldo() >= obra.getPrecio()) {
            Compra compra = new Compra();
            compra.setFecha(fechaFormateada);
            compra.setObraId(obra);
            compra.setCompradorId(comprador);
            compra.setImporte(obra.getPrecio());
            compraDAO.insertarCompra(compra);
            comprador.setSaldo(comprador.getSaldo() - obra.getPrecio());
            compradorDAO.editarComprador(comprador);
            obraDAO.addComprador(obra.getNombre(), comprador.getUsuario());
            Comprador compradorp = compradorDAO.obtenerComprador(comprador.getIdComprador());
            model.addAttribute("comprador", compradorp);
            return "comprador";
        } else {
            model.addAttribute("comprador", comprador);
            return "comprador";
        }
    }
}
