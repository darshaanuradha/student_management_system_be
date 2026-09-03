package com.uovt.student_management_system_be.config;

import com.uovt.student_management_system_be.entities.Student;
import com.uovt.student_management_system_be.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner seedDatabase(StudentRepository studentRepository) {

        return args -> {

            if (studentRepository.count() == 0) {

                studentRepository.save(
                        new Student(
                                "Kamal",
                                "Perera",
                                "kamal@gmail.com",
                                "0771234567",
                                "123 Main Street",
                                "1990-01-01"));

                studentRepository.save(
                        new Student(
                                "Nimal",
                                "Fernando",
                                "nimal@gmail.com",
                                "0771234568",
                                "456 Oak Avenue",
                                "1992-05-15"));

                studentRepository.save(
                        new Student(
                                "Amal",
                                "Silva",
                                "amal@gmail.com",
                                "0771234569",
                                "789 Pine Road",
                                "1991-08-20"));

                System.out.println("Student data seeded successfully!");
            }
        };
    }
}