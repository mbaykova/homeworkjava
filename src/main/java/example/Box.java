package example;

/**
 * Created by Maria on 22.12.2017.
 */
public class Box {
		private double width;
		private double height;
		private double depth;

		public Box(double width, double height, double depth) {
				System.out.println("Вызов конструктора Box");
				this.width = width;
				this.height = height;
				this.depth = depth;
		}

		public Box(){
			System.out.println("Вызов конструктора Box без параметров");
		}

		public double getWidth() {
				return width;
		}

		public void setWidth(double width) { //доступ к переменным должен осущесвляться через методы, определенные в классе
				this.width = width;
		}

		public double getHeight() {
				return height;
		}

		public void setHeight(double height) {
				this.height = height;
		}

		public double getDepth() {
				return depth;
		}

		public void setDepth(double depth) {
				this.depth = depth;
		}

		public double getVolume(){
				return depth * height * width;
		}

		public double getVolume(int a){
			return depth * height * width;
		}

		@Override
		public String toString() {
			return String.format("depth = %s, height = %s, width = %s", depth, height, width);
		}
}
