package com.boostapi.springhttpclient.services;

import com.boostapi.springhttpclient.api.domain3.Bored;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BoredServiceImpl implements  BoredService{

    private RestTemplate restTemplate;

    public BoredServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Bored getBored(Integer participants)    {
        Bored bored = restTemplate.getForObject("http://www.boredapi.com/api/activity?participants=" + participants, Bored.class);
        return bored;
    }
}
