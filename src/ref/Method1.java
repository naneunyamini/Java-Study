package ref;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1,"학생1",15,90);
        printStudent(student1);

        Student student2 = new Student();
        initStudent(student2,"학생2",16,80);
        printStudent(student2);

    }

    public static void initStudent(Student student,String name,int age,int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    public static void printStudent(Student students) {
        System.out.println("이름: "+ students.name+" 나이: "+ students.age +" 성적: "+ students.grade);
    }
}
