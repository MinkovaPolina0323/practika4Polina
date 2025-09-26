package season;

public class SeasonUtils {
    // Метод с оператором switch
    // Этот метод принимает время года и выводит сообщение
    public static void printLove(Season season) {
        // Оператор switch - проверяем какое время года передали
        switch (season) {
            case WINTER:  // Если зима
                System.out.println("Я люблю зиму");
                break;    // break - выходим из switch

            case SPRING:  // Если весна
                System.out.println("Я люблю весну");
                break;

            case SUMMER:  // Если лето
                System.out.println("Я люблю лето");
                break;

            case AUTUMN:  // Если осень
                System.out.println("Я люблю осень");
                break;
        }
    }

    // Метод для печати всех времен года
    public static void printAllSeasons() {
        System.out.println("Все времена года:");

        // Цикл for-each: проходим по всем значениям перечисления Season
        // Season.values() возвращает массив всех времен года [WINTER, SPRING, SUMMER, AUTUMN]
        for (Season season : Season.values()) {
            // Для каждого времени года выводим информацию
            System.out.println("Название: " + season.getName());
            System.out.println("Температура: " + season.getAvgTemp() + "°C");
            System.out.println("Описание: " + season.getDescription());
            System.out.println("---");  // Разделитель между временами года
        }
    }
}
