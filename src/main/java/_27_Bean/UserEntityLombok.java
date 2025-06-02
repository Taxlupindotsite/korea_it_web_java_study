package _27_Bean;

// 롬복과 메이븐

import lombok.*;

@Getter
@Setter
@ToString
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor


// 이런식으로 쉽게 가능, 알트 인서트 안해도

public class UserEntityLombok {
    private int userId;
    @NonNull
    private String username;
    private int age;
    private String email;

    public UserEntityLombok() {

    }
}

/*
    Entity
    DB의 테이블과 1:1매핑되는 클래스
    자바 객체 <=>DB 테이블 간 데이터를 매핑하기 위해 사용
    DB와 CRUD 작업

    Lombok
    자바의 반복적인 코드를 자동으로 생성해주는 라이브러리
    getter, setter, toString, 생성자, Builder 등등..



 */

