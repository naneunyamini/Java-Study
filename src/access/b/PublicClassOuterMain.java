package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();


        //다른 패키지는 접근 불가함
//        DefaultClass class1 = new DefalutClass1();
//        DefaultClass class2 = new DefalutClass2();
    }
}
