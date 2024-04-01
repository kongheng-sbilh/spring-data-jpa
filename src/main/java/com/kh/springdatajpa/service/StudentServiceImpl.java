package com.kh.springdatajpa.service;

import com.kh.springdatajpa.entity.Student;
import com.kh.springdatajpa.model.StudentRequest;
import com.kh.springdatajpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student add(StudentRequest request) {
        Student student = Student.builder()
            .name(request.getName())
            .gender(request.getGender())
            .address(request.getAddress())
            .build();
        return studentRepository.save(student);
    }

    @Override
    public Student update(Long id, StudentRequest request) {
        Student student = findStudentById(id);
        student.setName(request.getName());
        student.setGender(request.getGender());
        student.setAddress(request.getAddress());
        return studentRepository.save(student);
    }

    @Override
    public Student findStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public String deleteStudent(Long id) {
        Student student = findStudentById(id);
        studentRepository.delete(student);
        return "Student was removed successfully!";
    }
}
