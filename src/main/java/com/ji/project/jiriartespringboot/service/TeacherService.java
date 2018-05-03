package com.ji.project.jiriartespringboot.service;

    import com.ji.project.jiriartespringboot.domain.Teacher;
    import com.ji.project.jiriartespringboot.Repository.TeacherRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import java.util.ArrayList;
    import java.util.List;

    @Service
    public class TeacherService {
        private static final List<Teacher> listTeacher = new ArrayList<>();

        @Autowired
        private TeacherRepository teacherRepository;

        public TeacherService(){

            listTeacher.add(new Teacher(0,"Rudy"));
            listTeacher.add(new Teacher(1,"Carlitos"));
            listTeacher.add(new Teacher(2,"Jorgito"));
            listTeacher.add(new Teacher(3,"Noemi"));
        }

        // CRUD
        // List Teachers
        public List<Teacher> getAllTeachers(){
            //get all documents from collection teacher
            return teacherRepository.findAll();

            // get all teacher from DB
            //return listTeacher;
        }
        // Add new Teacher
        public void addNewTeacher(Teacher newTeacher){
            // insert new Teacher into DB
            teacherRepository.save(newTeacher);
            //listTeacher.add( newTeacher);
        }

        // Delete Teacher by Id
        @Deprecated
        public void deleteTeacher(int id){
            // delete a teacher by id in DB
            listTeacher.remove(id);
        }

        public void deleteTeacher(String id){
            // delete a teacher by id in DB
            teacherRepository.deleteById(id);
            //listTeacher.remove(id);
        }

        // Get a teacher By Id
        @Deprecated
        public Teacher getTeacherById(int id){
            // get a Teacher by id from DB
            return listTeacher.get(id);
        }

        public Teacher getTeacherById(String id){
            // get a Teacher by id from DB
            return teacherRepository.findOneById(id);
        }

        public Teacher updateTeacherById(String id, Teacher teacherDetails){
            Teacher teacher = teacherRepository.findOneById(id);
            teacher.setName((teacherDetails.getName() == null || teacherDetails.getName().isEmpty() ) ? teacher.getName() : teacherDetails.getName());
            teacher.setCi( teacherDetails.getCi() == 0 ? teacher.getCi() : teacherDetails.getCi() );

            Teacher updatedTeacher = teacherRepository.save(teacher);
            return updatedTeacher;
        }
    }
