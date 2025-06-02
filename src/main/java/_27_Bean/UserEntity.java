package _27_Bean;


/*
    Bean
    하나의 객체 설계 규칙(명세, 가이드라인)
    1. 멤버변수들은 private => 캡슐화
    2. 기본 생성자가 있어야함
    3. getter,setter가 있어야함 ( 외부 접근을 위해)

 */

public class UserEntity {

    private int userId;
    private String userName;
    private int age;
    private String email;

    public UserEntity() {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity(" + "userId=" + userId
                + ", username=" + userName
                + ", age=" + age
                + ", email=" + email +
                ")";



    }
}
