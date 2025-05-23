package poly.car1;

// 새로운 차량 추가하기
// OCP : 기존의 코드 수정 없이 새로운 기능을 추가할 수 있다는 의미
public class NewCar implements Car {
    @Override
    public void startEngine() {
        System.out.println("start");

    }

    @Override
    public void offEngine() {
        System.out.println("off");

    }

    @Override
    public void pressAccelerator() {
        System.out.println("press");

    }
}
