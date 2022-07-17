package com.spring.beerservice.bootstrap;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.beerservice.domain.Beer;
import com.spring.beerservice.repository.BeerRepository;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .upc(337010000001L)
                    .price(new BigDecimal("12.95"))
                    .minOnHand(12)
                    .quantityToBrew(200)
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cats")
                    .beerStyle("PALE_ALE")
                    .upc(337010000002L)
                    .price(new BigDecimal("11.95"))
                    .minOnHand(12)
                    .quantityToBrew(200)
                    .build());
        }
    }

}
