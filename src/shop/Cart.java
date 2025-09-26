package shop;

import java.util.ArrayList;

// Класс корзины покупок
public class Cart {
    private ArrayList<Product> items; // Товары в корзине

    // Конструктор - создает пустую корзину
    public Cart() {
        this.items = new ArrayList<>();
    }

    // Метод для добавления товара в корзину
    public void addProduct(Product product) {
        items.add(product);
        System.out.println("Товар '" + product.getName() + "' добавлен в корзину!");
    }

    // Метод для показа содержимого корзины
    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
            return;
        }

        System.out.println("=== Ваша корзина ===");
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            Product product = items.get(i);
            System.out.println((i + 1) + ". " + product.getName() + " - " + product.getPrice() + " руб.");
            total += product.getPrice();
        }
        System.out.println("Общая сумма: " + total + " руб.");
    }

    // Метод для покупки товаров в корзине
    public void buy() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста, нечего покупать!");
            return;
        }

        double total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }

        System.out.println("=== Покупка завершена! ===");
        System.out.println("Куплено товаров: " + items.size());
        System.out.println("Общая сумма: " + total + " руб.");
        System.out.println("Спасибо за покупку!");

        // Очищаем корзину после покупки
        items.clear();
    }
}
