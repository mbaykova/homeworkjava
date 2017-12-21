package task4;

/**
 * Created by Maria on 09.12.2017.
 */
public class Jellybean extends Present {

			private String smell;

			public Jellybean(String name, int weight, Double price, String smell) {
				super(name, weight, price);
				this.smell = smell;
			}

			public String getSmell() {
				return smell;
			}

			public void setSmell(String smell) {
				this.smell = smell;
			}

			@Override
			public String toString() {
				return  String.format("Jellybean = [%s, smell = %s]", super.toString(), smell);
			}
}
