package poly.basic;

public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; //런타임 오류 -class 예외 : child 인스턴스 없음
        child2.childMethod(); //실행 불가


        //런타임 오류 : 프로그램이 실행되는 도중에 발생하는 오류임 -> 고객이 해당 프로그램을 실행하다가 발생하는 오류임
    }
}
