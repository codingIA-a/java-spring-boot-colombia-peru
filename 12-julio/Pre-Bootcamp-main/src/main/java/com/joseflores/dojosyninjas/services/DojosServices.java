package com.joseflores.dojosyninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joseflores.dojosyninjas.models.Dojos;
import com.joseflores.dojosyninjas.repository.DojosRepository;

@Service
public class DojosServices {
    @Autowired
    private DojosRepository dojosRepository;

    public List<Dojos> findall(){
        return (List<Dojos>) dojosRepository.findAll();
    }
    public Dojos createDojo(Dojos dojos){
        return dojosRepository.save(dojos);
    }
    public Dojos findById(Long dojosid){
    Optional<Dojos> dojos = dojosRepository.findById(dojosid);
        return dojos.isPresent() ? dojos.get() : null;
    }
    public void delete(Long DojosId){
        Dojos dojos = findById(DojosId);
        if (dojos != null) {
            dojosRepository.delete(dojos);
        }
    }
//    public Dojos findDojos(Long id){
  //      return dojosRepository.findById(id).orElse(null);
   // }
    public Object save() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
}
