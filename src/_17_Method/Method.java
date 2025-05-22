package _17_Method;

public class Method {

    public static void sayHello() {
        //sayHello라는 이름을 가진 메소드.
        //안녕을 출력
        System.out.println("안녕");
    }

    //메소드는 호출을 해야만 실행이 됨.

    public static void main(String[] args) {
        //메소드
        //기능을 담당하는 부분. 코드의 재사용성과 유지보수에 좋음

        //메소드를 정의할때는, main 밖에다가 하는거임
        //메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");

        String name = "구영현";
        System.out.println("name");

    }
}
