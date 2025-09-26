package comp;

// Класс монитора - часть компьютера
public class Monitor {
    private String model; // Модель монитора
    private double size;  // Размер диагонали в дюймах
    private String resolution; // Разрешение экрана

    // Конструктор - создает монитор с параметрами
    public Monitor(String model, double size, String resolution) {
        this.model = model;
        this.size = size;
        this.resolution = resolution;
    }

    // Метод для получения информации о мониторе
    public void displayInfo() {
        System.out.println("Монитор: " + model);
        System.out.println("Диагональ: " + size + " дюймов");
        System.out.println("Разрешение: " + resolution);
    }

    // Геттеры для свойств монитора
    public String getModel() {
        return model;
    }

    public double getSize() {
        return size;
    }

    public String getResolution() {
        return resolution;
    }
}
