package java_basic.ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;
        System.out.println("A: " + dataA.value);
        System.out.println("B: " + dataB.value);

        dataA.value = 20;
        System.out.println("A: " + dataA.value);
        System.out.println("B: " + dataB.value);

        dataB.value = 30;
        System.out.println("A: " + dataA.value);
        System.out.println("B: " + dataB.value);
    }
}
