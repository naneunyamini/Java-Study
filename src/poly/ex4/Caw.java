package poly.ex4;

public class Caw extends AbstractAnimal {

    //ctrl + o 하면 자동 생성됨
    @Override
    public void sound() {
        System.out.println("음매");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
