package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting

        // 정수에서 실수로

        int scoreInt = 98;
        System.out.println(scoreInt);

        //형태를 변환하려면, 괄호를 하나 더 열고 변환한 형태를 적어줌.
        //ex) int->float하려면

        System.out.println((float) scoreInt);
        System.out.println((double) scoreInt);
        System.out.println(scoreInt);

        //17 : 저장되지 않음. 한 번만.

        // 실수에서 정수로
        float scoreFloat = 97.5F;
        System.out.println(scoreFloat);
        System.out.println((int) scoreFloat);

        double scoreDouble = 88.5;
        System.out.println((int) scoreDouble);

        double sum1 = 98 + 77.3;
        System.out.println(sum1);

        //이 경우 29는 사실상 double sum = (double) 98 + 77.3;의 형태임.
        //즉 98(정수)앞에 double 형변환이 생략되있음

        int sum2 = 98 + (int) 55.3F;
        System.out.println(sum2);

        // 55.3F앞에 int 형변환을 안해주면 오류 뜸

        //* 중요
        /*
        형변환이 자동으로 되는경우, 수동으로 되는 경우
         */

        int convertedScoreInt = (int) scoreDouble;
        System.out.println(convertedScoreInt);
        // double -> float ->long->int(수동 형변환)
        // 뒤로 갈수록 더 자세한 범위를 표현함.

        // *넓은범위에서 좁은 범위로 표현시 굳이 형변환 안해도 됨

        double convertedScoreDouble = scoreInt;
        System.out.println(convertedScoreDouble);
        //ex)굳이 안해줘도 됨.
        // int -> long -> float -> double(자동 형변환)

        long scoreLong = 45L;
        convertedScoreInt = (int) scoreLong;
        System.out.println(scoreLong);
        //당연히 int보다 Long이 넓은범위니 형변환 해줘야함.


        //*숫자에서 문자열로.

        //1.int에서 문자열로
        String strNum1 = String.valueOf(55);
        // 첫 번째 방법임
        // va만 치면 자동완성 뜸

        strNum1 = Integer.toString(55);
        //두번째 방법

        System.out.println(strNum1);

        //실수에서 문자열로
        String strNum2 = String.valueOf(88.37);
        strNum2 = Double.toString(88.37);
        System.out.println(strNum2);

        //float에서 문자열로.
        String strNum3 = String.valueOf(123.45F);
        strNum3 = Float.toString(123.45F);
        System.out.println(strNum3);


        //문자열을 숫자로 "123" -> 123
        int i = Integer.parseInt("123");
        System.out.println(i);

        //integer.parseInt

        double d = Double.parseDouble("123.45");
        System.out.println(d);

        i = Integer.parseInt("숫자");
        System.out.println(i);




















    }
}
