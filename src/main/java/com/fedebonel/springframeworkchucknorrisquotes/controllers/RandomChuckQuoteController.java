package com.fedebonel.springframeworkchucknorrisquotes.controllers;

import com.fedebonel.springframeworkchucknorrisquotes.services.RandomChuckQuoteService;
import com.fedebonel.springframeworkchucknorrisquotes.services.RandomChuckQuoteServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller of the web app, it contains all possible requests with the app
 */
@Controller
public class RandomChuckQuoteController {
    // Get the service to generate the quotes
    private final RandomChuckQuoteService service;

    // Inject that service in runtime
    public RandomChuckQuoteController(RandomChuckQuoteServiceImpl service) {
        this.service = service;
    }

    // Set the mapping to get the request and show what's needed in template
    @RequestMapping({"/",""}) // Maps to localhost:8080/ AKA Gets called when user does request to that endpoint
    public String getChuckQuote(Model model){
        model.addAttribute("joke", service.getRandomQuote());
        // Return the view index.html in templates inflated with the joke on it
        return "index";
    }
}
