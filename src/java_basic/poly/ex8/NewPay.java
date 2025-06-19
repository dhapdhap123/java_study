package java_basic.poly.ex8;

public class NewPay implements Pay {
    public boolean pay(int amount){
        System.out.println("뉴페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
