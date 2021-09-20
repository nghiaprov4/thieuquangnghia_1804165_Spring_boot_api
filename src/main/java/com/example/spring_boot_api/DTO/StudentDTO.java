package com.example.spring_boot_api.DTO;

import com.example.spring_boot_api.entity.Student;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility =  JsonAutoDetect.Visibility.ANY)
public class StudentDTO {
    private  String email ;
    private  String firstName ;
    private  String lastName ;

    public StudentDTO(Student original) {
        this.email= original.getEmail();
        this.firstName=original.getFirstName();
        this.lastName=original.getLastName();

    }
}
