package atelier;

// Класс футболки - наследуется от Clothes
// Футболка может быть и мужской, и женской, поэтому реализует оба интерфейса
public class TShirt extends Clothes implements MenClothing, WomenClothing {

    // Конструктор - вызывает конструктор родительского класса Clothes
    public TShirt(Size size, double price, String color) {
        super(size, price, color); // Передаем параметры в родительский класс
    }

    // Реализация метода из интерфейса MenClothing
    public void dressMan() {
        System.out.println("Мужская футболка: размер " + size + ", цвет " + color + ", цена " + price);
    }

    // Реализация метода из интерфейса WomenClothing
    public void dressWomen() {
        System.out.println("Женская футболка: размер " + size + ", цвет " + color + ", цена " + price);
    }
}
