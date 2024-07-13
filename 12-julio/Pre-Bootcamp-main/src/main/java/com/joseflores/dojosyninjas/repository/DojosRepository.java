package com.joseflores.dojosyninjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.joseflores.dojosyninjas.models.Dojos;

@Repository
public interface DojosRepository extends CrudRepository<Dojos, Long> {
    @SuppressWarnings("null")
    List<Dojos> findAll();
    
}
