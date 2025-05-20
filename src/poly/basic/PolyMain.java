package poly.basic;

public class PolyMain {

    public static void main(String[] args) {

        //부모 변수가 부모 인스턴스를 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스터스를 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스를 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 부모 타입은 자식 타입을 담을 수 있음
        poly.parentMethod();
        //poly.childMethod()를 호출할 수 없음
        //Child child1 = new Parent() // 자식 타입은 부모 타입을 담을 수 없음

    }
}
