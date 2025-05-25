package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "구영현";
        student.age = 28;
        student.email = "kookoo4186@gmail.com";
        student.address = "부산";

        student.showInfo();

    }
}
