package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello(){
        System.out.println("child.hello");
    }

    public void call(){
        System.out.println("this value= "+ this.value);
        System.out.println("this value= "+ super.value);

        this.hello();
        super.hello(); //메소드의 이름이 같기 때문에 super을 사용해서 부모를 호출할 수 있음
    }
}
