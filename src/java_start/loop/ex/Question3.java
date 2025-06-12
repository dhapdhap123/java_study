package java_start.loop.ex;

public class Question3 {

    public static void main(String[] args) {
        int sum = 0;
//        int i = 1;
        int max = 10;
//        while (i <= max){
//            sum += i;
//            i++;
//        }

        for (int i = 1; i <= max; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
