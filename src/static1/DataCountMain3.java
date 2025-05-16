package static1;

public class DataCountMain3 {

    public static void main(String[] args) {

        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" +Data3.count);

        //이렇게 코드를 짜면 각각의 인스턴스가 만들어지므로 123으로 카운터가 세지지않음


        //추가
        //인스터스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); //권장하지 않음 -> count가 인스턴스 변수인가 ? 라는 오해를 일으킴

        //클래스를 통한 접근
        System.out.println(Data3.count); //스택틱 변수라고 바로 인지 가능

    }
}
