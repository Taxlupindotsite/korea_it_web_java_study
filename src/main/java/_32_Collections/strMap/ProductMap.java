package _32_Collections.strMap;

/*
문제
1.  스캐너 객체 하나 생성, 변수명이 productMap인 hashMap생성(키:String, 값:Integer)
2.  상품 등록하기라고 출력하고, for문 이용, 5번 반복, 상품명(키)입력받고 가격(값)입력 받고 추가
**상품명을 입력받고 공백을 꼭 제거할 것**
3.  전체 상품을 출력하기 -> for each 사용
4. 상품 가격 수정 => 수정할 상품명 입력받고(공백제거) =>입력한 상품이 존재하면 가격을 입력받고
만약에 존재하지 않으면 존재하지 않는다고 출력
5.특정 상품 검색 => 검색할 상품명 입력받고(공백제거) 입력한 상품이 productMapㅇ ㅔ있는지부터
확인하고, 있으면 해당 상품명과 가격 출력 => 없으면 없다고 출력
6.정렬하기 => 정렬을 위한 리스트 만들고 키 기준 정렬하기 -> 정렬하고 for each 출력
7.정렬하기 역순 -> 역순 정렬하고 for each 출력
 */


import java.util.*;

public class ProductMap {

    public static void main(String[] args) {

//        1.스캐너 객체 하나 생성, 변수명이 productMap인 hashMap생성(키:String, 값:Integer)
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> productMap = new HashMap<>();

//        2.상품 등록하기라고 출력하고, for문 이용, 5번 반복, 상품명(키)입력받고 가격(값)입력 받고 추가
//                **상품명을 입력받고 공백을 꼭 제거할 것**
        System.out.println("상품 등록하기");
        for (int i = 0; i < 5; i++) {
            System.out.print("상품명 : ");
            String name = scanner.nextLine().trim();

            System.out.println("가격 : ");
            int price = Integer.parseInt(scanner.nextLine());

            productMap.put(name,price);

        }

//     3.  전체 상품을 출력하기 -> for each 사용

        for(Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + "원");
        }


//        4. 상품 가격 수정 => 수정할 상품명 입력받고(공백제거) =>입력한 상품이 존재하면 가격을 입력받고
//        만약에 존재하지 않으면 존재하지 않는다고 출력

        System.out.println("수정할 상품명을 입력하세요 : ");
        String updateName = scanner.nextLine().trim();
        if(productMap.containsKey(updateName)){
            System.out.print("수정할 가격 : ");
            int newPrice = Integer.parseInt(scanner.nextLine());
            productMap.put(updateName, newPrice);

            System.out.println("수정 완료 : " + updateName + "->" + newPrice + "원");
        }else {
            System.out.println("해당 상품이 없습니다.");
        }


//        6.정렬하기 => 정렬을 위한 리스트 만들고 키 기준 정렬하기 -> 정렬하고 for each 출력
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(productMap.entrySet());
        entryList.sort(Map.Entry.comparingByKey());
        System.out.println("상품명 기준 정렬");
        for(Map.Entry<String, Integer> entry : entryList) {
            System.out.println("-" +entry.getKey() + ": "+entry.getValue() + "원");
        }

//        7.정렬하기 역순 -> 역순 정렬하고 for each 출력
        entryList.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));
        System.out.println("상품명 기준 역순 정렬");
        for(Map.Entry<String ,Integer> entry : entryList){
            System.out.println("-" +entry.getKey() + ": "+entry.getValue() + "원");
        }



    }

}
