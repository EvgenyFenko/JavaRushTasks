package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private University university;
    private String name;
    private int age;
    private List<Student> students = new ArrayList<>();

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Student getStudentWithAverageGrade(double value) {
        for (Student student : students) {
            if (student.getAverageGrade() == value) {
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        double maxAverageGrade = students.get(0).getAverageGrade();
        Student result = students.get(0);
        for (Student student : students) {
            if (student.getAverageGrade() > maxAverageGrade) {
                maxAverageGrade = student.getAverageGrade();
                result = student;
            }
        }
        return result;
    }

    public Student getStudentWithMinAverageGrade() {
        double minAverageGrade = students.get(0).getAverageGrade();
        Student result = students.get(0);
        for (Student student : students) {
            if (student.getAverageGrade() < minAverageGrade) {
                minAverageGrade = student.getAverageGrade();
                result = student;
            }
        }
        return result;
    }

    public void expel(Student student) {
        students.remove(student);
    }
}