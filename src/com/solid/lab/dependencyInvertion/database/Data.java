package com.solid.lab.dependencyInvertion.database;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Course> courseList;

    public Data() {
        this.courseList = new ArrayList<>();
    }

    public Iterable<Integer> courseIds() {
        return courseList.stream().map(Course::getId).toList();
    }

    public Iterable<String> courseNames() {
        return courseList.stream().map(Course::getName).toList();
    }

    public Iterable<String> search(String substring) {
        return courseList.stream().map(Course::getName).filter(c -> c.contains(substring)).toList();
    }

    public String getCourseById(int id) {
        return courseList.stream().filter(c -> c.getId() == id).map(Course::getName).findFirst().orElse(null);
    }
}
