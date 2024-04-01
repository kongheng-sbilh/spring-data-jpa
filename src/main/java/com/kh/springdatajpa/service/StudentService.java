package com.kh.springdatajpa.service;

import com.kh.springdatajpa.entity.Student;
import com.kh.springdatajpa.model.StudentRequest;

import java.util.List;

public interface StudentService {

    List<Student> getStudents();

    Student add(StudentRequest request);

    Student update(Long id, StudentRequest request);

    Student findStudentById(Long id);

    String deleteStudent(Long id);
}
