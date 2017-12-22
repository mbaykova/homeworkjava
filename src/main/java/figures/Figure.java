package figures;

/**
 * Created by m.baykova on 22.12.2017.
 */
public abstract class Figure {
        double a;
        double b;

        Figure(double a, double b){
            this.a = a;
            this.b = b;
        }

//        double area(){
//            System.out.println("площадь не определена");
//            return 0;
//        }

        abstract double area();

        void printArea(){
            System.out.println("площадь фигуры  = " + area());
        }
}
