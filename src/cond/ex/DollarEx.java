package cond.ex;

public class DollarEx {
    public static void main(String[] args) {

        int dollar = 1;
        int money = 0;

        if (dollar < 0){
            System.out.println("잘못된 금액입니다");
        } else if ( dollar == 0){
            System.out.println("환전할 금액이 없습니다");
        } else{
            money = dollar * 1300;
            System.out.println("환전 금액은 " + money + "원입니다");
        }
    }
}
