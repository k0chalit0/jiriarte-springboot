package com.ji.project.jiriartespringboot.web;

import com.ji.project.jiriartespringboot.domain.Student;
import com.ji.project.jiriartespringboot.service.StudentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/students")
@Api(value="onlinestore", description="Operations pertaining a Students Service")

public class StudentController {
    // dependency Injection
    @Autowired
    private StudentService studentService;
    // Get all students
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(path="/{id}",method = RequestMethod.GET)
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }
    // insert new Student
    @RequestMapping(method = RequestMethod.POST)
    public void addNewStudent(@RequestBody Student newStudent){
        System.out.println("the Name of new Student is "+newStudent.getFullName());
        studentService.addNewStudent(newStudent);
    }
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable String id){
        System.out.println("the Id delete is " + id);
        studentService.deleteStudent(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteStudentsByRequest(@RequestBody Student student){
        System.out.println("the id of student to delete is "+ student.getCi());
        studentService.deleteStudent(student.getId());
    }

    @RequestMapping(path="/{id}", method = RequestMethod.PUT)
    public Student updateStudentById(@PathVariable String id, @RequestBody Student student){
        return studentService.updateStudentById(id, student);
    }

}

