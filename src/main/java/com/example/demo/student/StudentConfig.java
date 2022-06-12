package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student francisco = new Student(
                "Francisco",
                "francisco.guiraldelli@gmail.com",
                LocalDate.of(1980, Month.JUNE, 27)
            );
             Student francesca = new Student(
                "Francesca",
                "francesca.guiraldelli@gmail.com",
                LocalDate.of(2016, Month.FEBRUARY, 19)
            );
            repository.saveAll(
                List.of(francisco, francesca)
                );
        };
    }
}
