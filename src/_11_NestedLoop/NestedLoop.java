package _11_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {

        //  이중 반복문(반복문 심화)

        // 네모 별 찍기
        // *****
        // *****
        // *****
        // *****
        // *****

        for (int i = 0; i < 5; i++) { //세로줄(수)
            for (int j = 0; j < 5; j++) { //가로로 별 찍기
                System.out.print("*");
            }
            System.out.println(); //줄 바꿈
        }

        //별 삼각형 찍기
//        *
//        **
//        ***
//        ****
//        *****

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*"); //ln이 아님!
            }
            System.out.println();
        }
    }
}
