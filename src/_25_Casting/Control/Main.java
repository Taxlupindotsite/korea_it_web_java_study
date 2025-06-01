package _25_Casting.Control;

public class Main {
    public static void main(String[] args) {

/*
        멀티탭을 만들것임

            Power 인터페이스
            on(), off() - 오버라이드 해야함
            Tv, Computer, Speaker, LEDLight, Mouse, SmartPhone
            재정의하고 고유메소드 1개

 */

//        뭐 16~18의 방식도 가능함.
//        Power[] powers = {new Computer(), new Mouse(), new Tv()};
//        Power[] powers = new Power[5];
//        CentralControl centralControl = new CentralControl(powers);

        CentralControl centralControl = new CentralControl(new Power[5]);

    centralControl.addDevice(new Computer());
    centralControl.addDevice(new Tv());
    centralControl.addDevice(new Mouse());
    centralControl.addDevice(new Speaker());
    centralControl.addDevice(new LEDLight());
    centralControl.addDevice(new SmartPhone());

    centralControl.powerOn();
    centralControl.powerOff();

    centralControl.performSpecificMethod();

    }
}
