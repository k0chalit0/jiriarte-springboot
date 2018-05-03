package com.ji.project.jiriartespringboot.service;

import com.ji.project.jiriartespringboot.Repository.StudentRepository;
import com.ji.project.jiriartespringboot.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    // CRUD
    // List Students
    public List<Student> getAllStudents(){
        //get all documents from collection teacher
        return studentRepository.findAll();
        //return listTeacher;
    }
    // Add new Teacher
    public void addNewStudent(Student newStudent){
        // insert new Teacher into DB
        studentRepository.save(newStudent);
    }

    public void deleteStudent(String id){
        studentRepository.deleteById(id);
    }

    public Student getStudentById(String id){
        return studentRepository.findOneById(id);
    }

}
