package java_start.array.ex;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] iter = new int[5];
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < iter.length; i++) {
            iter[i] = scanner.nextInt();
            sum += iter[i];
        }

        avg = (double) sum / iter.length;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
