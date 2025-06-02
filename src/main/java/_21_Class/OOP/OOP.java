package _21_Class.OOP;

import _21_Class.Person.Person;

public class OOP {
    public static void main(String[] args) {

        // OOP란 Object Oriented Programming임
        // 객체 지향 프로그래밍
        // - 현실 세계의 개념을 코드로 표현
        // - 사람, 동물, 자동차 등을 하나의 객체로 보는 것
        // - 상태(속성)과 동작(기능)을 중심으로 프로그래밍 하는 것

        // OOP의 원칙 4가지
//        1. 추상화
//        -복잡한 내부 동작은 감추고, 꼭 필요한 기능만 보여주는 것

//        2. 캡슐화
//        - 정보 은닉. (setter/getter)
//        - 데이터(변수)를 보호하고, 접근을 제한하여 안정성을 높이는 것

//        3. 상속
//        4. 다형성


        Person person = new Person();
        System.out.println(person.name);
//        name은 public이므로 접근이 가능

//        System.out.println(person.age);
//        age는 protected이므로, 같은 패키지 or 자식패키지가 아님 , 그래서 오류(접근불가)
//        System.out.println(person.address);
//        같은이유로 default이라서, 접근불가능(오류)




    }
}
