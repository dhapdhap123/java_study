package java_basic.poly.ex8;

public class PayService {
    Pay[] pays = {new KakaoPay(), new NaverPay()};
    String[] payOptions = {"kakao", "naver"};

    public void processPay(String payOption, int amount){
        System.out.println("결제를 시작합니다: option=" + payOption + ", amount=" + amount);

        Pay pay = PayStore.findPay(payOption);
        boolean result = pay.pay(amount);

        if (result) System.out.println("결제가 성공했습니다.");
        else System.out.println("결제가 실패했습니다.");
    };
}
