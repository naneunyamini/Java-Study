package ref;

public class NullMain3 {

    public static void main(String[] args) {

        BigData bigData = new BigData();
        System.out.println(bigData);
        System.out.println(bigData.data);
        System.out.println(bigData.count);

        //nullpointer예외발생
        System.out.println(bigData.data.value);
    }
}
