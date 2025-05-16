package static1;

public class DataCountMain2 {

    public static void main(String[] args) {

        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count=" + counter.count);

        Data2 data2 = new Data2("B",counter);
        System.out.println("B count=" +counter.count);

        Data2 data3 = new Data2("C",counter);
        System.out.println("C count=" +counter.count);

        //이렇게 코드를 짜면 각각의 인스턴스가 만들어지므로 123으로 카운터가 세지지않음

    }
}
