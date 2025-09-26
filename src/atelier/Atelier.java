package atelier;

// Класс ателье - работает с одеждой
public class Atelier {

    // Метод для показа женской одежды
    // Принимает массив всей одежды
    public void dressWomen(Clothes[] clothes) {
        System.out.println("=== Одежда для женщин ===");

        // Проходим по всему массиву одежды
        for (Clothes item : clothes) {
            // Проверяем, является ли эта одежда женской
            // instanceof проверяет, реализует ли объект интерфейс WomenClothing
            if (item instanceof WomenClothing) {
                // Преобразуем тип Clothes в WomenClothing
                WomenClothing womenItem = (WomenClothing) item;
                // Вызываем метод одеть женщину
                womenItem.dressWomen();
            }
        }
    }

    // Метод для показа мужской одежды
    public void dressMan(Clothes[] clothes) {
        System.out.println("=== Одежда для мужчин ===");

        // Проходим по всему массиву одежды
        for (Clothes item : clothes) {
            // Проверяем, является ли эта одежда мужской
            if (item instanceof MenClothing) {
                // Преобразуем тип Clothes в MenClothing
                MenClothing menItem = (MenClothing) item;
                // Вызываем метод одеть мужчину
                menItem.dressMan();
            }
        }
    }
}
