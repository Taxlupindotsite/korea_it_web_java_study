package _06_String;

public class String02 {
    public static void main(String[] args) {
        String str = "I like music and movie and travel.";

        System.out.println(str.replace("and", ","));
        //특정 문자열을 다른 문자열로 대체.

        System.out.println(str.substring(7));
        //인덱스 기준, 7부터 출력
        System.out.println(str.substring(7,12));
        // +유의
        // 인덱스 기준 7부터 11까지, 시작은 본인 포함, 끝 지점은 본인을 포함하지 않음
        //m은 7이고, 12면 c/a사이의 공백임
        //그러므로 공백 앞 까지니까 c까지

        System.out.println(str.indexOf("movie"));
        System.out.println(str.substring(str.indexOf("movie"),str.indexOf(".")));
        //.(끝지점)을 포함 안하므로 문자까지만! 출력

        str = "    I want to go home     ";
        System.out.println(str.trim());
        //문자열 앞 뒤의 공백 제거후 출력

        String s1 = "Hello";
        String s2 = "World";

        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2)); //해당 문자열 뒤에 다른 문자열을 이어붙인다.
        //출력값 : HelloWorld

        System.out.println(s1 + " " + s2); //공백을 넣고싶으면 이렇게 해도 되지만
        System.out.println(s1.concat(" ").concat(s2));
        //이런식으로도 가능


    }
}
