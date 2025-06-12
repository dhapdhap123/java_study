package java_start.array;

public class Array4 {


    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // 선언과 함께만 사용 가능

        for (int i = 0; i < students.length; i++){
            students[i] = i;
            System.out.println(students[i]);
        }
    }

}
