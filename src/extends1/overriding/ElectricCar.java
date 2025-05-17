package extends1.overriding;

public class ElectricCar extends Car {
    @Override

    //override 없어도 상관은 없는데 쓰도록 해야함 -> 애노테이션 : 부모 기능을 ovrride을 한다라는 기능의 표시
    public void move(){
        System.out.println("차를 빠르게 이동합니다.");
    }
    public void charge(){
        System.out.println("충전합니다");
    }
}
