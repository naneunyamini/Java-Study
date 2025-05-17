package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue =1; // 나한테 먼저 찾고 없으면 부모에서 찾기
        protectedValue =1; // 상속 관계 or 같은 패키지
        // 자식에서 값을 1로 설정하게 되면 부모에서도 값이 1임

        //defaultValue =1; // 다른 패키지 접근 불가
        //privateValue =1; // 전근 불가, 컴파일 오류

        publicMethod();
        protectedMethod();
        //defaultMethod();
        //privateMethod();

        printParent();

    }


}
