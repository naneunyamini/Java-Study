package static2.ex;

public class Car {

    private static int totalCars; // 공용으로 사용한느 static함수
    private String name; // 각각 인스턴스를 달리 사용해야 하는 변수

    public Car(String name){
        System.out.println("차량 구입:"+name);
        this.name=name;
        totalCars++;
    }
    public static void showTotalCars(){
        System.out.println("차량 수:"+totalCars);

    }
}
