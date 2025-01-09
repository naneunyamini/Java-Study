package method;

public class MethodValue2 {

    public static void main(String[] args) {

        //main에 정의한 변수와 메서드의 매개변수의 이름이 둘다 number로 같을 경우
        int number =5;
        System.out.println("1. changeNumber 호출 전 num1 " + number); //5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후 num1 " + number); //5
    }

    public static void changeNumber(int number){
        System.out.println("2. changeNumber 변경 전,num2: "+number); //5
        number = number*2;
        System.out.println("3. changeNumber 변경 후,num2: "+number); //10

        //자바는 항상 값을 복사해서 전달하기 때문에 num2의 값을 바꾸더라도 num1에는 영향을 주지 않는다
    }
    //각각의 메서드 안에서 사용되는 변수는 서로 완전히 다른 변수이다 !!
    //매개변수도 사실은 지역변수임을 인지할 것
    //main도 메서드임
}
