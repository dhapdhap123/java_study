package java_start.array;

public class Array3 {


    public static void main(String[] args) {
        int[] students = new int[5];

        for (int i = 0; i < students.length; i++){
            students[i] = i;
            System.out.println(students[i]);
        }
    }

}
