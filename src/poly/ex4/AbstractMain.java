package poly.ex4;


public class AbstractMain {

    public static void main(String[] args) {

        // 추상클래스는 인스턴스 생성 불가
        // AbstractAnimal animal = new AbstractAnimal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        dog.sound();
        dog.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);

    }

    // 여기서 dog,cat,caw는 모두 AbstractAnimal의 자식들임 ! ( 오버라이딩을 구현했기 때문)
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
