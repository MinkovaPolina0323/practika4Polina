package atelier;

// abstract означает, что нельзя создать объект этого класса напрямую
public abstract class Clothes {
    // Защищенные поля (protected) - доступны в этом классе и классах-наследниках
    protected Size size;    // Размер одежды (использует enum Size)
    protected double price; // Цена одежды
    protected String color; // Цвет одежды

    // Конструктор класса - инициализирует поля при создании объекта-наследника
    public Clothes(Size size, double price, String color) {
        this.size = size;    // Присваиваем переданный размер полю size
        this.price = price;  // Присваиваем переданную цену полю price
        this.color = color;  // Присваиваем переданный цвет полю color
    }
}
