package poly.ex6;


// 함께 나온 경우에는 extends 먼저 써주기
public class Bird extends AbstractAnimal implements fly{
    @Override
    public void sound() {
        System.out.println("잭쨱");

    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
