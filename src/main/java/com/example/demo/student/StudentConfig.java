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
    CommandLineRunner commandLineRunner (StudentRepository repository) {
        return args -> {

            Student kayzer = new Student(
                    "Kayzer",
                    "Superti@outlook.com",
                    LocalDate.of(1995, Month.JANUARY, 1)
            );

            Student robert = new Student(
                    "Robert",
                    "rob@gmail.com",
                    LocalDate.of(1990, Month.JANUARY, 1)
            );

            Student eyad = new Student(
                    "Eyad",
                    "Eyad@hotmail.com",
                    LocalDate.of(1985, Month.JANUARY, 1)
            );

            repository.saveAll(
                    List.of(kayzer,robert,eyad)
            );
        };
    }
}
