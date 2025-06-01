package _25_Casting.Control;

public class Tv implements Power{

    @Override
    public void off() {
        System.out.println("Tv의 전원을 끕니다.");
    }

    @Override
    public void on() {
        System.out.println("TV의 전원을 켭니다.");
    }


    public void changeChannel() {
        System.out.println("Tv의 채널을 돌립니다.");


    }


}
