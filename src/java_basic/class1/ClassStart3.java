package java_basic.class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.score = 90;

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.score = 80;

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적:" + student1.score);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적:" + student2.score);
    }

}
