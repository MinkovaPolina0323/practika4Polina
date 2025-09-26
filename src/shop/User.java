package shop;

// Класс пользователя для аутентификации
public class User {
    private String login;    // Логин пользователя
    private String password; // Пароль пользователя

    // Конструктор - создает пользователя с логином и паролем
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    // Метод для проверки логина и пароля
    public boolean checkPassword(String inputLogin, String inputPassword) {
        return login.equals(inputLogin) && password.equals(inputPassword);
    }

    // Геттер для логина
    public String getLogin() {
        return login;
    }
}
