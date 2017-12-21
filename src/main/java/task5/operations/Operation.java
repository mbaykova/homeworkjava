package task5.operations;

/**
 * Created by Maria on 13.12.2017.
 */
public abstract class Operation implements IOperation {

				@Override
				public abstract String getSign();

				@Override
				public abstract String getName();

				@Override
				public abstract double getResult(double a, double b);

}
