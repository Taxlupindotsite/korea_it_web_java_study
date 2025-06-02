package _21_Class.WaterBottle;

public class WaterBottle {

    //      Quiz
//      패키지로 WaterBottle => waterBottle 클래스, WaterBottleMain 클래스 만들고
//      속성값으로 currentWater 현재 물의 양
//
//      메소드
//      물 채우기(fill) => 최대용량인 1000을 넘을수 없음.
//      물 마시기(drink) => 현재 물의 양보다 초과해서 마실수 없음
//      getter를 통해 현재 물의 양을 파악할수 있게 만드세요.
//

    public int currentWater;

    WaterBottle() {
        System.out.println(" 물병을 가져왔습니다. 현재 물의 양은 " + currentWater + "ml 입니다.");
    }

    public void fill(int liquid) {

        if (liquid > 0 && currentWater + liquid<= 1000) {

            currentWater += liquid;
            System.out.println(" 물병에 " + liquid + "ml 만큼 물이 채워졌습니다.");
        } else {
            System.out.println(" 1000ml이상 담을수 없습니다. ");
        }
    }

    public int getCurrentWater() {
        return currentWater;
    }

    public void drink(int liquid) {
        if (liquid >0 && liquid <= currentWater) {
            currentWater -= liquid;
            System.out.println(" 물을 " + liquid + " ml만큼 마셨습니다. 현재 물 양: " + currentWater);
        } else {
            System.out.println(" 물이 모자랍니다..");
        }







    }
}
