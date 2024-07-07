package com.crud.cruddemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.cruddemo.models.Film;
import com.crud.cruddemo.repository.FilmRepository;

@Service
public class FilmServices {
    @Autowired
    private FilmRepository filmRepository;

    //método para ver todas als películas
    public List<Film> findAll(){
        return (List<Film>) filmRepository.findAll();
    }
    //método crear pelicula
    public Film createFilm(Film film){
        return filmRepository.save(film);
    }
    //método para buscar un elemento por su id
    public Film findById(Long filmId){
        Optional<Film> film = filmRepository.findById(filmId);
        return film.isPresent() ? film.get() : null;
    }

    public void delete(Long filmId){
        Film film = findById(filmId);
        if (film != null) {
            filmRepository.delete(film);
        }
    }

}
