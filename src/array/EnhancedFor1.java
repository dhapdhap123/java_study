package array;

public class EnhancedFor1 {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for 문
        for (int i = 0; i < numbers.length; i ++){
            System.out.println(numbers[i]);
        }

        // 향상된 for문(for-each문), for-each문, 단축키 - iter
        // i값 필요할 때는 사용 X
        for (int number : numbers){
            System.out.println(number);
        }

    }

}
