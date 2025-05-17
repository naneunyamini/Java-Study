package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        //super(); //classB에서 이미 기본생성자를 직접 생성했기에 불가함
        super(10,20); // 직접 생성자를 생성해야함
        System.out.println("ClassC");
    }
}
