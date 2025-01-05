package cond;

public class Switch1 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon; // 변수 선언만 하고
        if (grade == 1){ // = 가 아니고 == 라는 점 주의하기 !!
            coupon = 1000; // 변수 값을 설정해줌

        }else if ( grade == 2){
            coupon = 2000;

        }else if ( grade == 3){
            coupon = 3000;

        }else {
            coupon = 500;
        }
        System.out.println("발급받은 쿠폰" + coupon); // 출력문을 한번에 써줌
    }
}
