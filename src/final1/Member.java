package final1;

public class Member {

    private final String id; // final 키워드 사용
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name){
        this.name = name;
        //이때 this.id = id 이거는 final 상수라서 컴파일 오류 발생함
    }
    public void print(){
        System.out.println("id:"+id+",name:"+name);
    }
}
