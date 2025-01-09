package method;

public class Method2 {

    //매개변수도 없고 반환 타입도 존재하지 않음
    public static void main(String[] args) {
        printHeader();
        printFooter();
    }

    public static void printHeader(){
        System.out.println("프로그램을 시작합니다");
        return;
    }
    public static void printFooter(){
        System.out.println("프로그램을 시작합니다");
        return;
    }

    /* 모든 메서드는 항상 return이 들어갸야히지만
    void의 경우에는 retrun이 생략 가능해짐
     */
}
