package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        this(a,20); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a= "+a);
    }

    public ClassB(int a,int b){
        super();
        System.out.println("ClassB 생성자 a="+a+" b="+b);
    }

    //이때 super()는 자식 생성자 안에서 언제가 반드시는 꼭 한번 호출이 되어야한다
}
