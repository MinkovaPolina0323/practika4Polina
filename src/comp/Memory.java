package comp;

// Класс оперативной памяти - часть компьютера
public class Memory {
    private int size; // Размер памяти в GB
    private String type; // Тип памяти (DDR3, DDR4, DDR5)
    private double speed; // Скорость памяти в MHz

    // Конструктор - создает память с параметрами
    public Memory(int size, String type, double speed) {
        this.size = size;
        this.type = type;
        this.speed = speed;
    }

    // Метод для получения информации о памяти
    public void displayInfo() {
        System.out.println("Память: " + size + " GB " + type);
        System.out.println("Скорость: " + speed + " MHz");
    }

    // Геттеры для свойств памяти
    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public double getSpeed() {
        return speed;
    }
}
