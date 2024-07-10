package com.crud.cruddemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.cruddemo.models.Film;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {
    
}
