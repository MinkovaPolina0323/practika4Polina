package shop;

public class Main {
    public static void main(String[] args) {
        // Создаем магазин
        Shop shop = new Shop();

        // Пытаемся войти в систему
        if (shop.authenticate()) {
            // Если вход успешный - показываем меню
            shop.showMenu();
        }
    }
}
