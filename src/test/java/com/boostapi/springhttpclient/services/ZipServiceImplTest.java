package com.boostapi.springhttpclient.services;

import com.boostapi.springhttpclient.api.domain4.ZIP;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ZipServiceImplTest {

    @Autowired
    ZipService zipService;

    @Test
    public void testGetZip() throws Exception {
        ZIP zip = zipService.getZIP();
    }
}
