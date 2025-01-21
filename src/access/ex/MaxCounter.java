package access.ex;

public class MaxCounter {

    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    } //생성자

    public void increment() {
        if (count >= max) {
            System.out.println("최대값을 넘습니다.");
        } else {
            count++;
        }
    }

    public int getCount(){
        return count;
    }
}
