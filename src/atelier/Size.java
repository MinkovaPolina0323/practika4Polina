package atelier;

   // Создание перечисления (enum) Size с фиксированным набором размеров
public enum Size {
    // Элементы перечисления с параметрами:
    // XXS - детский размер (32), остальные - взрослые размеры
    XXS(32, "Детский размер"),
    XS(34, "Взрослый размер"),
    S(36, "Взрослый размер"),
    M(38, "Взрослый размер"),
    L(40, "Взрослый размер");

    // Поля для хранения данных каждого размера
    private int euroSize;        // Европейский размер (число)
    private String description;  // Описание размера (текст)

    // Конструктор для инициализации полей каждого элемента enum
    Size(int euroSize, String description) {
        this.euroSize = euroSize;
        this.description = description;
    }

    // Геттер для получения описания размера
    public String getDescription() {
        return description;
    }

    // Геттер для получения числового размера
    public int getEuroSize() {
        return euroSize;
    }
}
