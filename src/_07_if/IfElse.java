package _07_if;

public class IfElse {
    public static void main(String[] args) {

        //else는 조건이 거짓이면 실행되는 코드블럭임

        //키가 120이상이어야 탑승가능
        int height = 120;
        if(height>=120){
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }

    }
}
