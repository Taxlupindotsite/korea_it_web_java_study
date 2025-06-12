package _31_Generic.Wildcard;

public class UnBoundedWildCard {

    //? => 타입에 제한이 없다(==비한정적 와일드카드)
//    하지만 읽기만 가능함. 쓰기는 불가능. => 타입이 명확하지 않기 때문

    public static void printBox(Box<?> box){

        System.out.println("Box 내용물:" + box.getItem());

    }


    }



