package com.boostapi.springhttpclient.services;

import com.boostapi.springhttpclient.api.domain4.ZIP;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class ZipServiceImpl implements  ZipService {
    private RestTemplate restTemplate;

    public ZipServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public ZIP getZIP() {
        ZIP zip = restTemplate.getForObject("https://api.zippopotam.us/PL/43-430" , ZIP.class);

        return zip;
    }
}
