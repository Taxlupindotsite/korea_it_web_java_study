package _17_Method;

public class Parameter {


    public static void getAvg(int number1, int number2, int number3) {

        int result = (number1 + number2 + number3) /3;
        System.out.println("세 정수의 평균값은 " + result + " 입니다.");

    }

    public static void isEven(int a){
        System.out.println((a % 2 == 0 ? "짝수임" : "홀수임"));
        //삼항연산자, Operator 참고
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


        powerByExp(2,4);

        //
        // Quiz1)
        // 3개의 정수를 전달해서, 평균을 출력하는 메소드를 만드세요.
        // getAvg(80, 90, 100);

        // Quiz2)
        // 정수를 전달하여 짝수인지 홀수인지 판별하는 메소드
        // 단, 삼항연산자를 쓸 것
        // isEven(2)

        getAvg(80,90,100);

        isEven(3);

    }
}
