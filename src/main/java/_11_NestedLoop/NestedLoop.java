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
/*
        for (int i = 0; i < 5; i++) { //세로줄(수)
            for (int j = 0; j < 5; j++) { //가로로 별 찍기
                System.out.print("*"); //ln이 아님!
            }
            System.out.println(); //줄 바꿈
        }
*/
        //별 삼각형 찍기
//        *
//        **
//        ***
//        ****
//        *****

        /*
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*"); //ln이 아님!
            }
            System.out.println();
        }

         */

//        *****
//        ****
//        ***
//        **
//        *



        //직접 한 코드

        /*
        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        */

        /*      강사님 코드
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/


        /*

        SSSS*           i = 0 , j(80line) 4번 -> j < 4
        SSS**           i = 1 , j 3번 -> j < 3
        SS***           i = 2
        S****
        *****

         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("S");
            }

            for (int j = 0; j < i+1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }






    }
}
