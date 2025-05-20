package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스를 참조
        Child child = new Child();
        System.out.println("Child -> child");
        System.out.println("value ="+ child.value);
        child.method();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> parent");
        System.out.println("value ="+parent.value);
        parent.method();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value ="+poly.value); // 실행 값 : value=parent : 변수는 오버라이딩 X
        poly.method(); // 실행 값 : child.method : 메서드 오버라이딩
        /*  따라서 오버라이딩된 메서드는 항상 우선권을 가진다!
        오버라이딩 : 부모 타입에서 정의한 기능을 자식 타입에서 재정의하는 것
         */
    }
}
