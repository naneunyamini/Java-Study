package cond;

public class CondOp1 {
    public static void main(String[] args) {

        /* 참과 거짓에 따라 status 변수의 값이 달라짐
           단순히 참과 거짓에 따라 특정 값을 구하는 경우를
           삼항연산자 또는 조건 연산자라고 불리는 ?: 연산자를 사용함
         */
        int age = 18;
        String status; // String 은 반드시 대문자임

        if ( age >= 18 ){
            status = "성인";
        }else{
            status = "미성년자";
        }
        System.out.println("age = "+ age + " status = " + status);
    }
}
