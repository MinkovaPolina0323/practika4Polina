package comp;

// Класс процессора - часть компьютера
public class Processor {
    private String model; // Модель процессора
    private double speed; // Скорость в GHz
    private int cores;    // Количество ядер

    // Конструктор - создает процессор с параметрами
    public Processor(String model, double speed, int cores) {
        this.model = model;
        this.speed = speed;
        this.cores = cores;
    }

    // Метод для получения информации о процессоре
    public void displayInfo() {
        System.out.println("Процессор: " + model);
        System.out.println("Скорость: " + speed + " GHz");
        System.out.println("Ядра: " + cores);
    }

    // Геттеры для свойств процессора
    public String getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }

    public int getCores() {
        return cores;
    }
}
