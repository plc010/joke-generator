package com.clark.jokegenerator.controllers;

import com.clark.jokegenerator.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    private final JokeService jokeService;

    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getRandomQuote());
        return "chucknorris";
    }
}
