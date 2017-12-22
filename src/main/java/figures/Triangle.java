package figures;

/**
 * Created by m.baykova on 22.12.2017.
 * Класс прямоуголбного треугольника
 */
public class Triangle extends Figure{

    Triangle(double a, double b) {
        super(a, b);
    }

    double area(){
        System.out.println("площадь прямоугольного треугольника = " + a*b/2);
        return a * b/2;
    }


}
