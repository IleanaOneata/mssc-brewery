package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

/**
 * @author ioneata
 */

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
