package figures2;

/**
 * Created by m.baykova on 22.12.2017.
 */
public class Circle implements IFigure {

        private double r;

        Circle(double r){
            this.r = r;
        }

        @Override
        public double area() {
            return 3.14 * r;
        }

        @Override
        public double perimeter() {
            return 0;
        }
}
