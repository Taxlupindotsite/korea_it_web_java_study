package _23_Abstraction;

// abstract => 추상적인, 형태만 있는
// 틀은 있지만 내용은 없는 클래스
// 이 기능은 꼭 있어야해! 근데 이 기능 구현은 자식클래스에서 해!
// 객체를 만들수 없음
// 왜 써야하는가?
// 설계 일관성과 확장성 확보 => 공통된 구조를 가진 자식클래스들을 설계
// 오류 방지/ 강제 구현 => 추상 메서드를 구현하지 않으면 에러발생(필수 기능 구현)
// 코드 재사용성 => 공통 메소드나 필드를 추상 클래스에 미리 작성가능.
public abstract class Factory {
    private String name;

    public Factory(String name){
        this.name = name;
    }

//    추상 클래스의 추상 메소드.
    public abstract void produce(String model);
    public abstract void manage();
//    추상 클래스-> 추상 메소드가 하나라도 있으면


//    게터,세터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void disPlayInfo(){
        System.out.println("공장 정보를 출력합니다. 공장이름 : " +name);
    }



}
