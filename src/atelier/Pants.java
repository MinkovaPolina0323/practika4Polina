package atelier;

// Класс штанов - наследуется от Clothes
// Штаны могут быть и мужскими, и женскими
public class Pants extends Clothes implements MenClothing, WomenClothing {

    // Конструктор
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    // Реализация метода для мужчин
    public void dressMan() {
        System.out.println("Мужские штаны: размер " + size + ", цвет " + color + ", цена " + price);
    }

    // Реализация метода для женщин
    public void dressWomen() {
        System.out.println("Женские штаны: размер " + size + ", цвет " + color + ", цена " + price);
    }
}
