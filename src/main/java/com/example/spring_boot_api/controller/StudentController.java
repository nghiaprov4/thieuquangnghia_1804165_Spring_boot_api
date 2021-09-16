package com.example.spring_boot_api.controller;

import com.example.spring_boot_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<com.example.springboot_main.entity.Student> getListStudent() {
        System.out.println(studentService.findAll());
        return studentService.findAll();
    }
    @GetMapping("/students/{id}")
    public com.example.springboot_main.entity.Student getStudent(@PathVariable long id){
        return studentService.findById(id);
    }

    @PostMapping("/students")
    public com.example.springboot_main.entity.Student addNewStudent(@RequestBody com.example.springboot_main.entity.Student student){
        student.setId(Long.valueOf(0));
        studentService.saveStudent(student);
        return student;
    }

    @PutMapping("/students")
    public com.example.springboot_main.entity.Student updateStudent(@RequestBody com.example.springboot_main.entity.Student student){

        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable long id){
        studentService.deleteById(Long.valueOf(id));
        return "Deleted student "+ id;
    }


}
