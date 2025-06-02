package _21_Class.Dog;

public class DogMain {
    public static void main(String[] args) {
//        객체 생성하는 방법
        Dog dog = new Dog();

//        생성된 해당 객체의 속성 값 대입 또는 변경
        dog.name = "상식이"; //대입
        dog.age = 7;

        dog.name = "개상식이"; //변경(수정)

        System.out.println(dog.name);
        System.out.println(dog.age);

        //생성된 객체 메소드 호출
        dog.bark(); //ctr + 마우스 컨트롤 하면 바로 기능코드로 연결됨
        dog.sleep();

//      Quiz)
//        student라는 패키지 만들고, 안에 Student와 StudentMain 만들기
//        이름, 나이, 이메일, 주소 변수 만들고
//        메소드 ShowInfi() => 정보 출력
//        StudentMain에서 객체 생성 후 본인 정보 대입(주소 대충)
//        StudentInfo()호출해서 정보 출력

    }
}
