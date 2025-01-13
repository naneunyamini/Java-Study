package ref;

public class VarChange2 {

    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;


        //참조값을 복사함
        Data dataB = dataA;

        //참조값
        System.out.println("dataA = " + dataA);
        System.out.println("dataB = " + dataB);


        //value값
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataA.value =20;
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataB.value =30;
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

    }
}
