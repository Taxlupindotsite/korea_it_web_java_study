package _28_Static;

import lombok.AllArgsConstructor;
import lombok.Getter;

// 스태틱 -> 클래스 수준에서 접근이 가능한..

@AllArgsConstructor
@Getter

public class KoreaItStudent {

    static String static_curriculum = "웹 개발";

    private String name;
    private int age;

    public static String getStatic(){
        return static_curriculum;


    }

}
