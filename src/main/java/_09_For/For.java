package _09_For;

public class For {
    public static void main(String[] args) {

        //반복문 - for
        // for ( 선언; 조건; 증감) {
        //      반복될 코드
        // }

        /*
        for(int i = 0; i < 10; i++){
            System.out.println("안녕" + i);
        }

        //참고로 fori라고 치면 자동완성 됨.
        for (int i = 0; i < 50; i++) {
            System.out.println(i);

        }
        */



        // Quiz) 1~10부터 출력, 짝수만 출력할 것

        //첫 번째 방법
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {  //2로 나눴을때 나머지가 0인경우에
                System.out.println(i); //출력하세요.
            }
        }

        //두 번째 방법
        for (int i = 2; i <= 10 ; i +=2) {
            System.out.println(i);
        }

        //10부터 1까지 거꾸로 출력
        for (int i = 10; i >0 ; i--) {
            System.out.println(i);

        }

        //문제 => 1~100까지, 다 더한 값을 출력하세요.

        /*
        int sum = 0;

        for (int i = 0; i <=100 ; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
*/
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            // sum = sum+i;
        sum += i; //복합대입연산자 복습 할 것
        }
        System.out.println(sum);

       }
    }

