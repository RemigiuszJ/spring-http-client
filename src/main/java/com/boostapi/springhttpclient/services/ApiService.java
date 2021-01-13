package com.boostapi.springhttpclient.services;



import com.boostapi.springhttpclient.api.domain.Fact;
public interface ApiService {
    Fact[] getFacts(Integer amount);

}
