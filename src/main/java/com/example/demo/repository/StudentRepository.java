package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static org.hibernate.loader.Loader.SELECT;

@Repository
public interface  StudentRepository
             extends JpaRepository<Student,Long> {

//    @Override
//    @Query("SELECT S FROM STUDENT S where S.email =?1")
    Optional<Student> findStudentByEmail(String email);
}
