import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            double num_1 = scan.nextDouble();

            System.out.print("Введите второе число: ");
            double num_2 = scan.nextDouble();

            System.out.println("Выберите операцию:\n------------------------\n1. Сложить\n2. Вычесть\n3. Умножить\n4. Делить\n------------------------");
            int choice  = scan.nextInt();

            switch (choice ) {
                case 1: System.out.println("Результат сложения: " + (num_1 + num_2)); break;
                case 2: System.out.println("Результат вычитания: " + (num_1 - num_2)); break;
                case 3: System.out.println("Результат умножения: " + (num_1 * num_2)); break;
                case 4: System.out.println(
                    num_2 != 0
                        ? "Результат деления: " + (num_1 / num_2)
                        : "Ошибка: деление на ноль невозможно."
                ); break;
                default: System.out.println("Некорректный выбор операции.");
            }
        } catch (Exception e) {
            // Обработка исключений, если введено что-то нечисловое
            System.out.println("Ошибка ввода. Пожалуйста, вводите только числа.");
        }
    }
}
