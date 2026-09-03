package com.uovt.student_management_system_be.config;

import com.uovt.student_management_system_be.entities.Student;
import com.uovt.student_management_system_be.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner seedDatabase(StudentRepository studentRepository) {
        return args -> {
            if (studentRepository.count() == 0) {

                // Using saveAll() with a List is cleaner and faster for bulk inserts
                List<Student> students = List.of(
                        new Student("Kamal", "Perera", "kamal@gmail.com", "0771234567", "123 Main Street",
                                "1990-01-01"),
                        new Student("Nimal", "Fernando", "nimal@gmail.com", "0771234568", "456 Oak Avenue",
                                "1992-05-15"),
                        new Student("Amal", "Silva", "amal@gmail.com", "0771234569", "789 Pine Road", "1991-08-20"),
                        new Student("Sunimal", "Jayasinghe", "sunimal@gmail.com", "0771234570", "12 Kandy Road",
                                "1993-02-11"),
                        new Student("Ruwan", "Ekanayake", "ruwan@gmail.com", "0771234571", "34 Galle Road",
                                "1994-11-30"),
                        new Student("Nuwan", "Bandara", "nuwan@gmail.com", "0771234572", "56 Temple Street",
                                "1995-07-22"),
                        new Student("Kasun", "Dissanayake", "kasun@gmail.com", "0771234573", "78 Hill Lane",
                                "1996-03-18"),
                        new Student("Dasun", "Rajakaruna", "dasun@gmail.com", "0771234574", "90 Lake View",
                                "1997-09-05"),
                        new Student("Sampath", "Liyanage", "sampath@gmail.com", "0771234575", "112 Station Road",
                                "1990-12-12"),
                        new Student("Chaminda", "Gunawardena", "chaminda@gmail.com", "0771234576",
                                "233 Beach Road", "1992-04-25"),
                        new Student("Dinesh", "Rathnayake", "dinesh@gmail.com", "0771234577", "45 Park Avenue",
                                "1991-10-08"),
                        new Student("Mahesh", "Senanayake", "mahesh@gmail.com", "0771234578", "67 School Lane",
                                "1993-06-14"),
                        new Student("Suresh", "Wijesinghe", "suresh@gmail.com", "0771234579", "89 Market Street",
                                "1994-01-29"),
                        new Student("Gayan", "Munasinghe", "gayan@gmail.com", "0771234580", "101 River Side",
                                "1995-08-17"),
                        new Student("Isuru", "Kariyawasam", "isuru@gmail.com", "0771234581", "202 Mountain View",
                                "1996-12-03"),
                        new Student("Lahiru", "Abeysekara", "lahiru@gmail.com", "0771234582", "303 Valley Road",
                                "1998-05-21"),
                        new Student("Kavindu", "Weerasinghe", "kavindu@gmail.com", "0771234583", "404 Forest Lane",
                                "1999-02-28"),
                        new Student("Tharindu", "Rajapaksha", "tharindu@gmail.com", "0771234584", "505 Ocean Drive",
                                "1997-11-11"),
                        new Student("Chathura", "Samarasinghe", "chathura@gmail.com", "0771234585", "606 Fort Road",
                                "1990-07-07"),
                        new Student("Asanka", "Weerakkody", "asanka@gmail.com", "0771234586", "707 Castle Street",
                                "1991-03-24"),
                        new Student("Roshan", "Ranasinghe", "roshan@gmail.com", "0771234587", "808 Palace Way",
                                "1992-09-16"),
                        new Student("Supun", "Jayawardena", "supun@gmail.com", "0771234588", "909 King Street",
                                "1993-12-31"),
                        new Student("Prasad", "Kumara", "prasad@gmail.com", "0771234589", "111 Queen Avenue",
                                "1994-04-04"),
                        new Student("Harsha", "De Silva", "harsha@gmail.com", "0771234590", "222 Prince Lane",
                                "1995-10-10"),
                        new Student("Madushan", "Peiris", "madushan@gmail.com", "0771234591", "333 Duke Road",
                                "1996-06-06"),
                        new Student("Sandun", "Ramanayake", "sandun@gmail.com", "0771234592", "444 Earl Street",
                                "1998-01-19"),
                        new Student("Janith", "Hettiarachchi", "janith@gmail.com", "0771234593", "555 Baron Boulevard",
                                "1999-08-22"),
                        new Student("Ashan", "Sirisena", "ashan@gmail.com", "0771234594", "666 Knight Court",
                                "1990-05-02"),
                        new Student("Malith", "Fonseka", "malith@gmail.com", "0771234595", "777 Squire Place",
                                "1991-11-14"),
                        new Student("Sahan", "Karunaratne", "sahan@gmail.com", "0771234596", "888 Page Path",
                                "1992-07-27"));

                studentRepository.saveAll(students);
                System.out.println("30 Student records seeded successfully!");
            }
        };
    }
}