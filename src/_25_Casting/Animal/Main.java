package _25_Casting.Animal;

public class Main {
    public static void main(String[] args) {

        /*업 캐스팅
        자식 클래스의 객체를 부모 클래스 타입으로 참조하는 것.
        즉, 자식 클래스의 인스턴스(객체)를 부모 클래스 타입의 변수에 저장하는 것
        JAVA에서의 업캐스팅은 다형성을 구현하는 핵심 개념임
        */

        Dog d = new Dog();
        d.speak();
        d.wagTail();

        Dog a = new Dog(); //업캐스팅 방법 1 : A a = new B();
//      변수 a의 형태는 Animal이고, Dog의 객체를 넣는다
//      업캐스팅(자식 => 부모), 형변환 명시 안 해도 됨

        //a는 Animal타입이지만, 내부적으로는 Dog의 객체가 들어있다..
        a.speak(); // 오버라이드된 자식 메소드 호출
//      a.wagTail(); // 부모에게 없기때문에 호출 불가

//      다운캐스팅 방법 1 (부모 => 자식) 형변환 명시를 해야함
        ((Dog) a).wagTail(); //일시적으로 형변환

        Animal a2 = d; //업캐스팅 방법 2
//        부모 클래스 타입에 자식 클래스 대입
        a2.speak();

        //다운캐스팅의 방법2
        Dog d2 = (Dog) a2; // 새로운 변수에 다운캐스팅한 객체를 대입
        d2.wagTail();

//     다양한 자식들을 하나의 클래스 타입으로 처리할수 있음

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        Dog[] dogs = {
                dog1,
                dog2,
                dog3
        };

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal tiger = new Tiger();

        Animal[] animals = {
                dog,
                cat,
                tiger
        };

//     업캐스팅하면 하나의 배열에 여러가지 클래스를 넣을수 있음

//        enhanced for
       for (Animal animal : animals){
           animal.speak();


       }






    }
}
