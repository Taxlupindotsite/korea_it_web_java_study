package _24_Interface;

public interface Press {

    /* 인터페이스는 기능(메소드)의 명세(규칙, 약속)만 정의하는 틀.
      모든 멤버변수는 public static final(상수)만 가능.
      객체 생성이 불가능. 생성자도 없음.
      기능 중심 설계를 하고싶을 때 사용함.
      여러 클래스에서 같은 행동(메소드)를 다르게 구현하고 싶을 때
    */
//     String NAME = "button"; //상수는 대문자로 만듬. 그리고 초기화(지정)을 해줘야함.

    void onPressed(); //abstract는 생략되어 있음

    //interface Up, Down 만들기
    //onUp, onDown 메소드 만들기


}
