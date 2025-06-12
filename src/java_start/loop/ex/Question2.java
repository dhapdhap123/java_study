package java_start.loop.ex;

public class Question2 {

    public static void main(String[] args) {
//        int count = 1;
//        int num = 2;
//        while (count <= 10){
//            System.out.println(num);
//            count++;
//            num += 2;
//        }

        for (int num = 2, count = 1; count <= 10; num += 2, count++){
            System.out.println(num);
        }
    }
}
