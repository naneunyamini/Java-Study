package cond;

public class If5 {
    public static void main(String[] args) {

        /*
        int age = 10;
        int price = 10000;
        int discount = 0; //할인된 금액

        if ( price >= 10000){
            discount =  price - 1000;
            System.out.println(discount);
        }else if ( age <= 10 ){
            discount = price - 1000;
            System.out.println(discount);
        }
        if ( age <=10 && price >= 10000){
            discount = price - 2000;
            System.out.println(discount);
        }
        */


        // 독립적인 if문을 사용해야 두 조건이 모두 성립한 경우가 나옴
        int age = 10;
        int price = 10000;
        int discount = 0; //할인된 금액

        if ( price >= 10000 ){
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }
        if ( age >= 10 ){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액: "+ discount + "원");

    }
}
