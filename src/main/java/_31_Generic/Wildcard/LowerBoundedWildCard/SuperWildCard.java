package _31_Generic.Wildcard.LowerBoundedWildCard;

public class SuperWildCard {

// 하한 경계 와일드카드 : Dog 또는 Dog의 상위 타입만 허용
    public static void putDog(Box<? super Dog> box) {
    box.setItem(new Dog());  // 쓰기는 가능, 읽기는 안됨

//    Dog dog = box.getItem(); // 읽기는 안 됨

    }
}
