package com.idat.libros.controller;

import com.idat.libros.model.Libros;
import com.idat.libros.service.LibrosService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/libros")
@AllArgsConstructor
public class LibrosController {

    private final LibrosService librosService;

    @GetMapping("/listarLibros")
    public String verPaginaLibros(Model model) {
        model.addAttribute("listarLibros", librosService.listarLibros());
        return "libros/libros";
    }

    @GetMapping("/nuevoLibros")
    public String nuevoLibros(Model model) {
        model.addAttribute("libros", new Libros());
        return "libros/nuevoLibros";
    }

    @PostMapping("/guardarLibros")
    public String guardarLibros(@ModelAttribute("libros") Libros libros) {
        librosService.guardarLibros(libros);
        return "redirect:/libros/listarLibros";
    }

    @GetMapping("/actualizarLibros/{id}")
    public String actualizarlibros(@PathVariable("id") Integer id, Model model){
        model.addAttribute("libros", librosService.obtenerLibrosPorId(id));
        return "libros/actualizarLibros";
    }

    @GetMapping("/eliminarLibros/{id}")
    public String eliminarLibros(@PathVariable("id") Integer id) {
        librosService.eliminarLibrosPorId(id);
        return "redirect:/libros/listarLibros";
    }

}
