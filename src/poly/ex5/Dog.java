package poly.ex5;

// 인터페이스는 extends를 사용하지 않고 implements를 사용함
public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("멍멍");

    }

    @Override
    public void move() {
        System.out.println("개 이동");

    }
}
