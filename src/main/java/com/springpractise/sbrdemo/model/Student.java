package com.springpractise.sbrdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// import lombok.*;
import org.hibernate.annotations.NaturalId;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
//    @NaturalId(mutable = true)
    @NaturalId(mutable = true)
    private String email;
    private String department;


    // public Student(Long id, String firstname, String lastname, String email, String department) {
    //     this.id = id;
    //     this.firstname = firstname;
    //     this.lastname = lastname;
    //     this.email = email;
    //     this.department = department;
    // }

    // public Student() {
    // }



    // public Long getId() {
    //     return id;
    // }
    // public String getFirstname() {
    //     return firstname;
    // }
    // public String getLastname() {
    //     return lastname;
    // }
    // public String getEmail() {
    //     return email;
    // }
    // public String getDepartment() {
    //     return department;
    // }
    // public void setId(Long id) {
    //     this.id = id;
    // }
    // public void setFirstname(String firstname) {
    //     this.firstname = firstname;
    // }
    // public void setLastname(String lastname) {
    //     this.lastname = lastname;
    // }
    // public void setEmail(String email) {
    //     this.email = email;
    // }
    // public void setDepartment(String department) {
    //     this.department = department;
    // }

}
