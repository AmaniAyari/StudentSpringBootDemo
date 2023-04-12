package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student adele = new Student("Adele", LocalDate.of(2000, Month.JANUARY,1), "adele@email");
            Student einstein = new Student("Einstein", LocalDate.of(1900, Month.MARCH, 1), "einstein@email");
            Student amani = new Student("Amani", LocalDate.of(1000, Month.JULY,1),"amani@email");

            repository.saveAll(List.of(adele, einstein, amani));
        };
    }
}
