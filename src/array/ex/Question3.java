package array.ex;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++){
            int intNum = scanner.nextInt();
            numbers[i] = intNum;
        }

//        for (int i = 0; i < numbers.length; i++){
//            System.out.print(numbers[numbers.length - i - 1]);
//            if (i != numbers.length - 1){
//                System.out.print(", ");
//            }
//        }
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }

    }
}
