package java_basic.class1;

import java.util.Arrays;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentScores = {90, 80};

        for (int i = 0; i < 2; i++){
            printStudentInfo(studentNames[i], studentAges[i], studentScores[i]);
        }
    }

    public static void printStudentInfo(String name, int age, int score){
        System.out.println("이름: " + name + " 나이: " + age + " 성적: " + score);
    }
}
