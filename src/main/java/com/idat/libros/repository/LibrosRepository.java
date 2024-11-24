package com.idat.libros.repository;

import com.idat.libros.model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrosRepository extends JpaRepository<Libros, Integer> {
}
