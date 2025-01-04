package operator;

public class Operator1 {
    public static void main(String[] args) {

        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        //뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        //ctrl + r 하면 실행됨

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        //나눗셈
        int div = a /b; // int형으로 인식해서 소수는 표현 못 함
        System.out.println("a / b = " + div);


        //나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);

        /* 0으로 나눌 수 없음 -> 만약 b = 0 으로 초기화한 수라면 곱셈까지만 실행값이
        나오고 나눗셈 이후로는 실행값이 오류로 뜸 */

    }
}
