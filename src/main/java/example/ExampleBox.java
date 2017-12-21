package example;

/**
 * Created by Maria on 22.12.2017.
 */
public class ExampleBox {

			public static void main(String[] args){
					Box box = new Box();
					box.setDepth(2);
					box.setHeight(1);
					box.setWidth(3);
					System.out.println(box.toString());

					Box box2 = new Box(1,2,3);
					System.out.println(box2.toString());

					BoxColor boxColor = new BoxColor();
					System.out.println(boxColor.toString());

					BoxColor boxColor1 = new BoxColor("red");
					System.out.println(boxColor1.toString());


					Box box3 = new BoxColor();
				  System.out.println(box3.toString());

			}
}
