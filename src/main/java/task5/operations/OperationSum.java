package task5.operations;

/**
 * Created by Maria on 19.12.2017.
 */
public class OperationSum extends Operation {
			@Override
			public String getSign() {
				return OperationsEnum.Сумма.getValue();
			}

			@Override
			public String getName() {
				return OperationsEnum.Сумма.name();
			}

			@Override
			public double getResult(double a, double b) {
				return a + b;
			}

			int getResult(int a, int b) {
				return a+b;
			}
}
