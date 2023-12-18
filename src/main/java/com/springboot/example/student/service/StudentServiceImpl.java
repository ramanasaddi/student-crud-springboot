package com.springboot.example.student.service;

import com.springboot.example.student.model.Student;
import com.springboot.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentRepository studentrepository;

    @Override
    public List<Student> getStudents() {
        return studentrepository.findAll();
    }

    public Student saveStudent(Student student){
        Student studentDb = studentrepository.save(student);
        return studentDb;
    }

    public void deleteStudent(Student student){
        studentrepository.delete(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentrepository.findById(id).orElse(null);
    }
}
