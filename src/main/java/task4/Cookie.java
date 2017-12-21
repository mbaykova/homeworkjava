package task4;

/**
 * Created by Maria on 09.12.2017.
 */
public class Cookie extends Present{

		private String taste;

		public Cookie(String name, int weight, Double price, String taste) {
			super(name, weight, price);
			this.taste = taste;
		}

		@Override
		public String toString() {
			return  String.format("Cookie = [%s, Taste = %s]", super.toString(), taste);
		}

		public void setTaste(String taste) {
			this.taste = taste;
		}
}
