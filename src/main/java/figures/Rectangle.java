package figures;

/**
 * Created by m.baykova on 22.12.2017.
 * Класс прямоугольника
 */
public class Rectangle extends Figure{


    Rectangle(double a, double b) {
        super(a, b);
    }

    double area(){
        System.out.println("площадь прямоугольника = " + a*b);
        return a * b;
    }
}
