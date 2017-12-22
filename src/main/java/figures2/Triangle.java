package figures2;

/**
 * Created by m.baykova on 22.12.2017.
 * Класс прямоуголбного треугольника
 */
public class Triangle extends RectangularFigure {
    double c;

    Triangle(double a, double b) {
        super(a, b);
    }

    public double area(){
        System.out.println("площадь прямоугольного треугольника = " + a*b/2);
        return a * b/2;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }


}
