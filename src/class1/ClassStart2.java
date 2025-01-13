package class1;

public class ClassStart2 {
    public static void main(String[] args) {

        //배열 사용해서 코드 최소화하기
        String[] studentsName = {"학생1","학생2","학생3"};
        int[] studentsAge = {15,16,18};
        int[] studentsScore ={90,80,70};


        for(int i =0; i < studentsName.length; i++){
            System.out.println("이름: "+studentsName[i]+"나이: "+studentsAge[i]+"성적: "+studentsScore[i]);
        }

    }


}
