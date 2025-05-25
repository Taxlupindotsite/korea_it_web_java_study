package _20_Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

//        Scanner -> 입력.
        Scanner scanner = new Scanner(System.in);
//        빨간줄 뜨면 ctrl+Space 눌러볼것. 그럼 Import 됨
        //String 문자열을 입력받기
        //next() => 토큰 단위로 읽는다.
        //토큰 : 공백 문자(띄워쓰기.엔터.탭 등)

        //nextline() =>엔터가 입력될 떄 까지 인식함.

//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        System.out.println("str1는 " + str1);
//        System.out.println("str2는 " + str2);
//
//        String str3 = scanner.nextLine();
//        System.out.println("str3은 " + str3);

//        int 정수 입력받기
//        nextInt()
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println(" num1은 " + num1);
//        System.out.println(" num2은 " + num2);

//        int num = scanner.nextInt(); //123\n => 123 finished
//        scanner.nextLine(); //요게 필요함. \n을 버려주기 위한 필터
//        String str = scanner.nextLine();
//        System.out.println("num은 " + num + "str은" + str);


        int age;
        String name;
        //두개 입력받고 출력하십쇼.

        System.out.print("나이를 입력해 주세요 >>>");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("이름을 입력해 주세요 >>>");
        name = scanner.nextLine();
        System.out.println("나이는 " + age + " 이름은 " + name);

    }
}
