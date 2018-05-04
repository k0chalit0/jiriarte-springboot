package com.ji.project.jiriartespringboot.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Teacher {
    //@Transient // Evita que se persista el field / atributo id en base de datos
    @Id
    @Transient
    private String id;
    private  long ci;
    private  String name;
    private int age;

    // fix error adding default constructor
    public Teacher(){

    }
    public Teacher(long ci, String name, int age) {
        this.ci = ci;
        this.name = name;
        this.age = age;
    }

    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

