package com.devpredator.animes.repository;

import com.devpredator.animes.entity.Anime;
import org.springframework.data.repository.CrudRepository;
//Interface que contiene el CRUD con Spring JPA para la tabla de anime.
public interface AnimesRepository extends CrudRepository<Anime, Long> {
}
