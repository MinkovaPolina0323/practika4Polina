package atelier;

// Класс юбки - наследуется от Clothes
// Юбка - только женская одежда, поэтому реализует только WomenClothing
public class Skirt extends Clothes implements WomenClothing {

    // Конструктор
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    // Реализация метода для женщин
    public void dressWomen() {
        System.out.println("Юбка: размер " + size + ", цвет " + color + ", цена " + price);
    }
}