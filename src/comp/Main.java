package comp;

public class Main {
    public static void main(String[] args) {
        // Создаем процессор для компьютера
        Processor processor = new Processor("Intel Core i7", 3.8, 8);

        // Создаем память для компьютера
        Memory memory = new Memory(16, "DDR4", 3200);

        // Создаем монитор для компьютера
        Monitor monitor = new Monitor("Dell UltraSharp", 27.0, "2560x1440");

        // Создаем компьютер из составных частей
        Computer computer = new Computer(ComputerBrand.DELL, processor, memory, monitor, 75000);

        // Демонстрируем работу компьютера
        System.out.println("=== ДЕМОНСТРАЦИЯ КОМПЬЮТЕРА ===\n");

        // Включаем компьютер
        computer.turnOn();
        System.out.println();

        // Показываем полную информацию
        computer.displayFullInfo();
        System.out.println();

        // Выполняем работу на компьютере
        computer.doWork("программирование на Java");
        System.out.println();

        // Выключаем компьютер
        computer.turnOff();

        System.out.println("\n=== СОЗДАЕМ ВТОРОЙ КОМПЬЮТЕР ===\n");

        // Создаем второй компьютер (Apple)
        Processor appleProcessor = new Processor("Apple M1", 3.2, 8);
        Memory appleMemory = new Memory(8, "LPDDR4", 4266);
        Monitor appleMonitor = new Monitor("Apple Retina", 24.0, "4480x2520");
        Computer appleComputer = new Computer(ComputerBrand.APPLE, appleProcessor, appleMemory, appleMonitor, 120000);

        // Работаем со вторым компьютером
        appleComputer.turnOn();
        System.out.println();
        appleComputer.displayFullInfo();
        System.out.println();
        appleComputer.doWork("дизайн и графика");
        System.out.println();
        appleComputer.turnOff();
    }
}