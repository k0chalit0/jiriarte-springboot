package com.ji.project.jiriartespringboot.Repository;

import com.ji.project.jiriartespringboot.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TeacherRepository extends MongoRepository<Teacher, String> {
    //Teacher getTeacherById (String id);
    Teacher findOneById (String id);

}
