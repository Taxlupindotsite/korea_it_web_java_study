package _24_Interface;

public class PowerButton extends Button{

    private boolean status = false;

    @Override
    public void onPressed() {
        if(status){
            status = false;
            System.out.println("전원을 종료합니다.");
        } else {
            status = true;
            System.out.println("전원을 켭니다.");
        }
//                *상황정리
//        press, up, down 3개를 만들었음.
//        botton 클래스 만들어놓고, up, down, press를 다중상속했음.
//        powerButton이란 것을 만들어서, 기능을 세분화시킴.
//        button에서 상속을 받음. powerButton 기능들중에
//        onPressed를 쓸건데, 오버라이드를 하려고 하는데..
//        abstract를 붙이려고 함. 근데 추상메소드를 쓰려면
//        추상클래스 안에서만 있어야 하므로, abstract를 붙여줌.




    }
}
