package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3car = new K3Car();
        driver.setK3car(k3car);
        driver.drive();

        //추가
        Model3Car model3car = new Model3Car(); // 인스턴스 생성
        driver.setK3car(null);
        driver.setModel3car(model3car);
        driver.drive();
    }
}
