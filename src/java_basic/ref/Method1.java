package java_basic.ref;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        initStudent(student1, "학생1", 15, 90);
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int score){
        student.name = name;
        student.age = age;
        student.score = score;
    }

    static void printStudent(Student s){
        System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적:" + s.score);
    }

}
