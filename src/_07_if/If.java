package _07_if;

public class If {
    public static void main(String[] args) {
        //조건문 if
        //키가 120이상이어야 탑승 가능
        int height = 130;

        /*
        if(조건) {
            조건이 참일때 실행되는 코드
        }
            */
       if(height >= 120) System.out.println("탑승 가능");
        //이것도 가능(중괄호 생략). 단, 실행해야 하는 코드가 한줄일 때

       if(height >= 120) {
            System.out.println("탑승 가능");
            System.out.println("탑승함");
        }
      //두 줄 이상인 경우 중괄호를 써야함

        //키가 120이상이고, 어른이 아니면 탑승가능
      boolean isAdult = false;

       if(height >= 120 && !isAdult) {
           System.out.println("탑승 가능");

       }
        // && =and(이고), !(아니면)

        if(height >=120 || !isAdult){
            System.out.println("탑승 가능");
        }




    }
}
