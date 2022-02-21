package com.fedebonel.springframeworkchucknorrisquotes.Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Service that provides a Random Chuck Norris Quote
 */
@Service
public class RandomChuckQuoteService {
    /**
     * Generates a random Chuck Norris quote provided by the Spring Guru AKA John Thompson's Maven dependency
     * @return String containing the random quote
     */
    public String getRandomQuote() {
        ChuckNorrisQuotes generator = new ChuckNorrisQuotes();
        return generator.getRandomQuote();
    }
}
