package example;

/**
 * Created by Maria on 22.12.2017.
 */
public class BoxColor extends Box {

			private String color;

			public BoxColor(String color) {
				super(1, 1, 1);
				System.out.println("Вызов конструктора BoxColor");
				super.setDepth(3);
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
