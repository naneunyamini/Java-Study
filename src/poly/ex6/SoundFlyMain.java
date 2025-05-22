package poly.ex6;


public class SoundFlyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        flyAnimal(bird);
    }

    // AbstractAnimal 사용 가능
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    // fly 인터페이스가 있으면 사용 가능
    private static void flyAnimal(fly fly) {
        System.out.println("동물 소리 테스트 시작");
        fly.fly();
        System.out.println("동물 소리 테스트 종료");
    }
}

//인터페이스는 무제한으로 구현받을 수 있다 !!
