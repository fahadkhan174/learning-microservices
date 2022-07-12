package com.spring.brewery.service;

import java.util.UUID;

import com.spring.brewery.model.BeerDto;

public interface BeerService {

    BeerDto findBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteBeer(UUID beerId);

}
