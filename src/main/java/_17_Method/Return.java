package _17_Method;

public class Return {

    public static String getName(){
        String name = "구영현";
//        System.out.println(name);
        return name;
        //return을 쓰려면 void가 자리에 void 말고 반환할 자료형을 적어줌.
    }

    public static int getAge(){
        int age = 28;
        return age;
    }

    public static void main(String[] args) {

        //Return : 반환값.
        //void는 반환값이 없다
        System.out.println(getName());
        System.out.println(getAge());

        String myName = getName();
        System.out.println(myName);
        int myAge = getAge();
        System.out.println(myAge);
    }
}
