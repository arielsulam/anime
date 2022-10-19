package com.devpredator.animes.service;

import com.devpredator.animes.entity.Anime;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public interface AnimesService {

    //Metodo que permite consultar un listado de animes.
    //Return listado de animes.

    List<Anime> consultarAnimes();

    //Metodo que permite guardar un anime
    //@param anime {@link Anime} objeto anime a guardar
    //@return anime guardado.

    Anime guardarAnime(Anime anime);

    //Metodo que permite actualizar un anime
    //@param anime {@link Anime} objeto anime a actualizar
    //@return anime actualizado.

    Anime actualizarAnime(Anime anime);

    //Metodo que permite eliminar un anime
    //@param id {@link Long} objeto anime a eliminar
    //@return anime eliminado.

    void eliminarAnime(Long id);


}
