package construct.ex;

public class Book {

    String title;
    String author;
    int page;

    //코드완성

    Book(){
        this("","",0); // 이거 없으면 null로 출력됨(파라미터론 넘어온 값이 아니라서 직접 값을 넣어도 됨)
    } //이미 생성자가 존재하기 때문에 기본 생성자도 만들어줘야함
    Book(String title,String author){
        this(title,author,0);
    }
    Book(String title,String author,int page){
        this.title=title;
        this.author=author;
        this.page=page;
    }

    void displayInfo(){
        System.out.println("제목: "+title+"저자: "+author+"페이지: "+page);
    }
}
