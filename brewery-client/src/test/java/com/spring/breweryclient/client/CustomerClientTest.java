package com.spring.breweryclient.client;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.URI;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.breweryclient.model.CustomerDto;

@SpringBootTest
public class CustomerClientTest {

    @Autowired
    private CustomerClient customerClient;

    @Test
    void testGetCustomerById() {
        CustomerDto customerDto = customerClient.getCustomerById(UUID.randomUUID());
        assertNotNull(customerDto);
    }

    @Test
    void testSaveNewCustomer() {
        CustomerDto savedDto = CustomerDto.builder().customerName("Test customerName").build();
        URI uri = customerClient.saveNewCustomer(savedDto);
        assertNotNull(uri);
        System.out.println(uri.toString());

    }

    @Test
    void testUpdateCustomer() {
        CustomerDto customerDto = CustomerDto.builder().customerName("Test updated customerName").build();
        customerClient.updateCustomer(UUID.randomUUID(), customerDto);
    }

    @Test
    void testDeleteCustomer() {
        customerClient.deleteCustomer(UUID.randomUUID());
    }
}
