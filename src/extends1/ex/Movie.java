package extends1.ex;

public class Movie extends Item{

    private String director;
    private String actor;


    //생성자
    public Movie(String name,int price,String director,String actor){
        super(name,price);
        this.director = director;
        this.actor = actor;
    }
}
