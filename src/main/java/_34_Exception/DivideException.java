package _34_Exception;

/*
1. 사용자로부터 두 개의 정수를 입력받습니다.
2. 첫 번째 수를 두 번째 수로 나눈 결과를 출력합니다.
3. 두 번쨰 수가 0이면 예외가 발생하므로, "0으로 나눌 수 없습니다."라고 출력합니다.
4. 마지막엔 프로그램 정상 종료
 */


import java.util.Scanner;

public class DivideException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 수 : " );
        int a = scanner.nextInt();
        System.out.print("두 번째 수 : ");
        int b = scanner.nextInt();

        try {
            int result = a/b;
            System.out.println("결과 : " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("프로그램 정상 종료");
        }


    }

}
