package com.joseflores.dojosyninjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.joseflores.dojosyninjas.models.Dojos;
import com.joseflores.dojosyninjas.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    @SuppressWarnings("null")
    List<Ninja> findAllByDojos(Dojos dojos);
}
