package com.boostapi.springhttpclient.services;

import com.boostapi.springhttpclient.api.domain.Fact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiServiceImplTest {

   @Autowired
   ApiService apiService;


   @Test
   public void testGetFacts() throws Exception{
       Fact[] facts = apiService.getFacts(5);

       Assertions.assertEquals(5, facts.length);


    }




}
