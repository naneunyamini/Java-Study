package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); => 컴파일 오류 발생

        // 참조 대상의 값은 변경 가능함
        data.value =10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
        //변수 안에 참조 값만 바꾸지 못함
    }

}
