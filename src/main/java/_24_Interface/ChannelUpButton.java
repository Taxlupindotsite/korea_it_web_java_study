package _24_Interface;

public class ChannelUpButton extends Button {

//   OnPressed만 하면 채널은 1칸만 올리고
//   OnUp을 하면 채널을 계속 올릴것임

    @Override
    public void onUp() {
        System.out.println("채널을 계속 올립니다");
    }

    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 올립니다");
    }
}
