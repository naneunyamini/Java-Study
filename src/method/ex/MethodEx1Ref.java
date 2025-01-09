package method.ex;

public class MethodEx1Ref {

    public static void main(String[] args) {

        double num1 = average(1,2,3);
        System.out.println("평균값: "+ num1);

        double num2 = average(15,25,35);
        System.out.println("평균값: "+ num2);

        //더 간단한 방법은
        System.out.println("평균값: " + average(15,25,35));


    }
    public static double average(int a,int b,int c){
        int sum = a + b + c;
        return sum / 3.0;

        //return할 값의 타입을 매개변수의 타입형으로 맞춰주기 !
    }

}

