package comp;

// Перечисление марок компьютеров
public enum ComputerBrand {
    // Список популярных марок компьютеров
    APPLE("Apple"),
    DELL("Dell"),
    HP("HP"),
    LENOVO("Lenovo"),
    ASUS("Asus"),
    ACER("Acer");

    private String name; // Название марки

    // Конструктор - устанавливает название марки
    ComputerBrand(String name) {
        this.name = name;
    }

    // Метод для получения названия марки
    public String getName() {
        return name;
    }
}
