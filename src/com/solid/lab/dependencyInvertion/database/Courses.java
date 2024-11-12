package com.solid.lab.dependencyInvertion.database;

public class Courses {
    private Data database;

    public Courses(Data database) {
        this.database = database;
    }

    public void printAll() {
        Iterable<String> courses = database.courseNames();
        courses.forEach(System.out::println);
    }

    public void printIds() {
        Iterable<Integer> coursesIds = database.courseIds();
        coursesIds.forEach(System.out::println);
    }

    public void printById(int id) {
        String course = database.getCourseById(id);
        System.out.println(course);
    }

    public void search(String substring) {
        Iterable<String> courses = database.search(substring);
    }
}
