package poly.ex.pay1;

public class PayStore {

    public static Pay findPay(String option) {
        Pay pay;
        if (option.equals("kakao")) {
            pay = new KakaoPay();
        } else if (option.equals("naver")) {
            pay = new NaverPay();
        } else if (option.equals("newpay")) {
            pay = new NewPay();
        }else {
            return new DefaultPay();
        }
        return pay;
    }
}
