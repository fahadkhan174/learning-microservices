package com.spring.brewery.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.spring.brewery.model.BeerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto findBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("beerName")
                .beerStyle("beerStyle")
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // todo add real impl to update beer
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Deleting a beer: " + beerId);

    }

}
