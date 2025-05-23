package poly.car0;

public class Driver {

    private K3Car k3car;
    // Model3Car 추가하기
    private Model3Car model3car;


    public void setK3car(K3Car k3car) {
        this.k3car = k3car;
    }

    // Model3Car 추가하기 -> set이란느 명령어로 자동 생성 가능
    public void setModel3car(Model3Car model3car) {
        this.model3car = model3car;
    }
    public void drive() {
        System.out.println("자동차를 운전합니다");
        if(k3car != null){
            k3car.startEngine();
            k3car.offEngjne();
            k3car.pressAccelecator();
        } else if(model3car != null){
            model3car.startEngine();
            model3car.offEngjne();
            model3car.pressAccelecator();
        }
    }
}
