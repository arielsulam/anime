package com.devpredator.animes.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

//Clase que representa entidades de anime

@Data
@Entity
@Table(name="anime")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="anio")
    private int anio;
    @Column(name="fecha_creacion")
    private LocalDateTime fechaCreacion;
}
