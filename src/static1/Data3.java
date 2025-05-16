package static1;

public class Data3 {

    public String name;
    public static int count; // 공용으로 함께 사용할 수 있또록 static함수 활용하기

    public Data3(String name){
        this.name= name;
        count++; // Data3.count인데 class이므로 Data3는 생략가능함

        //붕어빵 변수는 하나이므로 클래스 변수도 하나만 존재한다,
        //반면에 인스턴스의 붕어빵은 인스턴스의 수 만큼 존재한다.
    }
}
