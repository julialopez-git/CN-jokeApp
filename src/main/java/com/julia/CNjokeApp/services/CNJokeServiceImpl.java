package com.julia.CNjokeApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class CNJokeServiceImpl implements CNJokeService{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public CNJokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getAJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
