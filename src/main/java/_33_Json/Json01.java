package _33_Json;

/*
Json(Javascript Object Notation)
본래 자바스크립트 언어로부터 파생되어 자바스크립트 구문을 따르지만, 언어 독립형 데이터 포맷
Map 형태처럼 키 값 형태.

Gson
Google Json의 약자로, Java 객체를 Json형태로 변환하거나
혹은 반대로 변환하는 데 사용됨.
주요 클래스
Gson - 변환을 위해(Java 객체<->Json) 주로 사용되는 클래스
GsonBuilder -> Gson 인스턴스에 대한 사용자 정의 구성을 허용해줌.(prettyPrinting)등
JsonObject -> Json 객체를 나타냄.

 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Json01 {
    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();
        // 속성(key-value)을 추가하는 메서드 => addProperty()
    jsonObject1.addProperty("username","dongyoon");
    jsonObject1.addProperty("password","1234");
    jsonObject1.addProperty("email","test@gmail.com");
    jsonObject1.addProperty("name","이동윤");

        System.out.println(jsonObject1);

//  모든 키는 문자열이다.
//  형태는 "key" : value

    Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
    String json1 = gson1.toJson(jsonObject1);

    System.out.println(json1); //json 형태(가독성 상승)

    JsonObject address = new JsonObject();
    address.addProperty("city","부산시");
    address.addProperty("district","진구");
    address.addProperty("zipCode","12345");

    jsonObject1.add("address",address);

//  객체를 넣어서(add), 무한 중첩 가능
    Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
    String json2 = gson2.toJson(jsonObject1);
    System.out.println(json2);




 }
}
