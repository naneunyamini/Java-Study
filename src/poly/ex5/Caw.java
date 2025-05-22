package poly.ex5;

// 인터페이스는 extends를 사용하지 않고 implements를 사용함
public class Caw implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("음매");

    }

    @Override
    public void move() {
        System.out.println("소 이동");

    }
}
