package figures2;

/**
 * Created by m.baykova on 22.12.2017.
 */
public abstract class RectangularFigure implements IFigure{
        double a;
        double b;

        RectangularFigure(double a, double b){
                this.a = a;
                this.b = b;
        }


        public abstract double area();

        void printArea(){
            System.out.println("площадь фигуры  = " + area());
        }
}
