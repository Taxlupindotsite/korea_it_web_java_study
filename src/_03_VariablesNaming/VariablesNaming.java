package _03_VariablesNaming;

public class VariablesNaming {
    public static void main(String[] args) {

        //변수명 짓는 법

        /*
        * 1. 저장되는 데이터에 어울리는 이름으로 할 것.
        * 2. 밑줄(_) , 문자, 숫자 사용가능. 단, 숫자가 맨 앞에 올수 없음
        * 3. 한 단어 또는 2개 이상 단어를 연속해서 사용
        *
        * 4. 소문자로 시작하고, 두 번째 단어부터는 시작글자를 대문자로.
        *  *파스칼 표기법(쌍봉낙타 표기법) =>ex) LastName => 클래스명, 파일명
        *  *카멜 표기법(단봉낙타 표기법) =>ex) lastName => 변수명, 메소드명
        *
        * 5. 예약어 사용 불가. (public, static, void, int, float 등등은 ㄴㄴ
        *

        * boolean으로 변수명을 지을때(국룰)
        * is, flag를 앞에 붙임
        *
        * boolean Empty 이렇게가 아니라
        * boolean isEmpty 이런식으로 지음

         */

        String carBrandName = "KIA";
        String carModelName = "EV6";
        String carColor = "White";
        int carPassengerCapacity = 5;
        int carModelYear = 2025;

        //상수 - 불변하는 데이터, 상수명은 다 대문자,단어와 단어 사이는 _로 구분
        final String COUNTRY_CODE  ="KR";
        //앞에 final 붙여주면 상수가 됨

    }
}
