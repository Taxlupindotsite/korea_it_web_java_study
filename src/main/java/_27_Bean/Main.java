package _27_Bean;

public class Main {
    public static void main(String[] args) {

        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUserName("구영현");
        userEntity.setAge(28);
        userEntity.setEmail("kookoo4186@gmail.com");

        System.out.println(userEntity);

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(2);
        userEntityLombok.setUsername("홍길동");
        userEntityLombok.setAge(18);
        userEntityLombok.setEmail("gildong@gmail.com");

        System.out.println(userEntityLombok);













    }
}
