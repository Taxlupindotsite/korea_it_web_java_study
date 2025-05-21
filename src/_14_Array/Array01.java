package _14_Array;

public class Array01 {
    public static void main(String[] args) {

        //배열

        //같은 자료형의 데이터를, 여러 개 저장하는 연속된 공간

        //고정된 크기임.

        String country1 = "Hungary";
        String country2 = "Croatia";
        String country3 = "Slovenia";
        String country4 = "Austria";
        String country5 = "Czech";

        //배열 선언 첫 번째 방법
//        String[] countires = new String[5];
        //메모리에 5개 크기(0,1,2,3,4)의 배열을 만들었음.

        //배열 선언 두 번째 방법 , 되는데 보통 1번째 방법을 씀
//        String countires[] = new String[5];

//        countires[0] = "Hungary";
//        countires[1] = "Croatia";
//        countires[2] = "Slovenia";
//        countires[3] = "Austria";
//        countires[4] = "Czech";
//
//        countires[5] = "Korea";


//        System.out.println(countires[3]);
//        System.out.println(countries); 이러면 메모리 주소가 나옴.

        //배열 선언 세 번째 방법
//        String[] countries = new String[]
//                {"Hungary" , "Croatia", "Slovenia", "Austria", "Czech"};

        //배열 선언 네 번째 방법
        String[] countires = {"Hungary" , "Croatia", "Slovenia", "Austria", "Czech"};

        //배열 수정
        countires[1] = "Swiss";
        System.out.println(countires[1]);


        //당연히 String 말고 다른 자료형도 배열생성 가능
//                int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//
//        double[] doubles = {12.34, 23.45, 12.55, 45.87};
//        boolean[] booleans = [true, false, true, true, false];




    }
}
