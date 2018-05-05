package com.ji.project.jiriartespringboot.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
    
    @Id
    //@Transient
    private String id;
    private long ci;
    private String firstName;
    private String lastName;
    private int age;
    private long codsis;

    public Student(){};

    public Student(long ci, String firstName, String lastName, int age, long codsis){
        this.ci = ci;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.codsis = codsis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getCodsis() {
        return codsis;
    }

    public void setCodsis(long codsis) {
        this.codsis = codsis;
    }
}
