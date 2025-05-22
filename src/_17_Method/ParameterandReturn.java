package _17_Method;

public class ParameterandReturn {

    public static int getStrLength(String str){
        int result = str.length();
        return result;
    }

    //    public static void power(int number) {
//        //거듭제곱을 하는 메소드
//        //매개변수를 전달받아서 해당 매개변수를 거듭제곱 할 것임.
//        int result = number * number;
//        System.out.println(number + "의 ^2은 "+ result + "입니다.");
//    }

//    public static void powerByExp(int number, int exponent)
//    //exponent는 지수 라는 뜻
//    { int result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= number;
//        }
//        System.out.println(number + "의 " + exponent + "승은 " + result + "입니다. ");
//    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static int getPower(int number) {
//        int result = number * number;
//        return result;
        return number * number;
        }



    public static void main(String[] args) {
     int power = getPower(3);
        System.out.println(power);

        System.out.println(getStrLength("안녕하세요 반갑습니다."));

    }
}


//Quiz)문자열을 매개변수로 전달하고 해당 문자열의 길이를 반환받아서 출력하는 메소드를 출력하세요
//System.out.println(getStrLength("안녕하세요 반갑습니다."));