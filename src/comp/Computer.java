package comp;

// Главный класс компьютера, который состоит из других частей
public class Computer {
    private ComputerBrand brand; // Марка компьютера
    private Processor processor; // Процессор компьютера
    private Memory memory;       // Память компьютера
    private Monitor monitor;     // Монитор компьютера
    private double price;        // Цена компьютера

    // Конструктор - создает компьютер из составных частей
    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor, double price) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.price = price;
    }

    // Метод для включения компьютера
    public void turnOn() {
        System.out.println("Компьютер " + brand.getName() + " включается...");
        System.out.println("Загрузка завершена!");
    }

    // Метод для выключения компьютера
    public void turnOff() {
        System.out.println("Компьютер " + brand.getName() + " выключается...");
    }

    // Метод для показа полной информации о компьютере
    public void displayFullInfo() {
        System.out.println("=== ИНФОРМАЦИЯ О КОМПЬЮТЕРЕ ===");
        System.out.println("Марка: " + brand.getName());
        System.out.println("Цена: " + price + " руб.");
        System.out.println();

        System.out.println("--- Составные части ---");
        processor.displayInfo();
        System.out.println();
        memory.displayInfo();
        System.out.println();
        monitor.displayInfo();
    }

    // Метод для выполнения работы на компьютере
    public void doWork(String work) {
        System.out.println("Компьютер выполняет: " + work);
    }

    // Геттеры для свойств компьютера
    public ComputerBrand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public double getPrice() {
        return price;
    }
}
