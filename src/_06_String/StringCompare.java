package _06_String;

public class StringCompare {
    public static void main(String[] args) {

        //비교할 스트링 2개.
        String str1 = "Java";
        String str2 = "Python";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java"));
        System.out.println(str2.equalsIgnoreCase("python"));
        //equals는 대소문자를 구분함
        //equalsIgnoreCase는 대소문자를 구분하지 않고 내용만 같으면 true

        String password1 = "1234";
        String password2 = "1234";
        System.out.println(password1 == password2);
        System.out.println(password1.equals(password2));
        password1 = new String("1234");
        password2 = new String("1234");
        System.out.println(password1 == password2); //false
        System.out.println(password1.equals(password2)); //true

        //22(==)가 false가 나오는 이유

        //변수는 메모리에 저장됨.
        //ㅁ ㅁ ㅁ ㅁ(메모리)
        //1  2  3  4 - str1.
        //str2를 만들었는데 그 내용이 같다면, str1에서 만든 메모리를 같이 이용함.

        //근데 new String 하면 다시 메모리를 재할당해서
        // ㅁㅁㅁㅁ(1234)를 또 만드는 것임
        //그래서 false가 나오는 것임

        // ==은, 정확히 말하면
        // 내용이 같냐?가 아니라 참조위치(메모리위치)가 같냐?라는 질문임
        // equals는 내용물이 같냐?라는 뜻임


    }
}
