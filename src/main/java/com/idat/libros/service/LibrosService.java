package com.idat.libros.service;

import com.idat.libros.model.Libros;

import java.util.List;

public interface LibrosService {

    List<Libros> listarLibros();
    void guardarLibros(Libros libros);
    Libros obtenerLibrosPorId(Integer id);
    void eliminarLibrosPorId(Integer id);
}
