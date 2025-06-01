package _25_Casting.Control;

public class Mouse implements Power{

    @Override
    public void off() {
        System.out.println("마우스의 전원을 끕니다.");

    }

    @Override
    public void on() {
        System.out.println("마우스의 전원을 켭니다.");
    }

    public void leftClick(){
        System.out.println("마우스의 왼쪽 버튼을 클릭합니다.");
    }


}
