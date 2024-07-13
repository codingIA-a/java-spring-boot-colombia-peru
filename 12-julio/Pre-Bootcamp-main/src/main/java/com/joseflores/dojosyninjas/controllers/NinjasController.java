package com.joseflores.dojosyninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joseflores.dojosyninjas.models.Ninja;
import com.joseflores.dojosyninjas.services.DojosServices;
import com.joseflores.dojosyninjas.services.NinjaServices;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/ninjas")
public class NinjasController {
    @Autowired
    private NinjaServices ninjasServices;

    @Autowired
    private DojosServices dojosServices;

    @GetMapping("/new")
    public String newNinja(Model model) {
        model.addAttribute("ninjas", new Ninja());
        model.addAttribute("dojos", dojosServices.findall());
        return "Ninjaform.jsp";
    }

    @PostMapping("/new")
    public String createNinja(@Valid @ModelAttribute("ninjas") Ninja ninjas, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("dojos", dojosServices.findall());
            return "Ninjaform.jsp";
        }
        ninjasServices.CreateNinjas(ninjas);
        return "redirect:/dojos/" + ninjas.getDojos().getId();
    }
    //@GetMapping("/dojos/{id}")
    //public String showNinjasByDojo(@PathVariable("id") Long id, Model model, Ninja ninja) {
    //    Dojos dojo = dojosServices.findById(id);
    //    if (dojo != null) {
    //        //Ninja ninjas = ninjasServices.findById(id);
    //        
    //        //List<Ninja> lista_ninja = ninjasServices.findall();
    //       
    //        //model.addAttribute("dojo", dojo);
    //        return "showDojos.jsp";        
    //    } else {
    //        return "redirect:/dojos/new";
    //    }
    //}
}
