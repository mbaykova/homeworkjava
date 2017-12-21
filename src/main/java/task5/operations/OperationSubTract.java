package task5.operations;

/**
 * Created by Maria on 19.12.2017.
 */
public class OperationSubTract extends Operation {
			@Override
			public String getSign() {
				return OperationsEnum.Разность.getValue();
			}

			@Override
			public String getName() {
				return OperationsEnum.Разность.name();
			}

			@Override
			public double getResult(double a, double b) {
				return a - b;
			}
}
