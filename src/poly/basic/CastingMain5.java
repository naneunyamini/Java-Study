package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent){
        parent.parentMethod();
        if(parent instanceof Child){
            /* 이렇게 이해하자 !!*/
            // Child c = parent -> 자식은 부모를 담을 수 없음 false
            // child c = child -> 자신은 자신을 담음 ture
            System.out.println("child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();

            /* 자바 16부터는
            if(parent instanceof Child child){
            .... child.childMethod(); -> 이미 다운캐스팅을 하고 난 뒤라 호출 가능
             */

        }
    }
}
