package com.idat.libros.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tb_libros")
@Data
@Getter
@Setter
public class Libros {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_libros")
    private Integer id;

    @Column (name = "titulo", length = 20, nullable = false)
    private String titulo;

    @Column (name = "autor", length = 20, nullable = false)
    private String autor;

    @Column (name = "editorial", length = 20, nullable = false)
    private String editorial;

    @Column (name = "genero", length = 20, nullable = false)
    private String genero;

}
