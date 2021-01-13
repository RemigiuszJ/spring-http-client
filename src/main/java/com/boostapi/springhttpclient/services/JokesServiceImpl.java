package com.boostapi.springhttpclient.services;

import com.boostapi.springhttpclient.api.domain2.Jokes;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokesServiceImpl implements JokesService{
    private RestTemplate restTemplate;

    public JokesServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Jokes[] getJokes() {

        Jokes[] jokes = restTemplate.getForObject("https://official-joke-api.appspot.com/jokes/ten", Jokes[].class);
        return jokes;
    }
}

