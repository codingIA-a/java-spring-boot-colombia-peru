package com.crud.cruddemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.cruddemo.models.Film;
import com.crud.cruddemo.services.FilmServices;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/films")
public class FilmController {
    @Autowired
    FilmServices filmServices;

    @GetMapping("")
    public String filmForm(Model model){
        model.addAttribute("film", new Film());
        return "createFilms.jsp";
    }
    @GetMapping("/all")
    public String allFilms(Model model){
        List<Film> films = filmServices.findAll();
        model.addAttribute("films", films);
        return "showFilms.jsp";
    }
    @GetMapping("/{filmId}")
    public String updatePage(@PathVariable("filmId") Long filmId , Model model){
        Film filmById = filmServices.findById(filmId);
        model.addAttribute("film", filmById);
        return "filmsDetails.jsp";
    }

    //insertar datos
    @PostMapping("/create")
    public String createFilm(@Valid @ModelAttribute("film") Film film,
                            BindingResult result,
                            Model model ){
        if (result.hasErrors()) {
            return "createFilms.jsp";
        }
        filmServices.createFilm(film);
        return "redirect:/films/all";
    }
    //método para actualizar
    @PutMapping("/{filmId}/update")
    public String update(@PathVariable("filmId") Long filmId, @ModelAttribute("film") Film film){
        filmServices.update(filmId, film);
        return "redirect:/films/all";
    }
    
}
