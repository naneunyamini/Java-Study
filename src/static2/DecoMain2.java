package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); //인스턴스 생성 없이 바로 스태틱 호출 가능
        //붕어빵 틀인 DecoUtil2에 바로 접근 가능

        System.out.println("before: "+s);
        System.out.println("after: "+deco);

    }
}
