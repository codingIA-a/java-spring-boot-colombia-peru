package com.joseflores.dojosyninjas.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.joseflores.dojosyninjas.models.Dojos;
import com.joseflores.dojosyninjas.models.Ninja;
import com.joseflores.dojosyninjas.services.DojosServices;
import com.joseflores.dojosyninjas.services.NinjaServices;

import jakarta.validation.Valid;

@Controller
public class HomeController{
    @Autowired
    private DojosServices dojosServices;
    @Autowired 
    private NinjaServices ninjasServices;

    @GetMapping("/dojos/new")
    public String Dojosform(Model model){
        model.addAttribute("dojos", new Dojos());
        return "formdojo.jsp";
    }
    @PostMapping("/dojos/new")
    public String CreateDojos(@Valid @ModelAttribute("dojos") Dojos dojos,
            BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "formdojo.jsp";
    }
        dojosServices.createDojo(dojos);
        return "redirect:/dojos/" + dojos.getId();
    }
    @GetMapping("/dojos/{id}")
    public String home(@PathVariable("id") Long id, Model model, Ninja ninja) {
        Dojos dojos = dojosServices.findById(id);
        if (dojos != null) {
            List<Ninja> lista_ninja = ninjasServices.findNinjasByDojos(dojos);
            model.addAttribute("nin", lista_ninja);
            model.addAttribute("dojos", dojos);
            return "showDojos.jsp";
        } else {
        return "redirect:/dojos/new";
        }
    }

}
