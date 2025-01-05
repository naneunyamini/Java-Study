package cond;

public class Switch3 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon;

        switch (grade){
            case 1:
                coupon = 1000;
                break;

            /* 2일 때와 3일 때 모두 3000원임 -> break가 없을 경우
            중단하지 않고 case3으로 넘어감 */
            case 2:
            case 3:
                coupon = 3000;
                break;
            default: // else 와 같은 개념 !
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰: " + coupon + "원");
    }
}
