package _25_Casting.Control;

public class LEDLight implements Power{

    @Override
    public void off() {
        System.out.println("LED의 전원을 끕니다.");
    }

    @Override
    public void on() {
        System.out.println("LED의 전원을 켭니다.");
    }


    public void changeColor(){
        System.out.println("LED전구의 색상을 바꿉니다.");

    }

}
