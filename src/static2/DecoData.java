package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근

        //이때 instanceValue++와 instanceMethod()는 접근 불가능 -> 참조값을 알 수 없음
        // 붕어빵 틀 안에 있는 것만 접근 가능하고 인스턴스는 알 수 없음


    }

    public void instanceMethod(){
        System.out.println("instanceValue="+instanceValue);

    }

    public static void staticMethod(){
        System.out.println("staticValue="+staticValue);

    }

    //따라서
    public void instanceCall(){
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근 -> 실상 DecpData.staticValue임을 인지
        staticMethod(); //정적 메서드 접근

    }
    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
    }
}
