package poly.ex4;

public class Dog extends AbstractAnimal {

    //ctrl + o 하면 자동 생성됨
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}

