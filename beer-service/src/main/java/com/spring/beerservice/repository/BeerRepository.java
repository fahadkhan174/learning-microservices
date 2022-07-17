package com.spring.beerservice.repository;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.spring.beerservice.domain.Beer;

@Repository
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
