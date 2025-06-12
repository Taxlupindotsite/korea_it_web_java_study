package _31_Generic;

import java.util.Date;

public class DataController {

    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData("데이터:","구영현",28,3.14);
//        System.out.println(responseData.toStringStr());
//        System.out.println(responseData.toStringInt());
//        System.out.println(responseData.toStringDouble());
//

        ResponseData<String> responseData1 = new ResponseData<String>("이름:","구영현");
        System.out.println(responseData1);
        ResponseData<Integer> responseData2 = new ResponseData<>("나이 :", 28);
        System.out.println(responseData2);
        ResponseData<Double> responseData3 = new ResponseData<>("원주율 :",3.14);
        System.out.println(responseData3);

        Date now = new Date();
        ResponseData<Date> nowData = new ResponseData<>("날짜",now);
        System.out.println(nowData);


    }
}
