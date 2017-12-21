package example;

/**
 * Created by Maria on 22.12.2017.
 */
public class BoxColor extends Box {


			private String color;

			public BoxColor(String color) {
		//		super(width, height, depth);
				System.out.println("Вызов конструктора BoxColor");
				this.color = color;
			}

			public BoxColor(double width, double height, double depth, String color) {
				super(width, height, depth);
				System.out.println("Вызов конструктора BoxColor");
				this.color = color;
			}

			public BoxColor(){
				System.out.println("Вызов конструктора BoxColor без параметров");
			}

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}


			@Override
			public String toString() {
				return  String.format("BoxColor = [%s, color = %s]", super.toString(), color);
			}


}
