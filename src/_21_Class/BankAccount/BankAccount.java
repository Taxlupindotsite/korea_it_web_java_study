package _21_Class.BankAccount;

public class BankAccount {

    private int balance;
//  참고로 int말고 integer로 하면 초기값이 0이 아니라 null이 나옴

    BankAccount() {
        System.out.println("계좌가 개설되었습니다. 현재 잔액 : " + balance + "원");
    }


    public void deposit(int amount) {

        //    if를 거는 이유는 amount(입금)이 음수가 될수 없으므로
        if (amount > 0) {
            balance += amount;
            System.out.println(" 계좌에 " + amount + " 원 입금 되었습니다. 현재 잔액 : " + balance);
        } else {
            System.out.println(" 0원 이상만 입금 가능합니다.");
        }

    }


    public int getBalance() {
        return balance;
    }

    //        0원 이상이어야 하고, 내가 가진 잔액보다는 적어야 한다.는 조건이 필요함
    public void withdraw(int amount) {
        if (amount >0 && amount <= balance){
            balance -= amount;
            System.out.println(" 계좌에 " + amount + " 원 출금 되었습니다. 현재 잔액 : " + balance);
        } else{
            System.out.println(" 계좌 잔액이 부족합니다. 현재 잔액 : " + balance + "원." );
        }

    //그럼 입금과 출금을 담당하는 메소드들은, Setter와 같다고 할수 있는가?
//        속성값을 변경한다는 관점으로 보면 그렇다라고 할수있음
//        다만 setter와 이런 메소드들의 차이를 이해해야 함
//
//        1. setter는 값을 직접적으로 변경하고 있음. 그러나 입출금 메소드는 메소드 명에서도 보이듯이
//        행위에 중점을 둔다. => 값을 직접적으로 변경하고 있는게 아니라, 값을 계산해서 변경함.

//        2. setter는 검증 단계를 (보통은) 포함하지 않는다.
//            그러나 메소드는 (보통은) 검증 단계를 포함할 수 있다.


//       계좌잔액 조회 기능 (getter, Alt+Insert)


    }
}
