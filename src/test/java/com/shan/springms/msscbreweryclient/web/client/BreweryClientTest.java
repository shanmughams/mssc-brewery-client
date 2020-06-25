package com.shan.springms.msscbreweryclient.web.client;

import com.shan.springms.msscbreweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {
        BeerDto beerDto = client.getBeerById(UUID.randomUUID());
        assertNotNull(beerDto);
    }

    @Test
    void saveNewBeer() {
        BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();
        URI url = client.saveNewBeer(beerDto);
        assertNotNull(url);
        System.out.println(url);
    }

    @Test
    void updateBeer() {
        BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();

        client.updateBeer(UUID.randomUUID(), beerDto);
    }

    @Test
    void deleteBeer() {
    }

    @Test
    void setApihost() {
        client.deleteBeer(UUID.randomUUID());
    }
}