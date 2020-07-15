package me.example.mylabspringdatajdbc.person;

import me.example.mylabspringdatajdbc.CustomerConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@ContextConfiguration(classes = CustomerConfig.class)
@Transactional
class PersonRepositoryTest {

    @Autowired PersonRepository personRepository;

    @Test
    void personTest() {
        Person person = Person.of("firstName", "lastName", LocalDate.of(1993,8,25));

        Person save = personRepository.save(person);

        assertThat(save).isNotNull();


    }

}