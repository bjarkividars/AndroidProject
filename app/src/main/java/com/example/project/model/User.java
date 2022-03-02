package com.example.project.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "users")
public class User {

    private int age;

    @NonNull
    @PrimaryKey(autoGenerate = true)
    public int id;

    @NonNull
    @ColumnInfo(name = "name")
    public String name;


    @NonNull
    @ColumnInfo(name = "photoURL")
    public String photoURL;

    @NonNull
    @ColumnInfo(name = "courses")
    public List<Course> courses;


    public User (String name, String photoURL, List<Course> courses, int age){
        this.name = name;

        this.photoURL = photoURL;

        this.courses = courses;

        this.age = age;
    }

    public String getName(){return this.name;}

    public String getPhotoURL(){return this.photoURL;}

    public List<Course> getCourses(){return this.courses;}

    public int getAge() {
        return age;
    }

}