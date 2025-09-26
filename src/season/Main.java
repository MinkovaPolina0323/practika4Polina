package season;

public class Main {
    public static void main(String[] args) {

        Season favorite = Season.SUMMER;
        System.out.println("Мое любимое время года: " + favorite.getName());
        System.out.println("Температура: " + favorite.getAvgTemp() + "°C");
        System.out.println("Описание: " + favorite.getDescription());
        System.out.println();

        SeasonUtils.printLove(favorite);
        System.out.println();

        SeasonUtils.printAllSeasons();
    }
}
