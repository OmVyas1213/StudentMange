package com.example.StudentManagement.serviceImpl;

import com.example.StudentManagement.entity.Student;
import com.example.StudentManagement.repository.Studentrepositry;
import com.example.StudentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements StudentService {

    @Autowired
    Studentrepositry studentrepositry;

    @Override
    public List<Student> getAllStudents()
    {
        List<Student> list=studentrepositry.findAll();
        return list;
    }
    @Override
    public Student saveStudent(Student student) {
        return studentrepositry.save(student);
    }
    @Override
    public Student getById(int id) {
        return studentrepositry.findById(id).get();
    }




}
