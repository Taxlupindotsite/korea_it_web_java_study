package _12_MultipleTable;

public class MultipleTable {
    public static void main(String[] args) {

        // 구구단. 1~9단까지 출력하십시오.
        // 1 x 3 = 3 이런식으로 출력하시오.



        for (int i = 1; i < 10; i++) { // 단 (1x3 = 3에서 1)
            for (int j = 1; j <10; j++) { //뒷단
                System.out.println(i + "X" + j + "=" + i*j);
            }
            System.out.println();

        }


    }
}
