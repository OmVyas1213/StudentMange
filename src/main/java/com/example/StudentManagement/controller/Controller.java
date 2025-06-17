package com.example.StudentManagement.controller;

import com.example.StudentManagement.entity.Student;
import com.example.StudentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private StudentService service;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/students")
    public String getAllStudents(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        service.saveStudent(student);
        return "redirect:/students";
    }

    @PostMapping("/students/edit/{id}")
    public String editStudent(@PathVariable int id, Model model) {
        model.addAttribute("student", service.getById(id));
        return "update_student"; //  exact filename in templates folder
    }
}
