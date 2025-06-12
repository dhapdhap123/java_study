package java_basic.class1;

public class ClassStart1 {

    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Score = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Score = 80;

        printStudentInfo(student1Name, student1Age, student1Score);
        printStudentInfo(student2Name, student2Age, student2Score);
    }

    public static void printStudentInfo(String name, int age, int score){
        System.out.println("이름: " + name + " 나이: " + age + " 성적: " + score);
    }
}
