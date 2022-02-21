package com.fedebonel.springframeworkchucknorrisquotes.Controllers;

import com.fedebonel.springframeworkchucknorrisquotes.Services.RandomChuckQuoteService;
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
    public RandomChuckQuoteController(RandomChuckQuoteService service) {
        this.service = service;
    }

    // Set the mapping to get the request and show what's needed in template
    @RequestMapping("/")
    public String getChuckQuote(Model model){
        model.addAttribute("joke", service.getRandomQuote());
        return "index";
    }
}
