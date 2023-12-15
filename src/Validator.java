public class Validator {

    private static final String LEGAL_CHARACTERS = "qwertyuiopasdfghjklzxcvbnm1234567890_";

    private static final int MAX_LENGTH = 20;

    public static void validate(String login, String password, String confirmPassword) {

        for (int i = 0; i < login.length(); i++) {
            if (LEGAL_CHARACTERS.indexOf(login.charAt(i)) == -1) {
                throw new WrongLoginException("Логин содержит недопустимые символы");
            }
        }

        if (login.length() > MAX_LENGTH) {
            throw new WrongLoginException("Длина логина превышает максимум");
        }

        for (int i = 0; i < password.length(); i++) {
            if (LEGAL_CHARACTERS.indexOf(password.charAt(i)) == -1) {
                throw new WrongPasswordException("Пароль содержит недопустимые символы");
            }
        }

        if (password.length() > MAX_LENGTH) {
            throw new WrongPasswordException("Длина пароля превышает максимум");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }

    }

}
