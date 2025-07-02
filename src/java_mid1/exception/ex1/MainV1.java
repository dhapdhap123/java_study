package java_mid1.exception.ex1;

import java.util.Scanner;

public class MainV1 {

    public static void main(String[] args) {
//        NetworkServiceV1 networkService = new NetworkServiceV1();
//        NetworkServiceV2 networkService = new NetworkServiceV2();
        NetworkServiceV3 networkService = new NetworkServiceV3();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")){
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
