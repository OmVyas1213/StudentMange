package com.example.StudentManagement.repository;

import com.example.StudentManagement.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Studentrepositry extends JpaRepository<Student,Integer> {


}
