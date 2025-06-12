package java_start.array.ex;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] scores = new int[4][4];
        String[] subjects = {"국어", "영어", "수학"};
        for (int i = 0; i < scores.length; i++){
            System.out.println(i + 1 + "번 학생의 성적을 입력하세요:");

            int sum = 0;
            for (int j = 0; j < 3; j++){
                System.out.print(subjects[j] + " 점수:");
                int score = scanner.nextInt();
                scores[i][j] = score;
                sum += score;
            }
            scores[i][3] = sum;
        }

        for (int i = 0; i < scores.length; i++){
            System.out.print(i + 1 + "번 학생의 총점: " + scores[i][3] + ", 평균: " + (double) scores[i][3] / 3);
            System.out.println();
        }
    }
}
