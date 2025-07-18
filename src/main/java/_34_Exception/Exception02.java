package _34_Exception;

public class Exception02 {

    static class LoginFailedException extends Exception {
        public LoginFailedException(String message) {
            super(message);
            System.out.println("예외가 발생했습니다.");
        }
    }

    public static void login(String id, String password) throws LoginFailedException {
        String correctId = "admin";
        String correctPassword = "1q2w3e4r";

        if(!id.equals(correctId) || !password.equals(correctPassword)) {
            // 예외 발생
            throw new LoginFailedException("ID 또는 Password가 틀렸습니다.");
        }
    }

    public static void main(String[] args) {
    String inputId = "admin";
    String inputPassword = "1234qwer";

    try {
        login(inputId, inputPassword);
    } catch (LoginFailedException e){
        System.out.println("로그인 실패 : " + e.getMessage());
    } finally {
        System.out.println("프로그램 정상 종료");

    }



    }



}
