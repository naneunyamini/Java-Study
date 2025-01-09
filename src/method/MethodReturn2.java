package method;

public class MethodReturn2 {
    public static void main(String[] args) {

        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age){
        if(age<18){
            System.out.println(age+"살, 미성년자는 출입이 불가능합니다.");
            return;
            //return을 만나면 바로 메서드를 빠져나감 -> 10살이면 다음 sout은 출력되지 않음
        }
        System.out.println(age+"살, 입장하세요");
    }
}
