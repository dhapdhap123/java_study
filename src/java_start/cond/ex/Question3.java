package java_start.cond.ex;

public class Question3 {

    public static void main(String[] args) {
        int dollar = 7;
        int wonDollar = 1300;

        if (dollar < 0){
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0){
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("환전 금액은 " + dollar * wonDollar + "원입니다.");
        }
    }
}
