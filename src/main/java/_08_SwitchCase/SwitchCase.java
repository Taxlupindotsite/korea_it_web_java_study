package _08_SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {

        //조건문 - Switch Case

        //1등 => 전액 장학금
        //2등 => 반액 장학금
        //3등 => 소정의 상품
        //그 이하 => 박수

        int ranking = 2;
        if (ranking == 1){
            System.out.println("전액 장학금!!");
        }else if(ranking == 2){
            System.out.println("반액 장학금!!");
        }else if(ranking == 3){
            System.out.println("소정의 상품!!");
        } else {
            System.out.println("박수!!");
        }
        System.out.println("수여 끝~~");

    //보통 if문은 범위, switch문은 명확한 도출값이 나올때 씀

       /* switch (ranking){
            case 1:
                System.out.println("전액 장학금!!");
                break;

                case 2:
                    System.out.println("반액 장학금!!");
                    break;

            case 3:
                System.out.println("소정의 상품");
                break;
            default:
                System.out.println("박수!!");
        }
        System.out.println("수여 끝~~");
        */

        switch (ranking){
            case 1:
                System.out.println("전액 장학금!!");
                break;

            case 2:
            case 3:
                System.out.println("반액 장학금!!"); //만약 2와 3이 결과값이 같다면, 2(앞의 조건)는 생략가능
                break;
            default:
                System.out.println("박수!!");
        }
        System.out.println("수여 끝~~");

        // ///////////////////////////////////////////////////

        int price = 7000;
        int grade = 1;
        //1등급이면 10,000원, 등급이 한 단계씩 낮아질수록 -1,000원씩.

        /*
        이게 정석인데
        switch (grade){
            case 1:
                price += 3000;
                break;
            case 2:
                price += 2000;
                break;
            case 3:
                price += 1000;
                break;
        }

         */

        //break가 없이 쓸려면(코테같은거임)
        switch (grade) {
            case 1:
                price += 1000;

            case 2:
                price += 1000;

            case 3:
                price += 1000;

        }

            System.out.println("가격은" + price);



        //switch문을 사용하여 아래의 조건을 만들어보세요.
        // 봄 : 3,4,5 => 봄입니다.
        // 여름 : 6,7,8 => 여름입니다.
        // 가을 : 9,10,11 => 가을입니다.
        // 겨울 : 12,1,2 => 겨울입니다.

        int month = 7;

        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("봄입니다.");
                break;

            case 6:
                case 7:
                    case 8:
                        System.out.println("여름입니다.");
                        break;

            case 9:
                    case 10:
                    case 11:
                        System.out.println("가을입니다.");
                        break;

            case 12:
                case 1:
            case 2:
                System.out.println("겨울입니다.");


        }













    }
}
