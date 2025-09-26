package shop;

import java.util.ArrayList;

// Класс категории товаров
public class Category {
    private String name; // Название категории
    private ArrayList<Product> products; // Список товаров в категории

    // Конструктор - создает категорию с названием
    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Метод для добавления товара в категорию
    public void addProduct(Product product) {
        products.add(product);
    }

    // Метод для показа всех товаров категории
    public void showProducts() {
        System.out.println("Товары в категории '" + name + "':");
        for (int i = 0; i < products.size(); i++) {
            System.out.print((i + 1) + ". ");
            products.get(i).display();
        }
    }

    // Геттер для названия категории
    public String getName() {
        return name;
    }

    // Геттер для получения товара по номеру
    public Product getProduct(int number) {
        if (number >= 1 && number <= products.size()) {
            return products.get(number - 1);
        }
        return null;
    }

    // Геттер для количества товаров
    public int getProductsCount() {
        return products.size();
    }
}
