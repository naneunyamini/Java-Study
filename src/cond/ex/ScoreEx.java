package cond.ex;

public class ScoreEx {

    public static void main(String[] args) {
        int score = 55;

        String grade;

        if(score >= 90){
            grade = "A";
        }else if(score >= 80){
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        }else{
            grade = "F";
        }
        System.out.println("score: " + score);
        System.out.println("출력: 학점은 " + grade +"입니다");
    }
}

// 아예 if문 안에 sout을 "출력학점은 A 입니다" 라고 바로 쓰는 것도 간단함