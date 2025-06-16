package java_basic.static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
        // 인스턴스 생성을 막는다.
    }

    public static int sum(int[] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static double average(int[] array){
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    public static int min(int[] array){
        int minNum = array[0];
        for (int i : array) {
            if (i < minNum){
                minNum = i;
            }
        }
        return minNum;
    }

    public static int max(int[] array){
        int maxNum = array[0];
        for (int i : array) {
            if (i > maxNum){
                maxNum = i;
            }
        }
        return maxNum;
    }
}
