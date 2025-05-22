package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {

        // 자기자신 : child 라는 인스턴스
        Child child = new Child();

        child.methodA();
        child.methodB();
        child.commonMethod();

        // 부모는 자식을 담을 수 있음 : a 라는 인스턴스
        InterfaceA a = new Child();
        a.methodA();
        a.commonMethod();

        InterfaceB b = new Child();
        b.methodB();
        b.commonMethod();
    }
}
