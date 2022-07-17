package com.spring.brewery.service;

import java.util.UUID;

import com.spring.brewery.web.model.CustomerDto;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto createCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);

}
