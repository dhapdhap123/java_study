package scanner.ex;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intNum = scanner.nextInt();

        for (int i = 1; i <= 9; i++){
            System.out.println(intNum + " X " + i + " = " + i * intNum);
        }
    }
}
