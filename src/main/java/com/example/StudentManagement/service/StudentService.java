package com.example.StudentManagement.service;

import com.example.StudentManagement.entity.Student;

import java.util.List;

public interface StudentService
{
    public List<Student> getAllStudents();

    public Student saveStudent(Student student);

    public Student getById(int id);

}
