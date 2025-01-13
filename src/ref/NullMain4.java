package ref;

public class NullMain4 {

    public static void main(String[] args) {

        BigData bigData = new BigData();
        bigData.data = new Data(); //참조값 생성해주기
        System.out.println(bigData);
        System.out.println(bigData.data);
        System.out.println(bigData.count);

        //nullpointer예외발생
        System.out.println(bigData.data.value);
    }
}
