package poly.car1;

public class Driver {

    private Car car; //멤버 변수

    public void setCar(Car car){
        System.out.println("자동차 설정: "+ car);
        this.car = car;
    }

    public void drive(){
        System.out.println("자동차 운전");
        car.startEngine();
        car.offEngine();
        car.pressAccelerator();
    }
}
