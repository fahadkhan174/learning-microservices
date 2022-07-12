package com.spring.beerservice.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.beerservice.model.BeerDto;
import com.spring.beerservice.service.BeerService;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    // private BeerService beerService;

    // public BeerController(BeerService beerService) {
    //     this.beerService = beerService;
    // }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {
        // todo impl
        return new ResponseEntity<BeerDto>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createBeer(@RequestBody BeerDto beerDto) {

        // todo impl
        return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
    }

    @PatchMapping("/{beerId}")
    public ResponseEntity<HttpStatus> updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {

        // todo impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
