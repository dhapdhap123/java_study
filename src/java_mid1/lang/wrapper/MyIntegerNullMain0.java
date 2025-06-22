package java_mid1.lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
    }

    private static int findValue(int[] intArr, int target){
        for (int value: intArr){
            if (value == target){
                return value;
            };
        }
        return -1;
    }
}
