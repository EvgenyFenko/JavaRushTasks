package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class StudentsDataBase {
    public static List<Student> students = new ArrayList<>();

//    public static void addInfoAboutStudent(String name, int age, double averageGrade) {
//        Student student = new Student(name, age, averageGrade);
//        students.add(student);
//        printInfoAboutStudent(student.getName(), student);
//
//    }

    public static void addInfoAboutStudent(Student student) {
//        Student student = new Student(name, age, averageGrade);
        students.add(student);
        printInfoAboutStudent(student);

    }

//    public static void printInfoAboutStudent(String name, Student student) {
//        System.out.println("Имя: " + name + " Возраст: " + student.getAge());
//    }

    public static void printInfoAboutStudent(Student student) {
        String name = student.getName();
        System.out.println("Имя: " + name + " Возраст: " + student.getAge());
    }


    public static void removeStudent(int index) {
        if (!(index < 0 || index >= students.size())) {
            students.remove(index);
        }
    }

    public static void findDimaOrSasha() {
//        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
//            if (!found) {
                if (students.get(i).getName().equals("Dima")) {
                    System.out.println("Студент Dima есть в базе.");
//                    found = true;
                    break;
                }

                if (students.get(i).getName().equals("Sasha")) {
                    System.out.println("Студент Sasha есть в базе.");
//                    found = true;
                    break;
                }
//            }
        }
    }
}