package com.spring.breweryclient.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.URI;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import com.spring.breweryclient.model.BeerDto;

@SpringBootTest
public class BreweryClientTest {

    @Autowired
    private BreweryClient breweryClient;

    @Test
    void testGetBeerById() {
        BeerDto beerDto = breweryClient.getBeerById(UUID.randomUUID());
        assertNotNull(beerDto);
    }

    @Test
    void testSaveNewBeer() {
        BeerDto beerDto = BeerDto.builder()
                .beerName("Test beerName")
                .build();

        URI uri = breweryClient.saveNewBeer(beerDto);
        assertNotNull(uri);
        System.out.println(uri.toString());
    }

    @Test
    void testUpdateBeer() {
        BeerDto beerDto = BeerDto.builder()
                .beerName("Test update beerName")
                .build();
        breweryClient.updateBeer(UUID.randomUUID(), beerDto);
    }

    @Test
    void testDeleteBeer() {
        breweryClient.deleteBeer(UUID.randomUUID());
    }
}
