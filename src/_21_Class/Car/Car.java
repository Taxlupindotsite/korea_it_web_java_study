package _21_Class.Car;

public class Car {

    String carName;
    int carYearModel;
    String carColor;

//    생성자
    //클래스명이 그대로 옴.
    Car() { // 기본 생성자
        System.out.println("필드가 아무것도 정해지지 않은 껍데기 자동차");
        System.out.println("NoArgsConstructor");
    }

    Car(String carNm){ //일반적으로 매개변수명과 일치시킴.
        System.out.println("CarName의 속성값이 부여된 자동차");
        System.out.println("RequiredArgsContstructor");
        this.carName = carNm;
    }

    // this
//    객체를 생성할때 매개변수로 값을 전달받아서 객체를 생성함과 동시에
//    속성에 값을 넣는것임

//    this -> 해당 클래스로 만들어진 객체를 의미함.
//    this를 왜 써야하는가? 속성의 이름과 매개변수의 이름이 같을 때, 명확히 하기위해
//    만약) 매개변수는 CarNm이고, 속성은 CarName인 경우에
//    구분이 된다? 그럼 생략이 가능함. 그러나 일반적으로 매개변수명과 일치시키니까.

//    만약 carName = carName;이라면 속성에 자기 자신을 대입하는 것이라 의미가 없음.
//    하지만 this.carName이라고 명시를 해두면 속성에 매개변수 값을 대입한다는 뜻






    Car(String carName, int carYearModel, String carColor) {
        System.out.println("모든 속성값이 부여된 자동차");
        System.out.println("AllArgsConstructor");
        this.carName = carName;
        this.carYearModel = carYearModel;
        this.carColor = carColor;
    }


    public void startcar() {
        System.out.println(carName + "가 시동을 겁니다.");
    }


    public void drive() {
        System.out.println(carName + "가 전진합니다. ");
    }


    public void stop(){
        System.out.println(carName + "가 정지합니다. ");
    }



}
