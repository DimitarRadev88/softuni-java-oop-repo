package com.workingWithAbstraction.lab.studentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public void ParseCommand(String[] input) {
        if ("Create".equals(input[0])) {
            createStudent(input);
        } else if ("Show".equals(input[0])) {
            System.out.println(getStudentInfo(input[1]));
        }
    }

    private String getStudentInfo(String name) {
        StringBuilder result = new StringBuilder();
        if (repo.containsKey(name)) {
            Student student = repo.get(name);
            result.append(String.format("%s is %s years old.", student.getName(), student.getAge()));
            if (student.getGrade() >= 5.00) {
                result.append(" Excellent student.");
            } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                result.append(" Average student.");
            } else {
                result.append(" Very nice person.");
            }

        }

        return result.toString();
    }

    private void createStudent(String[] input) {
        String name = input[1];
        int age = Integer.parseInt(input[2]);
        double grade = Double.parseDouble(input[3]);
        repo.putIfAbsent(name, new Student(name, age, grade));
    }
}
