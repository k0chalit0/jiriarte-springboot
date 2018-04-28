package com.ji.project.jiriartespringboot.web;


import com.ji.project.jiriartespringboot.domain.Teacher;
import com.ji.project.jiriartespringboot.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/teachers")
@Api(value="onlinestore", description="Operations pertaining a Teachers Service")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getTeachers(){
        return teacherService.getAllTeachers();
    }

    //add Teacher
    @RequestMapping(method = RequestMethod.POST)
    public void addNewTeacher(@RequestBody Teacher newTeacher){
        System.out.println("the Name of new Teacher is "+newTeacher.getName());
        teacherService.addNewTeacher(newTeacher);
    }

    //get Teacher
    @RequestMapping(path="/{id}", method = RequestMethod.GET)
    public Teacher getTeacherById(@PathVariable int id){
        return teacherService.getTeacherById(id);
    }

    //delete Teacher
    @RequestMapping(path="/{id}", method = RequestMethod.DELETE)
    public void deleteTeacher(@PathVariable int id){
        System.out.println("the Id delete is "+ id);
        teacherService.deleteTeacher(id);
    }

    //delete Teacher by Object
    @RequestMapping( method = RequestMethod.DELETE)
    public void deleteTeacherByObject(@RequestBody Teacher delTeacher){
        System.out.println("the Teacher delete is "+ delTeacher.getName());
        teacherService.deleteTeacher( (int) delTeacher.getId() );
    }
}

