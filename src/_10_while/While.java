package _10_while;

public class While {
    public static void main(String[] args) {


        int num = 1;
        //반복문 - while
        //조건이 true일 경우 계속 반복함.
        //형태 : while (조건) {
        //              반복할 코드
        //                      }

        // for문 - 횟수 중심.
        // while문 - 조건 중심.

        //1~5까지 출력해보기.

        /*
        int num1 = 1;
        while (num1 <=5) {

            System.out.println(num1);
            num1++; //조건을 변화시키기 위한 증가(필수)
        }


        //10에서 거꾸로 1까지.
        int num2 = 10;
        while(num2 >=1){

            System.out.println(num2);
            num2--;
        }


*/

        //짝수만 출력(1~10까지)

        /*

        int num3 = 1;
        while(num3 <=10) {
            if(num3 %2 == 0) {
                System.out.println(num3);
            }
            num3++;
        }



         */

        // Quiz) 1~100까지 누적합

        /*  int sum = 0;
        while(sum <= 100){

            sum = 1 + sum;
            sum++;
            System.out.println(sum);
*/
        int sum = 0;
        num = 1;
        while(num <=100) {
            sum += num;
            num++;
        }
            System.out.println("합계는" + sum);






       }
    }

