package method;

public class Overloading3 {

    //매개변수의 타입이 다른 경우
    public static void main(String[] args) {

        System.out.println("1: "+add(1,2));
        System.out.println("2: "+add(1.2,2.5));
    }

    public static int add(int a,int b){
        System.out.println("1번 호출");
        return a+b;
    }

    /*
    public static int add(int a,int b){

        System.out.println("1번 호출");
        return a+b;
    }
    만약 이 코드가 없을 경우 1번 호출 : 3.0이 나옴
    그 이유는 double형 매개변수가 int형 인수를 받을 때 타입이 자동 형변환이 이루어짐
    작은 것(int)에서 큰 것(double)은 자동 형변환이 가능함
     */


    public static double add(double a,double b){
        System.out.println("2번 호출");
        return a+b;
    }
}
