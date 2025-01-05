package cond;

public class If6 {
    public static void main(String[] args) {


        /* 이 경우에는 if문이 묶어져있기 때문에 이미 첫번째 If문에서 조건이
        끝나버려서 두 가지 조건이 모두 충족되지 못함 */
        int price = 10000;
        int age = 10;
        int discount = 0; //할인된 금액

        if ( price >= 10000 ){
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if ( age >= 10 ){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else{
            System.out.println("할인없음"); // 다 성립이 되지 않는 경우
        }

        System.out.println("총 할인 금액: "+ discount + "원");


        //if문이 하나일 경우 중괄호 생략 가능함 -> 가독성 떨어짐
    }
}
