package com.fedebonel.springframeworkchucknorrisquotes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Service that provides a Random Chuck Norris Quote
 */
@Service
public class RandomChuckQuoteServiceImpl implements RandomChuckQuoteService {
    /**
     * Generates a random Chuck Norris quote provided by the Spring Guru AKA John Thompson's Maven dependency
     * @return String containing the random quote
     */
    @Override
    public String getRandomQuote() {
        ChuckNorrisQuotes generator = new ChuckNorrisQuotes();
        return generator.getRandomQuote();
    }
}
