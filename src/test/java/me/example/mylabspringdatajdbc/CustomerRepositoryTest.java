package me.example.mylabspringdatajdbc;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureJdbc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = CustomerConfig.class)
//@AutoConfigureJdbc
@Transactional
class CustomerRepositoryTest {

    @Autowired CustomerRepository customerRepository;

    @Test
    @Disabled
    public void createSimpleCustomer() {
//        Customer customer = new Customer();
//        customer.dob = LocalDate.of(1904, 5, 14);
//        customer.firstName = "Albert";
//
//        Customer saved = customerRepository.save(customer);
//
//        assertThat(saved.id).isNotNull();
//
//        saved.firstName = "Hans Albert";
//
//        customerRepository.save(saved);
//
//        Optional<Customer> reloaded = customerRepository.findById(saved.id);
//
//        assertThat(reloaded).isNotEmpty();
//
//        assertThat(reloaded.get().firstName).isEqualTo("Hans Albert");
    }

    @Test
    @Disabled
    public void findByName() {
//        Customer customer = new Customer();
//        customer.dob = LocalDate.of(1904, 5, 14);
//        customer.firstName = "Albert";
//
//        Customer saved = customerRepository.save(customer);
//
//        assertThat(saved.id).isNotNull();
//
//        customer.id = null;
//        customer.firstName = "Bertram";
//
//        customerRepository.save(customer);
//
//        customer.id = null;
//        customer.firstName = "Beth";
//
//        customerRepository.save(customer);
//
//        assertThat(customerRepository.findByName("bert")).hasSize(2);
    }

}