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
/*
    public void deleteStudentByCodsis(long codsis){
        studentRepository.deleteByCodsis(codsis);
    }
*/
    public Student getStudentById(String id){
        return studentRepository.findOneById(id);
    }

    public Student updateStudentById(String id, Student studentDetails){
        Student student = studentRepository.findOneById(id);
        student.setFirstName((studentDetails.getFirstName() == null || studentDetails.getFirstName().isEmpty() ) ? student.getFirstName() : studentDetails.getFirstName());
        student.setLastName(studentDetails.getLastName() == null || studentDetails.getLastName().isEmpty() ? student.getLastName() : studentDetails.getLastName() );
        student.setCi( studentDetails.getCi() == 0 ? student.getCi() : studentDetails.getCi() );

        Student updatedStudent = studentRepository.save(student);
        return updatedStudent;
    }

    public void updateStudent ( Student updateStudent){
        studentRepository.save(updateStudent);
    }
}
