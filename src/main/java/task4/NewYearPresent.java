package task4;

/**
 * Created by Maria on 09.12.2017.
 */
public class NewYearPresent {
			public static void main(String[] args) {
				printOnScreen(createPresent());
			}

			/**
			 * Набираем конфеты
			 *
			 * @return подарок
			 */
			private static Present[] createPresent() {
				Candy candy = new Candy("Moscow", 15, 3.50, "red");
				Candy candy1 = new Candy("KitKat", 25, 10.80, "blue");
				Cookie cookie = new Cookie("Twix", 50, 25.00, "karamel");
				Jellybean jellyBean = new Jellybean("BertyBotts", 100, 45.00, "different");
				Jellybean jellyBean1 = new Jellybean("BertyBotts", 100, 45.00, "different");

				return new Present[]{candy, candy1, cookie, jellyBean, jellyBean1};
			}

			/**
			 * Подсчет общего веса
			 *
			 * @param newYearSweetPresent подарок
			 * @return Общий вес
			 */
			private static int getTotalWeight(Present[] newYearSweetPresent) {
				int weight = 0;
				for (Present item : newYearSweetPresent) {
					weight += item.getWeight();
				}
				return weight;
			}

			/**
			 * Подсчет общей стоимости
			 *
			 * @param newYearSweetPresent подарок
			 * @return Общая цена
			 */
			private static double getTotalPrice(Present[] newYearSweetPresent) {
				double price = 0;
				for (Present item : newYearSweetPresent) {
					price += item.getPrice();
				}
				return price;
			}

			/**
			 * Выводим Общий вес, общую цену и список конфет подарка
			 *
			 * @param newYearSweetPresent подарок
			 */
			private static void printOnScreen(Present[] newYearSweetPresent) {
				System.out.println(String.format("Total weight = %d, total price = %.2f", getTotalWeight(newYearSweetPresent), getTotalPrice(newYearSweetPresent)));
				System.out.println("List of items:");
				for (Present item : newYearSweetPresent) {
					System.out.println(item.toString());
				}
			}
}
