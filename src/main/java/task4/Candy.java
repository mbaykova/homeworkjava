package task4;

/**
 * Created by Maria on 09.12.2017.
 */
public class Candy extends Present {

		private String color;

		public Candy(String name, int weight, Double price, String color) {
			super(name, weight, price);
			this.color = color;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return  String.format("Candy = [%s, Color = %s]", super.toString(), color);
		}
}
