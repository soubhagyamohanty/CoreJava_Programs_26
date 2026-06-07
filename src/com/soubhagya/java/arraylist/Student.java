package com.soubhagya.java.arraylist;

public class Student  implements Comparable<Student>{
    private String name;
    private int age;
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        Integer ageComparision = Integer.compare(this.age, o.age);
        if(ageComparision == 0){
            return Integer.compare(this.rollNumber, o.rollNumber);
        }
        return ageComparision;
    }
}
