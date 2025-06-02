package _05_Operator;

public class Operator {
    public static void main(String[] args) {
            //연산자

        // * 대입 연산자. (=)
        int num1 = 10;
        int num2 = 5;
        // 여기서 =은 해당 변수에 데이터(값)을 대입한다는 의미
        // 수학적인 '같다' 라는 의미가 아님

        // *산술 연산자.
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2); //몫을 가져오는 나누기

        //System.out.println(num1 % num2); //나머지를 가져오는 나누기


        //복합 대입 연산자.
        num1 += 5; // +=은 num1 = num1 + 5 라는 뜻. => 15
        System.out.println(num1);

        num1 -= 5; // -=은 num1 = num1 - 5라는 의미 => 10
        System.out.println(num1);

        num1 *= 2; // *=은 num1 = num2 * 2라는 뜻 =>20
        System.out.println(num1);

        num1 /= 2; // num1 = num1 / 2 =>10
        System.out.println(num1);

        //나누기는 /와 %이 있음.
        // 슬래시는 값을 출력할때 '몫'만 가져옴.
        // %은 '나머지'를 출력함.

        num1 %= 2; // num1 = num1 % 2 => 0
        System.out.println(num1);

        // * 증감 연산자
        int j = 10;

        System.out.println(j); // 10

        //실행이 된 후에 1 증가.
        System.out.println(j++); // 10 => 10 + 1
        System.out.println(j); // 11

        //++ : 코드를 한 번 실행하고 나서 1이 증가.


        //실행이 된 후에 1 감소.
        System.out.println(j--); //10
        System.out.println(j); //9

        //실행이 된 전에 1 증가.
        System.out.println(++j); //11
        //해당 줄이 실행되기 이전에, 먼저 +1을 함

        //실행이 되기 전에 1 감소.
        System.out.println(--j); //10


        // *비교 연산자 =>결과가 항상 boolean 참/거짓 둘 중 하나로 나옴

        num1 = 5;
        num2 = 3;
        System.out.println(num1 > num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);

        System.out.println(num1 == num2); //같냐?
        // ==은 '같다'라는 뜻임.
        // =은 대입하는 것이고

        System.out.println(num1 != num2); //같지 않느냐?
        // !은 부정의 뜻. 반대의 결과를 출력하라는 뜻

        // *논리 연산자 (&(and), |(or), !(부정) )
        boolean flag1 = true;
        boolean flag2 = false;

   /*            * boolean으로 변수명을 지을때(국룰)
                * is, flag
                *
                * boolean Empty 이렇게가 아니라
        * boolean isEmpty 이런식으로 지음

  * */

        System.out.println(flag1 & flag2); // & and 논리곱 => 하나라도 false가 있으면, false이다.
        //즉 모두 true여야 true를 출력한다.



        System.out.println(flag1 | flag2); // 논리합 => 하나라도 true가 있으면 true.
        System.out.println(flag2 | flag2);

        //|은 백스페이스 옆에 쉬프트+백슬래쉬 누르면 출력됨

        System.out.println(!flag1);
        //flag1은 true인데 앞에 !을 붙이면(부정) false가 나옴.


        // *논리 연산자 조합 (&&, ||)
        // && => 선 조건이 true일 때만 후 조건을 실행한다, 선 조건이 false이면 후 조건을 실행하지 않는다.
        // || => 선 조건이 true이면 후 조건을 실행하지 않는다, 선 조건이 false일 때만 후 조건을 실행한다.

        System.out.println(flag1 && flag2);
        //flag1 (선 조건)이 true이나, 후조건이 false이므로, false 출력함.

        System.out.println(flag1 || flag2);
        //선 조건flag1이 true이므로 후 조건을 실행하지 않는다(고려x) 그래서 그냥 true가 나옴.


        // *삼항 연산자 , 조건문과 비슷함
        int x = 5;
        int y = 3;

        //더 큰 놈을 출력해보자

        int max = ( x > y ) ? x : y;
        //(x가 y보다 크냐) (? 말그대로 묻는것.) 그러면, 크면(true) x가 max에 대입됨.
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);

        x = 3;
        boolean isSame = (x == y) ? true : false;
        //같으면 true, 틀리면 false

        System.out.println(isSame);

        String sameStr = (x != y) ? "다름" : "같음";
        System.out.println(sameStr);


        /*

        *int height = 숫자;
        * 키가가 120인 경우 탑승가능하도록 하는 삼항연산자를 작성해볼것임
        가능하면 "탑승 가능" 출력, 불가능하면 "탑승 불가능"을 출력할 것

         */

        int height = 175;

        String possible = (height >= 120) ? "탑승 가능" : "탑승 불가능";
        System.out.println(possible);











    }

}
