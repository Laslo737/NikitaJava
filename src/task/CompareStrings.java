package task;
import java.util.Scanner;

public class CompareStrings {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку a:");
        String a = scanner.nextLine();

        System.out.println("Введите строку b:");
        String b = scanner.nextLine();

        // Сравнение строк
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
