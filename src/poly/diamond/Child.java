package poly.diamond;

public class Child implements InterfaceA,InterfaceB{
    @Override
    public void methodA() {
        System.out.println("child.MethodA");
    }

    @Override
    public void methodB() {
        System.out.println("child.MethodB");

    }


    //interface는 다중구현이 가능함 !
    @Override
    public void commonMethod() {
        System.out.println("child.CommonMethod");

    }
}
