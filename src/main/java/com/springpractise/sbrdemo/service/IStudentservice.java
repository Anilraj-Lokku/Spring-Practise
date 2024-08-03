package com.springpractise.sbrdemo.service;

import java.util.List;

import com.springpractise.sbrdemo.model.Student;

public interface IStudentservice {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student updateStudent(Student student, Long id);
    Student getStudentById(Long id); //get student by id
    void deleteStudent(Long id); //delete a Student


}
