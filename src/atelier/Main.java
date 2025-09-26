package atelier;

public class Main {
    public static void main(String[] args) {

        // Создаем разные предметы одежды с разными размерами и цветами
        TShirt tshirt = new TShirt(Size.M, 1500, "синий");
        Pants pants = new Pants(Size.L, 3000, "черный");
        Skirt skirt = new Skirt(Size.S, 2500, "красный");
        Tie tie = new Tie(Size.XS, 800, "зеленый");

        // Создаем массив, содержащий всю одежду
        Clothes[] allClothes = {tshirt, pants, skirt, tie};

        // Создаем объект ателье
        Atelier atelier = new Atelier();

        // Вызываем метод для показа женской одежды
        atelier.dressWomen(allClothes);
        System.out.println(); // Пустая строка для разделения

        // Вызываем метод для показа мужской одежды
        atelier.dressMan(allClothes);

        // Дополнительно: показываем информацию о всех размерах
        System.out.println("\n=== Информация о размерах ===");
        // Проходим по всем значениям перечисления Size
        for (Size size : Size.values()) {
            System.out.println("Размер " + size + ": евроразмер " +
                    size.getEuroSize() + ", " + size.getDescription());
        }
    }
}

