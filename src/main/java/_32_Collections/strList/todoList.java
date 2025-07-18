package _32_Collections.strList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class todoList  /*
        문제 - TodoList
        1. todoList를 담을 리스트 생성, 스캐너 객체도 하나 생성
        2. 사용자에게 todo를 입력받을 건데 몇개 입력할건지 count변수에 입력받기
        3. count만큼 반복문을 돌면서 사용자에게 todo를 입력받아 todoList에 추가
        4. 향상된 for문을 이용, todoList 출력하기
        5. 특정 todo를 포함여부를 확인하기 위해서 searchTodo라는 변수에
        찾을 키워드를 입력받고 해당 searchTodo가 있는지 여부 출력하기.
        6. 삭제할 todo 입력받아서 deleteTodo에 대입해두고 포함 여부 확인 후 삭제, 성공여부 출력
        7. todo들 정렬하고 전체 출력
        8.이번엔 역순으로  정렬하고 전체 출력
        9. 전체 todo들의 갯수 출력.
         */

{
    public static void main(String[] args) {

        //        1. todoList를 담을 리스트 생성, 스캐너 객체도 하나 생성
        List<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //        2. 사용자에게 todo를 입력받을 건데 몇개 입력할건지 count변수에 입력받기
        System.out.print("할 일을 몇 개 입력하시겠습니까? => ");
        int count = Integer.parseInt(scanner.nextLine());

        //        3. count만큼 반복문을 돌면서 사용자에게 todo를 입력받아 todoList에 추가
        for (int i = 0; i < count; i++) {
            System.out.print((i+1) + "번쨰 할 일을 입력하세요. : ");
            String todo = scanner.nextLine();
            todoList.add(todo);
        }
//        4. 향상된 for문을 이용, todoList 출력하기
        System.out.println("전체 todo 출력하기");
        for (String todo : todoList) {
            System.out.println("- " + todo);
        }

//        5. 특정 todo를 포함여부를 확인하기 위해서 searchTodo라는 변수에
//        찾을 키워드를 입력받고 해당 searchTodo가 있는지 여부 출력하기.
        System.out.println("포함 여부를 확인할 todo를 입력해 주세요. : ");
        String serachTodo = scanner.nextLine();
        boolean searchresult = todoList.contains(serachTodo);
        System.out.println("-> \"" + serachTodo + "\" 포함 여부 : " + searchresult);

//        6. 삭제할 todo 입력받아서 deleteTodo에 대입해두고 포함 여부 확인 후 삭제, 성공여부 출력
        System.out.print("삭제할 todo를 입력해 주세요. : ");
        String deleteTodo = scanner.nextLine();

        boolean isContain = todoList.contains(deleteTodo);
        if(isContain) {
            boolean removeResult = todoList.remove(deleteTodo);
            System.out.println("-> \"" + deleteTodo + "\" 삭제 여부 : " + searchresult);
        } else {
            System.out.println("해당 todo는 존재하지 않습니다.");
        }


//        7. todo들 정렬하고 전체 출력
        Collections.sort(todoList);
        System.out.println("정렬한 todo 목록");
        for(String todo : todoList){
            System.out.println("- " + todo);
        }

//        8.이번엔 역순으로  정렬하고 전체 출력

        Collections.sort(todoList, Collections.reverseOrder());
        System.out.println("역순정렬한 todo 목록");
        for(String todo : todoList){
            System.out.println("- " + todo);
        }

//        9. 전체 todo들의 갯수 출력.

        System.out.println("전체 todo의 갯수 = > " + todoList.size());



    }
}
