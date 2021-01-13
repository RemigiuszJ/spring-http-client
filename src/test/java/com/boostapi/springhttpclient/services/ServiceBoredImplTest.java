package com.boostapi.springhttpclient.services;


import com.boostapi.springhttpclient.api.domain3.Bored;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest

public class ServiceBoredImplTest {

    @Autowired
    BoredService boredService;

    @Test
    public void testGetBored() throws Exception{
        Bored bored = boredService.getBored(1);
        Assertions.assertEquals(1, bored.getParticipants());
    }


}
