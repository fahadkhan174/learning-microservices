package com.spring.brewery.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.spring.brewery.web.model.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("customerName")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("customerName")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        // todo add real impl to update customer

    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Deleting a customer: " + customerId);

    }

}
