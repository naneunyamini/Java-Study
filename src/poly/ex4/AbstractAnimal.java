package poly.ex4;

// AbstracatAnimal 클래스는 직접 인스턴스를 생성할 수 없음
public abstract class AbstractAnimal {

    // 이 메서드는 자식이 반드시 오버라이딩해야함
    public abstract void sound();


    //abstract이 추가되면 바디(body)는 지워야함 !
    public abstract void move();
}

