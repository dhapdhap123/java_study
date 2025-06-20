package java_mid1.lang.immutable.address;

public class RefMain_3 {

    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("Seoul");
        Address b = new Address("Seoul");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "Busan");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress){
        System.out.println("주소 값을 변경합니다." + changeAddress);
        address.setValue(changeAddress);
    }
}
