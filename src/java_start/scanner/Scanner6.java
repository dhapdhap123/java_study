package java_start.scanner;

import java.util.Scanner;

public class Scanner6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true){
            System.out.print("숫자 입력(0 입력 시 종료) : ");
            int num = scanner.nextInt();

            if (num == 0){
                break;
            }
            sum += num;
            System.out.println("sum = " + sum);
        }
    }
}
