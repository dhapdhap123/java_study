package array.ex;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int maxNum, minNum;
        int[] numbers = new int[N];
        for (int count = 0; count < N; count++){
            numbers[count] = scanner.nextInt();
        }

        maxNum = minNum = numbers[0];
        for (int count = 1; count < N; count++){
            if (numbers[count] > maxNum){
                maxNum = numbers[count];
            }
            if (numbers[count] < minNum){
                minNum = numbers[count];
            }
        }
        System.out.println("minNum = " + minNum);
        System.out.println("maxNum = " + maxNum);
    }
}
