package com.springpractise.sbrdemo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpractise.sbrdemo.exception.StudentAlreadyExistsException;
import com.springpractise.sbrdemo.exception.StudentNotFoundException;
import com.springpractise.sbrdemo.model.Student;
import com.springpractise.sbrdemo.repository.StudentRepository;
import com.springpractise.sbrdemo.service.IStudentservice;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor //This Annotation is used to inject dependencies through constructor
public class StudentServiceImpl implements IStudentservice{
    
    @Autowired
    private final StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {

        if(studentAlreadyExists(student.getEmail())){
            throw new StudentAlreadyExistsException(student.getEmail()+"Already Exsists!!!");
        }
        return studentRepository.save(student);
    }

    
    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
    
    @Override
    public Student updateStudent(Student student, Long id) {
        return studentRepository.findById(id).map(st -> {
            st.setFirstname(student.getFirstname());
            st.setLastname(student.getLastname());
            st.setEmail(student.getEmail());
            st.setDepartment(student.getDepartment());
            return studentRepository.save(st);
        }).orElseThrow(() -> new StudentNotFoundException("Sorry!!!.. This Student Could Not Be Found..."));
    }


    
    @Override
    public Student getStudentById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'getStudentById'");
    }
    
    @Override
    public void deleteStudent(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
    }

    //Implementing Methods....!!!
    private boolean studentAlreadyExists(String email) {
        return studentRepository.findByEmail(email).isPresent();
    }
}
