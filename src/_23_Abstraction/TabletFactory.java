package _23_Abstraction;

/*
    1.Factory라는 추상클래스 상속받고
    1-2 : 생성자 만들어서 이름 바로 넣도록하고.
    2.재정의 다 해주고
    3.고유메소드로 upgrade(String model) => "아이패드 7세대로 업그레이드 되었습니다."
    4.메인에서 produce("아이패드 6세대"
    5.upgrade("아이패드 7세대")
 */

public class TabletFactory extends Factory {
    public TabletFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("[" + model + "] 태블릿을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println(getName() + "공장을 관리합니다.");
    }

    public static void upgrade(String model){
        System.out.println(model + "로 업그레이드 되었습니다.");

    }



}
