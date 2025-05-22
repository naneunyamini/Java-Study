package poly.ex5;

import poly.ex2.Animal;
import poly.ex4.AbstractAnimal;

public class InterfaceMain {

    public static void main(String[] args) {

        //인터페이스 생성 불가
        // InterfaceAnimal interfaceAnimal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        dog.move();
        dog.sound();

        soundAnimal(dog);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
