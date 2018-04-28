package com.ji.project.jiriartespringboot.service;

    import com.ji.project.jiriartespringboot.domain.Teacher;
    import org.springframework.stereotype.Service;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.jar.Attributes;

    @Service
    public class TeacherService {

        private static final List<Teacher> listTeacher = new ArrayList<>();

        public TeacherService(){
            listTeacher.add(new Teacher(0, "Jose"));
            listTeacher.add(new Teacher(1, "Jhonny"));
            listTeacher.add(new Teacher(2, "Gabriel"));
            listTeacher.add(new Teacher(3, "Daniela"));
        }
        // CRUD

        /* List Teachers */
        public List<Teacher> getAllTeachers(){
            return listTeacher;
        }

        /* Add Teacher */
        public void addNewTeacher( Teacher newTeacher){
            // insert new Teacher into DB
            listTeacher.add(newTeacher);
        }

        /* Delete Teacher by Id*/
        public void deleteTeacher(int id){
            listTeacher.remove(id);
        }

        /* Get a Teacher by Id*/
        public Teacher getTeacherById(int id){
            //get a Teacher by id from DB
            return listTeacher.get(id);
        }

        /* Delete Teacher by Object */
        /*
        public void deleteTeacherByTeacher(Teacher teacher){
            listTeacher.remove(teacher);
        }*/

        /*public List<Teacher> getAllTeachers(){
            List<Teacher> listTeachers = new ArrayList<>();
            listTeachers.add(new Teacher(1, "jhonny"));
            listTeachers.add(new Teacher(2, "Gabriel"));
            listTeachers.add(new Teacher(3, "Su"));
            return listTeachers;
        }*/

    }
