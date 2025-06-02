package _25_Casting.Control;

public class CentralControl {

    private Power[] deviceArray;

    //    생성자 만들고
    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    //  모든 장치들을 하나의 클래스로 받으려면, Power(인터페이스)로 해야함
    public void addDevice(Power device) { // 암시적으로 업캐스팅이 되는것임

        int emptyIndex = checkEmpty();

        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 추가할수 없습니다.");
            return;
        }

        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName()  + "장치가 연결되었습니다.");
//        이게 뭔지는 좀이따 설명

//        device만 하면, 메모리 주소가 나옴
//        getClass까지만 하면, 메모리주소는 떼고
//        getSimpleName하면 클래스 명만 나옴


    }

    //    리턴값으로 인덱스값을 받을것이므로 int로 할것임
    public int checkEmpty() {

//    배열의 빈자리 인덱스 찾기
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i;   //빈자리 찾았을때.
            }
        }
        return -1; // 다 차있을때.
    }

    public void powerOn() {
        for (Power device : deviceArray) {
            if (device == null) {
                System.out.println("장치가 등록되어있지 않은 슬롯입니다.");
                continue;
            }

            device.on();

        }
    }

    public void powerOff() {
        //
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                System.out.println("장치가 등록되지 않은 슬롯입니다.");
                continue;

            }

            deviceArray[i].off();

        }
    }


    public void performSpecificMethod(){
        for (Power device : deviceArray) {

            if(device instanceof Computer){
                Computer computer = (Computer) device;
                computer.compute();
            } else if (device instanceof Mouse) {
                Mouse Mouse = (Mouse) device;
                Mouse.leftClick();
            } else if (device instanceof LEDLight) {
                LEDLight LEDLight = (LEDLight) device;
                LEDLight.changeColor();
            } else if (device instanceof Tv) {
                Tv Tv = (Tv) device;
                Tv.changeChannel();
            } else if (device instanceof Speaker) {
                Speaker Speaker = (Speaker) device;
                Speaker.controlVolume();
                } else if (device instanceof SmartPhone) {
                SmartPhone SmartPhone = (SmartPhone) device;
                SmartPhone.sendKaKaoTalk();

                }


        }

    }


}

