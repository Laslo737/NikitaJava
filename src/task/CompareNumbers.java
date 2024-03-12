package task;
import java.util.Scanner;

public class CompareNumbers {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Введите число a:");
	        int a = scanner.nextInt();

	        System.out.println("Введите число b:");
	        int b = scanner.nextInt();

	        // Сравнение чисел
	        if (a > b) {
	            System.out.println("a > b");
	        } else if (a < b) {
	            System.out.println("a < b");
	        } else {
	            System.out.println("a = b");
	        }

	        // Операции с числами
	        System.out.println("Сложение: " + (a + b));
	        System.out.println("Вычитание: " + (a - b));
	        System.out.println("Умножение: " + (a * b));

	        // Проверка деления на ноль
	        if (b != 0) {
	            System.out.println("Деление: " + ((double) a / b));
	        } else {
	            System.out.println("Деление на ноль невозможно");
	        }
	    }
}
