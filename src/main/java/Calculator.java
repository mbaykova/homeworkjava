import java.util.Scanner;

/**
 * Created by Maria on 26.11.2017.
 * Реализация консольного калькулятора
 */
public class Calculator {

		private static Scanner sc = new Scanner(System.in);

		public static void main(String args[]){
				Double first = inputDouble("Введите 1-ое число:");
				Double second = inputDouble("Введите 2-ое число:");
				String operation = selectOperation();
				switch (operation) {
					case "1":
						System.out.printf("%.2f + %.2f = %.4f", first, second, first + second);
						break;
					case "2":
						System.out.printf("%.2f - %.2f = %.4f", first, second, first - second);
						break;
					case "3":
						System.out.printf("%.2f / %.2f = %.4f", first, second, first / second);
						break;
					case "4":
						System.out.printf("%.2f * %.2f = %.4f", first, second, first * second);
						break;
					case "5":
						break;
					default:
						System.out.printf("Ошибка при вводе операции. Повторите ввод.");
						selectOperation();
				}
			sc.close();

		}

	/**
	 *  Ввод с консоли значения типа Double
	 * @param message - сообщение пользователю
	 * @return значение, введенное пользователем с консоли
	 */
		private static Double inputDouble(String message){
				System.out.println(message);
				try {
					return sc.nextDouble();
				}catch (Exception e){
					System.out.println("Ошибка при вводе. Повторите ввод");
					sc.next();
					inputDouble(message);
				}
			return 0.;
		}

	/**
	 *  Метод по выбору операции
	 * @return номер операции в виде строки
	 */
		private static String selectOperation(){
				System.out.println("Выберите операцию: ");
				System.out.println("1 - Сложение");
				System.out.println("2 - Вычитание");
				System.out.println("3 - Деление");
				System.out.println("4 - Умножение");
				System.out.println("5 - Выход");
				return sc.next();
		}
}
