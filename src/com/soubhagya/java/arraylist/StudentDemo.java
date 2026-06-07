package com.soubhagya.java.arraylist;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class StudentDemo {
    static void main(String[] args) {
        var studentList = new ArrayList<Student>();
        studentList.add(new Student("Soubhagya",31,91));
        studentList.add(new Student("Priyanka",27,93));
        studentList.add(new Student("John",25,95));
        studentList.add(new Student("Doe",37,99));
        studentList.add(new Student("Smith",37,104));
       // System.out.println(studentList);
        //Collections.sort(studentList,Collections.reverseOrder());
        //studentList.sort(Collections.na);
        studentList.sort((s1,s2)->s1.compareTo(s2));
        StudentDemo demo = new StudentDemo();
        System.out.println(demo.getClass());
        //demo.getClass().getDeclaredMethod().getName())
        Method[] methods = demo.getClass().getSuperclass().getDeclaredMethods();
        System.out.println(methods.length);
        for (Method method : methods) {
            System.out.println(method.getName());

        }
    }
}
