package shop;

// Класс товара
public class Product {
    private String name;  // Название товара
    private double price; // Цена товара

    // Конструктор - создает товар с названием и ценой
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Геттеры для названия и цены
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Метод для вывода информации о товаре
    public void display() {
        System.out.println(name + " - " + price + " руб.");
    }
}
