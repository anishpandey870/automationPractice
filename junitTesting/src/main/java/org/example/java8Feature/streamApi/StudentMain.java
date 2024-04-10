package org.example.java8Feature.streamApi;

import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int score;
//constructor
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
//getter
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
}

public class StudentMain {
    public static void main(String[] args) {
        List<Student> list= Arrays.asList(
                new Student("Rohit",68),
                new Student("Suraj",70),
                new Student("Aman",81),
                new Student("Sital",88)
        );
        list.stream().filter(p->p.getScore()>=80)
                .limit(2)
                .forEach(student -> System.out.println(student.getName()+" "+student.getScore()));
    }
}
