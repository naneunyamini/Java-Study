package poly.car1;


public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //차량 변경 ( K3 -> Model3Car)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        //차량 변경
        // Car 인터페이스를 사용해서 새로운 차량을 자유롭게 추가할 수 있음
        // 차를 추가해도 driver의 코드(기존 코드)를 수정하지 않아도 된다 -> ocp 원칙
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
