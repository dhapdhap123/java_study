package scanner.ex;

import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt = 0;
        double sum = 0;
//        while (true){
//            int intNum = scanner.nextInt();
//
//            if (intNum == -1){
//                break;
//            }
//
//            cnt++;
//            sum += intNum;
//        }
        double input;
        while ((input = scanner.nextInt()) != -1){
            cnt++;
            sum += input;
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + (double) sum / cnt);
    }
}
