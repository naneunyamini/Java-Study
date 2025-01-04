package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {

        //전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; //a값을 먼저 증가시키고 그 결과를 b에 대입함
        System.out.println("a = "+ a + ", b = " + b);

        
        //후의 증감 연산자 사용 예
        a = 1; //a의 값을 다시 1로 지정
        b = 0; //b의 값을 다시 0으로 지정

        b = a++; //a의 현재 값을 b에 먼저 대입하고 그 후 a 값을 증가시킴
        System.out.println("a = " + a +",b = " + b);


        //a만 증가시키는 경우라서 전위 후위 모두 사용 가능
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
    }
}
