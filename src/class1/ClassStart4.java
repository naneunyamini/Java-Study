package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2]; //2개의 배열
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름: " + students[0].name+student1.age+ student1.grade);
        System.out.println("이름: " + students[1].name+student2.age+ student2.grade);


    }
}
