package figures2;

/**
 * Created by m.baykova on 22.12.2017.
 */
public class FindArea {

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(3,5);
        rectangle.printArea();

        Triangle triangle = new Triangle(1,2);
        triangle.printArea();

        Circle circle = new Circle(2);
        System.out.println(circle.area());
    }
}
