package _22_Inheritance;

//  Animal에게 상속받을 것이고
//  부모 생성자 호출해서, 객체 생성과 동시에 속성값을 넣을수 있도록
//  생성자 만들고,
//  getter, setter 만들고
//  단 getter 만들때 getAnimalName => 제 이름은 ___입니다.로 오버라이딩
//  getAnimalAge => 올해 제 나이는 __이고, 내년에는 __입니다.
//  move => 사람이 두발로 걷습니다.
//  고유메소드로 read(String bookName) => ___이 (책 이름)을 읽습니다.로 만드세요.

//  main에서 객체 생성하고 다 만들어볼것

//  read, getanimalName, getAnimalAge, move

public class Human extends Animal {

    //상속
    public Human(String animalName, int animalAge){
        super(animalName, animalAge);
    }

    @Override
    public String getAnimalName(){
        return "제 이름은" + super.getAnimalName() + "입니다";
    }

    @Override
    public int getAnimalAge(){
        System.out.println("제 나이는" + super.getAnimalAge() + "살 이고 내년에는" + (super.getAnimalAge() + 1) + "입니다.");
        return super.getAnimalAge();
    }

    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
          }

    public void read(String bookName){
        System.out.println(super.getAnimalName() + "이" + bookName +"을 읽습니다.");
    }

}


