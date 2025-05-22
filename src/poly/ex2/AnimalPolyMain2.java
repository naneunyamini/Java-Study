package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();


        // 배열에 넣기
        Animal[] animalArr = {dog, cat, caw};

        //한번에 합치기
        //Animal[] animalArr = {new Dog(), new Cat(), new Caw()};

        // 변하지 않는 부분
        /*for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");

         */

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }
    // 돔울이 추가되도 변하지 않는 코드
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
