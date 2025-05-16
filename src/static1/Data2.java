package static1;

public class Data2 {

    public String name;

    public Data2(String name, Counter counter){
        //참조에 두개의 값을 넣어줌
        this.name = name;
        counter.count ++;
    }
}
