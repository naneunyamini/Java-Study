package method;

public class MethodCasting1 {

    public static void main(String[] args) {

        double number = 1.5;
//        printNumber(number); -> 타입이 맞지 않음
        printNumber((int)number); //명시적으로 형변환을 사용해 double을 int로 변환

    }

    public static void printNumber(int n){

        System.out.println("숫자: "+n);
    }
}
