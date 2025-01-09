package method;

public class MethodCasting2 {

    public static void main(String[] args) {

        //자동 형변환
        int number = 100;

        printNumber(number); //int에서 double로는 자동 형변환이 가능함
    }

    public static void printNumber(double n){

        System.out.println("숫자: "+n);
        //double형 매개변수에 int형 인수를 전달하는데 문제없이 잘 작동함
    }
}
