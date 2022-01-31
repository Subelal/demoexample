package com.example.demo.config;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        List list = new ArrayList<Student>();
        return args -> {
            Student anchal = new Student(
                    "Anchal",
                    "anchal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5));
            Student subham = new Student(
                    "subham",
                    "subham@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5));
            Student preeti = new Student(
                    "preeti",
                    "preeti@gmail.com",
                    LocalDate.of(2006, Month.JANUARY, 5));

            studentRepository.saveAll(
                    Arrays.asList(anchal,subham,preeti)
            );
        };
    }
}
