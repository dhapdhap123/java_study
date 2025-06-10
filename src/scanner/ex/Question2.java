package scanner.ex;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요 : ");
        int intNum = scanner.nextInt();

        if (intNum % 2 == 0) {
            System.out.println("입력한 숫자" + intNum + "은 짝수입니다.");
        } else {
            System.out.println("입력한 숫자" + intNum + "은 홀수입니다.");
        }
    }
}
