package poly.ex6;

public abstract class AbstractAnimal {
    public abstract void sound(); // 추상 클래스

    public void move(){ // 상속
        System.out.println("동물이 이동한다");
    }

}
