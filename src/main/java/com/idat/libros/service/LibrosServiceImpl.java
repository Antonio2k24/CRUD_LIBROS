package com.idat.libros.service;

import com.idat.libros.model.Libros;
import com.idat.libros.repository.LibrosRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LibrosServiceImpl implements LibrosService {

    private LibrosRepository librosRepository;


    @Override
    public List<Libros> listarLibros() {
        return librosRepository.findAll();
    }

    @Override
    public void guardarLibros(Libros libros) {
        librosRepository.save(libros);

    }

    @Override
    public Libros obtenerLibrosPorId(Integer id) {
        return librosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Libro no encontrado para el id: " + id));
    }

    @Override
    public void eliminarLibrosPorId(Integer id) {
        if (librosRepository.existsById(id)) {
            librosRepository.deleteById(id);
        } else {
            throw new RuntimeException("Libro no encontrado para el id: " + id);
        }

    }
}
