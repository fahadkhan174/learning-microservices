package com.spring.brewery.service.v2;

import java.util.UUID;

import com.spring.brewery.model.v2.BeerDtoV2;

public interface BeerServiceV2 {

    BeerDtoV2 findBeerById(UUID beerId);

    BeerDtoV2 saveBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteBeer(UUID beerId);

}
