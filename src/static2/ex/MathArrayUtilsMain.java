package static2.ex;

public class MathArrayUtilsMain {

    public static void main(String[] args) {

        //이때 MathArrayUtils의 인스턴스를 생성하지 못하도록 막아야 함 -> 생성자를 Private으로 막기
        int[] values = {1,2,3,4,5};
        System.out.println("sum="+MathArrayUtils.sum(values));
        System.out.println("average="+MathArrayUtils.average(values));
        System.out.println("min="+MathArrayUtils.min(values));
        System.out.println("max="+MathArrayUtils.max(values));

    }
}
