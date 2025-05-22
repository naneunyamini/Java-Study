package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        /*
        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
         */

        soundDog(dog);
        soundCat(cat);
        }

        // 메서드를 이용해보자
        private static void soundDog(Dog dog){
            System.out.println("동물 소리 테스트 시작");
            dog.sound();
        }
        private static void soundCat(Cat cat){
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        }

        // 배열로 한번에 묶어볼까 ..? -> 3가지 모두 타입이 다르므로 불가능

}
