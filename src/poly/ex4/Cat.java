package poly.ex4;

public class Cat extends AbstractAnimal {

    //ctrl + o 하면 자동 생성됨
    @Override
    public void sound() {
        System.out.println("냐옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
