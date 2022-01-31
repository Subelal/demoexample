package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
//@Component
public class StudentService {

    @Autowired
    private  StudentRepository studentRepository;

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student){
        Optional<Student> studentByEmail =
        studentRepository.findStudentByEmail(student.getEmail());
        if(studentByEmail.isPresent()){
            throw new IllegalStateException("Email Taken");
        }
        studentRepository.save(student);
        System.out.println(student);
    }

    public void deleteStudentById(Long studentId) {
       boolean exists= studentRepository.existsById(studentId);
       if(!exists){
           throw  new IllegalStateException("Student with id "+studentId+" does not exists");
       }
       studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId,
                              String name,
                              String email) {

       Student student= studentRepository.findById(studentId)
               .orElseThrow(() -> new IllegalStateException(
                       "Student with id "+studentId+" does not exists"
               ));

        if(name !=null
                && name.length() >0
                && !Objects.equals(student.getName(),name)){
            student.setName(name);
        }

        if(email !=null
                && email.length() >0
                && !Objects.equals(student.getEmail(),email)){
            Optional<Student> studentOptional = studentRepository.findStudentByEmail(email);
            if(studentOptional.isPresent()){
                throw new IllegalStateException("Email is already present ");
            }
            student.setEmail(email);
        }





    }
}
