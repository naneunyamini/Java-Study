package poly.car1;

public class K3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("k3 start");

    }

    @Override
    public void offEngine() {
        System.out.println("k3 off");

    }

    @Override
    public void pressAccelerator() {
    System.out.println("k3 press accelerator");
    }
}
