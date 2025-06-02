package _22_Inheritance;

public class Main {
    public static void main(String[] args) {

//      상속 - 기존 클래스(부모 클래스)의 속성과 기능(메소드)을 새로운 클래스(자식 클래스)가 물려 받는 것
//      왜 상속을 해야하나?

//      코드의 재사용성과 계층 구조 설계를 가능하게 해주는 핵심 개념임.
//      유지보수, 즉 공통 기능이 한 곳(부모클래스)에 있으므로 수정할 일이 생기면 부모 클래스 하나만 고치면 자식 클래스에도 반영이 됨(개방 폐쇄 원칙.)
//      개방폐쇄 원칙 : 확장에는 열려있고, 수정(변경)에는 닫혀있어야 한다는 개념

//      자식클래스는 부모의 코드를 그대로 사용
//      자식 클래스는 부모의 코드를 그대로 사용하거나, 필요한 기능을 더 추가하거나,
//      부모의 코드(메소드)를 변경 가능함 => 오버라이딩이라고 함.

//    Animal animal1 = new Animal();
//    animal1.setAnimalName("고양이");
//    animal1.setAnimalAge(3);
//    animal1.move();
//  animal1.setStriped();
//
//    Tiger tiger1 = new Tiger();
//
//    tiger1.setAnimalName("킹랑이");
//    System.out.println(tiger1.getAnimalName());
//
//    tiger1.setAnimalAge(3);
//    System.out.println(tiger1.getAnimalAge());
//
//    tiger1.move();
//    tiger1.hunt();
//    tiger1.setStriped(true);
//
//    Tiger tiger2 = new Tiger("백호", 3, false);

//  read, getanimalName, getAnimalAge, move

        Human human = new Human("구영현", 28);
        System.out.println(human.getAnimalName());
        System.out.println(human.getAnimalAge());
        human.move();
        human.read("인간 실격");

    }
}




