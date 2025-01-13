package ref;

public class Method2 {

    public static void main(String[] args) {

        Student student1 = createStudent("학생1",15,90);
        printStudent(student1);


        Student student2 = createStudent("학생2",16,80);
        printStudent(student2);

    }

    public static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
    public static void printStudent(Student students) {
        System.out.println("이름: "+ students.name+" 나이: "+ students.age +" 성적: "+ students.grade);
    }
}
