package _24_Interface;

//extends(상속)은 단일 상속임. (클래스, 추상클래스)
//implements는 다중상속이 가능 (인터페이스)

public abstract class Button implements Press, Up, Down {
//빨간색이 뜰텐데, 오버라이드를 해주면 없어짐

    @Override
    public void onDown() {

    }

    @Override
    public abstract void onPressed(); //무조건 재정의 해준다.

//    onPressed를 powerButton에서 재정의를 하고싶음.
//    추상메소드가 하나라도 있으려면, 그 클래스는 추상클래스가 되어야함
//    따라서 line6에 abstract로 만들어주고
//    결국 onPressed는 abstract가 되어야함.

    @Override
    public void onUp() {

//        ChannelDownButton
//        VolumeUpBottn
//        VolumeDownButton

    }
}
