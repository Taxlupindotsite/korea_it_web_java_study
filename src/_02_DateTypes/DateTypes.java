package _02_DateTypes;

public class DateTypes {
    public static void main(String[] args) { //psvm
        //System.out.println("hello");
        //System.out.println(123);

        //변수
        //자료형 변수명 = 데이터;

        //정수 : int, long
        int num = 123;
        int num1;
        num1 = 234;
        num1 = 456;

        //System.out.println("num1은" + num1);

        long L = 1_000_000_000_000_000L;
        //long으로 데이터 지정할때는 끝에 L을 붙여줘야함

        //System.out.println("L은"+ L);

        //실수 - float, double
        float f = 3.14f;
        //float로 지정시에는 f를 붙여야함
        double d = 3.1234567891234565789;

        //System.out.println(d);

        // 문자 - char
        char a =  'a';
        char b =  'b';
        System.out.println(""+ a + b );

        //! 아스키코드

        //문자열 - String
        String str =  "안녕하세요";
        System.out.println(str);

        //논리 자료형 - boolean
        boolean isEmpty;
        isEmpty = true;
        isEmpty = false;

        System.out.println(isEmpty);

        /*

        예제1)

        제 이름은 ***입니다. 제 나이는 **살이고
        취미는 ***입니다.

         */

        String Name =  " 구영현 ";
        int age = 96;
        String Hobby = " 독서 ";

        System.out.println("제 이름은 " + Name + "입니다." );
        System.out.println("제 나이는 " + age + "살 이고");
        System.out.println("취미는" +  Hobby + "입니다.");

    }
}
