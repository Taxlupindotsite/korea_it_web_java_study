package _17_Method;

public class Parameter {

    public static void power(int number) {
        //거듭제곱을 하는 메소드
        //매개변수를 전달받아서 해당 매개변수를 거듭제곱 할 것임.
        int result = number * number;
        System.out.println(number + "의 ^2은 "+ result + "입니다.");
    }

    public static void powerByExp(int number, int exponent)
    //exponent는 지수 라는 뜻
    {int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "승은 " + result + "입니다. ");
    }

    public static void main(String[] args) {

        //Parameter
        //매개변수, 전달값, 인수라고도 함
        int num = 4;

        power(3);
        power(num);

        powerByExp(2,4);

    }
}
