package _21_Class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {

        WaterBottle waterBottle = new WaterBottle();

        waterBottle.fill(500);
        waterBottle.fill(499);
        waterBottle.fill(1);

        waterBottle.drink(3);


        System.out.println(waterBottle.getCurrentWater());

    }
}
