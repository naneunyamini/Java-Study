package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단 자식의 기능을 호출할 수 없음 : poly.childMethod()

        //다운캐스팅(부모타입 -> 자식타입)
        Child child = (Child) poly; //타입을 바꿈 (강제로 타입을 바꿈)
        child.childMethod();

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod(); // 연산자 우선순위 때문에 반드시 괄호 !!

        //주의 : 캐스팅을 한다고 해서  Parent poly의 타입이 변하는 것은 아님
        //-> 해당 참조값을 꺼내고 꺼낸 참조값이 child 타입이 되는것 (x001)
    }
}
