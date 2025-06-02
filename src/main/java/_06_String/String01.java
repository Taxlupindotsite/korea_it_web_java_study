package _06_String;

public class String01 {
    public static void main(String[] args) {

        String str = "My name is Young Hyun Koo";

        System.out.println(str.length()); //문자열 길이

        System.out.println(str.toUpperCase()); //전부 대문자로 출력하게끔
        System.out.println(str.toLowerCase()); //싹다 소문자로

        System.out.println(str.contains("name")); //포함 여부, 결과는 boolean
        //포함하면 true, 아니면 false

        System.out.println(str.contains("age"));

        System.out.println(str.indexOf("name")); //해당 위치정보
        //3이 뜨는데.
        //컴퓨터는 순서대로 숫자를 셀 때 0부터 셈
        //My name is ~~
        //0123

        System.out.println(str.indexOf("age"));
        //-1이 뜨는데.
        //만약 찾았는데 없으면, -1을 출력함

        str = "i like music and movie and travel";
        System.out.println(str.lastIndexOf("and"));
        // 여러개 중에서 마지막 위치를 찾아줘
        System.out.println(str.lastIndexOf("java"));
        // 없으면 -1을 출력

        System.out.println(str.startsWith("i like"));
        //해당 문자열로 시작하냐? => 결과는 boolean.
        System.out.println(str.startsWith("My name"));

        System.out.println(str.endsWith("travel"));
        //해당 문자열로 끝나냐? =? boolean.
        System.out.println(str.endsWith("movie"));
        //ㄴㄴ






    }
}
