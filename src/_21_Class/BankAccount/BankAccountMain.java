package _21_Class.BankAccount;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(10000);
//        bankAccount.deposit(-4000);
        bankAccount.withdraw(2400);
//        bankAccount.withdraw(15000);

        System.out.println(bankAccount.getBalance());

//      Quiz
//      패키지로 WaterBottle => waterBottle 클래스, WaterBottleMain 클래스 만들고
//      속성값으로 currentWater 현재 물의 양
//
//      메소드
//      물 채우기(fill) => 최대용량인 1000을 넘을수 없음.
//      물 마시기(drink) => 현재 물의 양보다 초과해서 마실수 없음
//      getter를 통해 현재 물의 양을 파악할수 있게 만드세요.
//


    }
}
