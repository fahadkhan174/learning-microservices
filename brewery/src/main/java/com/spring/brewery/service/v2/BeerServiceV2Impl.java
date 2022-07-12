package com.spring.brewery.service.v2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.spring.brewery.model.v2.BeerDtoV2;
import com.spring.brewery.model.v2.BeerStyleEnum;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2{

    @Override
    public BeerDtoV2 findBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("beerName")
                .beerStyle(BeerStyleEnum.STOUT)
                .build();
    }

    @Override
    public BeerDtoV2 saveBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        // todo add real impl to update beer
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting a beer: " + beerId);

    }
    
}
