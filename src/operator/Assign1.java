package operator;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;
        a +=3; // 8 a = a + 3 a랑 3을 먼저 더하고 그 값을 a에 대입하라
        a -=2; // 6 a = a - 2
        a *=4; // 24
        a /=3; // 8
        a %=5; // 3
        // 최종적으로 출력값은 3이 나오게 됨
        System.out.println(a);
    }
}
