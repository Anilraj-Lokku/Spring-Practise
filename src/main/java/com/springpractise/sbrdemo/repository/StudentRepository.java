package com.springpractise.sbrdemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springpractise.sbrdemo.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByEmail(String email);

}
