package task2;

import java.util.Scanner;

import static task2.ArrayString.*;
import static task2.Calculator.calculate;

/**
 * Created by Maria on 08.12.2017.
 */
public class Task2 {

		private static Scanner sc = new Scanner(System.in);

		public static void main(String args[]){
			System.out.println("Выберите операцию: ");
			System.out.println("1 - Калькулятор");
			System.out.println("2 - Поиск самого длинного слова в массиве");
			String operation = sc.next();
			switch (operation) {
				case "1":
					try {
						calculate();

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case "2":
					String maxWord = getMaxWordFromArray(createStringArray());
					System.out.printf("Максимальное слова - %s", maxWord);
					break;
				default:
					System.out.printf("Ошибка при вводе операции.");
			}
			sc.close();
		}
}
