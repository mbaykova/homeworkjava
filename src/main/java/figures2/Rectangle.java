package figures2;

/**
 * Created by m.baykova on 22.12.2017.
 * Класс прямоугольника
 */
public class Rectangle extends RectangularFigure {


    Rectangle(double a, double b) {
        super(a, b);
    }

    public double area(){
        System.out.println("площадь прямоугольника = " + a*b);
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 *(a + b);
    }

}
