package _18_Overloading;

public class OverLoading {

    public static String printinfo() {
        System.out.println();

    }

//    public static int getPower(int number) {
//        return number * number;
//    }
//
//    public static int getPower(double doubleNum){
//        int number = (int) doubleNum;
//        return number * number;
//    }
//
//    public static int getPower(String strNum){
//        int number = Integer.parseInt(strNum);
//        return number * number;
//    }
//
//    public static int getPower(int number, int exponent) {
//        int result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= number;
//        }
//        return result;
//    }

    public static void main(String[] args) {

        //메소드 오버로딩.
        //같은 이름의 메소드를 여러 개 선언하는 것
        //단, 매개변수(파라미터)의 자료형 타입 또는 개수가 달라야함.
        //
//        System.out.println(getPower(3));
//        System.out.println(getPower(2.3));
//        System.out.println(getPower("4"));
//        System.out.println(getPower(2,4));

        //문제
        //메소드 이름 printInfo()
        //문자열 이름만 전달 => 이름을 출력
        //문자열 이름, 정수 나이 전달 =>이름 나이 출력
        //문자열 이름, 정수 나이, 문자열 이메일 =>이름 나이 이메일 출력.

    }
}
