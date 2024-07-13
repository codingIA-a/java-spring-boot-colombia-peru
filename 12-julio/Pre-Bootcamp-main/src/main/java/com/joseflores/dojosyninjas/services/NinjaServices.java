package com.joseflores.dojosyninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joseflores.dojosyninjas.models.Dojos;
import com.joseflores.dojosyninjas.models.Ninja;
import com.joseflores.dojosyninjas.repository.NinjaRepository;

@Service
public class NinjaServices {
    @Autowired
    private NinjaRepository ninjaRepository;

    public List<Ninja> findall(){
        return (List<Ninja>) ninjaRepository.findAll();
    }
    public void CreateNinjas(Ninja ninja){
        ninjaRepository.save(ninja);
    }
    public Ninja findById(Long ninjasid){
    Optional<Ninja> ninjas = ninjaRepository.findById(ninjasid);
        return ninjas.isPresent() ? ninjas.get() : null;
    }
    public void delete(Long ninjasid){
        Ninja dojos = findById(ninjasid);
        if (dojos != null) {
            ninjaRepository.delete(dojos);
        }
    }
    public List<Ninja> findNinjasByDojos(Dojos dojos) {
        return ninjaRepository.findAllByDojos(dojos);
    }
}
