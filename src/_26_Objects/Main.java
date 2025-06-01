package _26_Objects;

public class Main {
    public static void main(String[] args) {

//  모든 클래스는 Object클래스를 상속받고 있다.

        Teacher teacher1 = new Teacher("구영현", "코리아IT");
        Teacher teacher2 = new Teacher("구영현", "코리아IT");

        System.out.println(teacher1);
        System.out.println(teacher1.equals(teacher2));
//      false가 나오는데, 내용물이 같아도 hash코드가 달라서 false가 나옴
//      true가 나오려면 hashcode가 같아야함
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());


//      오버라이드 값을 바꿔줬으므로 true가 나올것임.
        System.out.println(teacher1.equals(teacher2));



    }
}

