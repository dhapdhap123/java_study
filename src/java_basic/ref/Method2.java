package java_basic.ref;

import java_basic.ref.Student;

public class Method2 {

    public static void main(String[] args) {
        Student student1 = initStudent("학생1", 15, 90);
        Student student2 = initStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
    }

    static Student initStudent(String name, int age, int score){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.score = score;

        return student;
    }

    static void printStudent(Student s){
        System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적:" + s.score);
    }

}
