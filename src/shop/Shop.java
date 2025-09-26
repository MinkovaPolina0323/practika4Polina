package shop;

import java.util.ArrayList;
import java.util.Scanner;

// Главный класс магазина
public class Shop {
    private ArrayList<Category> categories; // Список категорий
    private User currentUser; // Текущий пользователь
    private Cart cart; // Корзина пользователя
    private Scanner scanner; // Для ввода данных

    // Конструктор - создает магазин с категориями и товарами
    public Shop() {
        this.categories = new ArrayList<>();
        this.cart = new Cart();
        this.scanner = new Scanner(System.in);
        initializeShop(); // Заполняем магазин товарами
    }

    // Метод для заполнения магазина товарами
    private void initializeShop() {
        // Создаем категорию "Электроника"
        Category electronics = new Category("Электроника");
        electronics.addProduct(new Product("Смартфон", 30000));
        electronics.addProduct(new Product("Ноутбук", 50000));
        electronics.addProduct(new Product("Наушники", 5000));

        // Создаем категорию "Одежда"
        Category clothes = new Category("Одежда");
        clothes.addProduct(new Product("Футболка", 1500));
        clothes.addProduct(new Product("Джинсы", 3000));
        clothes.addProduct(new Product("Куртка", 7000));

        // Создаем категорию "Книги"
        Category books = new Category("Книги");
        books.addProduct(new Product("Роман", 500));
        books.addProduct(new Product("Детектив", 400));
        books.addProduct(new Product("Фантастика", 450));

        // Добавляем категории в магазин
        categories.add(electronics);
        categories.add(clothes);
        categories.add(books);
    }

    // Метод для аутентификации пользователя
    public boolean authenticate() {
        System.out.println("=== Вход в магазин ===");
        System.out.print("Введите логин(user): ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль (123): ");
        String password = scanner.nextLine();

        // Создаем пользователя (в реальном приложении проверяли бы в базе данных)
        User user = new User("user", "123");

        if (user.checkPassword(login, password)) {
            currentUser = user;
            System.out.println("Добро пожаловать, " + login + "!");
            return true;
        } else {
            System.out.println("Неверный логин или пароль!");
            return false;
        }
    }

    // Метод для показа меню магазина
    public void showMenu() {
        while (true) {
            System.out.println("\n=== МЕНЮ МАГАЗИНА ===");
            System.out.println("1. Просмотр каталогов");
            System.out.println("2. Просмотр корзины");
            System.out.println("3. Купить товары");
            System.out.println("4. Выйти");
            System.out.print("Выберите пункт: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищаем буфер

            switch (choice) {
                case 1:
                    showCategories();
                    break;
                case 2:
                    cart.showCart();
                    break;
                case 3:
                    cart.buy();
                    break;
                case 4:
                    System.out.println("До свидания!");
                    return;
                default:
                    System.out.println("Неверный выбор!");
            }
        }
    }

    // Метод для показа категорий
    private void showCategories() {
        System.out.println("\n=== КАТАЛОГИ ТОВАРОВ ===");
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i).getName());
        }

        System.out.print("Выберите категорию (0 - назад): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 0) return;

        if (choice >= 1 && choice <= categories.size()) {
            showProducts(categories.get(choice - 1));
        } else {
            System.out.println("Неверный выбор!");
        }
    }

    // Метод для показа товаров в категории
    private void showProducts(Category category) {
        category.showProducts();

        System.out.print("Выберите товар для добавления в корзину (0 - назад): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 0) return;

        if (choice >= 1 && choice <= category.getProductsCount()) {
            Product product = category.getProduct(choice);
            cart.addProduct(product);
        } else {
            System.out.println("Неверный выбор!");
        }
    }
}
