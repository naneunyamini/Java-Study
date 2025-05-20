package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단 자식의 기능을 호출할 수 없음 : poly.childMethod()

        //다운캐스팅(부모타입 -> 자식타입)
        Child child = (Child) poly; //타입을 바꿈 (강제로 타입을 바꿈)
        child.childMethod();
    }
}
