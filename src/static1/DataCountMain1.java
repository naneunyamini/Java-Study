package static1;

public class DataCountMain1 {

    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A count=" +data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count=" +data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count=" +data3.count);

        //이렇게 코드를 짜면 각각의 인스턴스가 만들어지므로 123으로 카운터가 세지지않음

    }
}
