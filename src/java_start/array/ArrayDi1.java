package java_start.array;

public class ArrayDi1 {


    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        int i = 0;
        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++){
                arr[row][column] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }

}
