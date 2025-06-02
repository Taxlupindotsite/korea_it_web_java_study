package _14_Array;

import java.util.Arrays;
import java.util.Comparator;

public class Array03 {
    public static void main(String[] args) {

        Integer[] nums = { 8, 4, 5, 1, 7, 10, 6, 2, 9, 3};

        System.out.println(nums); //메모리 주소가 나옴. 의미불명..
        System.out.println(Arrays.toString(nums)); // 알아볼수 있는 배열형태로 나옴. (값을 한번에 출력.)
        Arrays.sort(nums); //오름차순 정렬. => 따로 대입하지 않음.
        //nums 변수의 값 자체를 정렬한것.

        System.out.println(Arrays.toString(nums));

        //내림차순 정렬
        Arrays.sort(nums, Comparator.reverseOrder());

        //int는 원시적인 자료형(primitive type)임. 연산만 가능한 자료형
        //Integer는 같은 정수를 담는 기능을 하지만, Integer는 클래스(Wrapper Class)임
        //Integer는 클래스로 이루어져 있고, 내장된 기능들(메소드)이 더 많다.
        //같은 정수지만, int는 계산만 가능한 반면
        //Integer는 다양한 기능을 사용할 수 있다.

        //double - Double
        //float - Float
        //long - Long

    }
}
