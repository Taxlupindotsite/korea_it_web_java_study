package _19_VarialbeScope;

public class VarialbeScope{


//지역변수와 전역변수


public static void methodA() {
    String str = "abc";
//        System.out.println(name);
}

public static void main(String[] args) {

    String name = "구영현";

//        System.out.println(str);

    for (int i = 0; i < 10; i++) {
        System.out.println(i);
    }
//        System.out.println(i);

    {int age = 27;}
//        System.out.println(age);


}
}

