package _14_Array;

public class Array02 {
    public static void main(String[] args) {

        //배열 순회

        String[] ctrs = {"Hungary" , "Croatia", "Slovenia", "Austria", "Czech"};
//        //반복문 for문을 통해 배열 순회
//        for (int i = 0; i < 5; i++) {
//            System.out.println(ctrs[i]);
//        }

        //배열의 크기를 모르면, 배열이름.length하면 알려줌
//        for (int i = 0; i < ctrs.length; i++) {
//            System.out.println(ctrs[i]);
//        }

            //enhanced for문(for-each) : 향상된 for문
            for (String country : ctrs) {
                System.out.println(country);
            }






    }

}
