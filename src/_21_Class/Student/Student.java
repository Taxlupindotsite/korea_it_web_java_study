package _21_Class.Student;

public class Student {

    private String name;
    private int age;
    private String email;
    private String address;

//  private일때 값을 넣는 방법. (다른 클래스에서)
//  1.생성자
//  2.setter

//  1.생성자(Generator)
//  Alt + Insert를 누르면, Generate(생성)이 나옴
// 생성자(Constructor)를 누르고, 전부 체크하면 생성자를 자동으로 만들어줌.

    public Student(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

//  2.Setter ->값을 넣을수도 있고, 수정할수도 있음.
//    알트 인서트 -> Setter.

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//  이상 이렇게 나옴.

//  *getter.
//  private라서 접근을 못 할 때

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

//    여기선 왜 this 안쓰냐? 여기선 매개변수가 딱히 없어서 그럼
//    this를 써도 되긴 함

    public void showInfo(){
        System.out.println("이름은 " + name);
        System.out.println("나이는 " + age);
        System.out.println("이메일은 " + email);
        System.out.println("주소는 " + address);

    }

}
