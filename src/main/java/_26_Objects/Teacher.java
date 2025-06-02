package _26_Objects;

import java.util.Objects;

public class Teacher {

    private String name;
    private String schoolName;

    public Teacher(String name) {
        this.name = name;
    }

// 매개변수 타입이 같으므로 오버로딩 조건 자체가 안되서, schoolName 생성자 단독으로는 생성이 불가능

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

//    메소드 오버라이드를 할건데, Teacher에는 상속받은게 없음.
//

    @Override
    public String toString() {
        return name + "선생님의 근무지는" + schoolName + "입니다.";
    }

//    해쉬코드를 overRide를 하려면,equals도 반드시 같이 오버라이드 해줘야함.

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Teacher)) return false;
        Teacher teacher = (Teacher) obj;
        return this.name.equals(teacher.name) && this.schoolName.equals(teacher.schoolName);
    }

// equals에서 같다고 판별된 객체는 같은 해쉬코드를 가져와야 한다. 자바 공식규칙

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);

    }
//  name과 schoolName의 값을 기반으로 고유한 숫자(해쉬코드)를 생성
//

}



