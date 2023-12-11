public class Main {
    public static void main(String[] args) {

        String login = "login123";
        String password = "password123";
        String confirmPassword = "password123";

        Validator.validate(login, password, confirmPassword);
        System.out.println("Валидация прошла успешно");

    }
}