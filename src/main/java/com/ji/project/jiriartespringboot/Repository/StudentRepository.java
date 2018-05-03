package com.ji.project.jiriartespringboot.Repository;

import com.ji.project.jiriartespringboot.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
    Student findOneById (String id);
}
