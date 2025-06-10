package scanner.ex;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String name = scanner.nextLine();
            if (name.equals("종료")){
                break;
            }

            int age = scanner.nextInt();
            System.out.println("입력한 이름 : " + name + ", 나이 : " + age);

        }
    }
}
