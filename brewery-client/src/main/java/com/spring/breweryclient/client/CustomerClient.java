package com.spring.breweryclient.client;

import java.net.URI;
import java.util.UUID;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.spring.breweryclient.model.CustomerDto;

@Component
@ConfigurationProperties(prefix = "brewery.client")
public class CustomerClient {

    private String apiHost;
    public final String CUSTOMER_PATH_V1 = "/api/v1/customer/";

    private final RestTemplate restTemplate;

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }

    public CustomerClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public CustomerDto getCustomerById(UUID customerId) {
        return restTemplate.getForObject(apiHost + CUSTOMER_PATH_V1 + customerId.toString(), CustomerDto.class);
    }

    public URI saveNewCustomer(CustomerDto customerDto) {
        return restTemplate.postForLocation(apiHost + CUSTOMER_PATH_V1, customerDto);
    }

    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        restTemplate.put(apiHost + CUSTOMER_PATH_V1 + customerId.toString(), customerDto);
    }

    public void deleteCustomer(UUID customerId) {
        restTemplate.delete(apiHost + CUSTOMER_PATH_V1 + customerId.toString());
    }
}
