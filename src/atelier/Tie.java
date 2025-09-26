package atelier;

// Класс галстука - наследуется от Clothes
// Галстук - только мужская одежда, поэтому реализует только MenClothing
public class Tie extends Clothes implements MenClothing {

    // Конструктор
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    // Реализация метода для мужчин
    public void dressMan() {
        System.out.println("Галстук: размер " + size + ", цвет " + color + ", цена " + price);
    }
}
