package task5;

import task5.operations.IOperation;
import task5.operations.Operation;

/**
 * Created by Maria on 13.12.2017.
 */
public class Calculator {
			private double first;
			private double second;
			private IOperation operation;

			public Calculator(double first, double second, Operation operation){
						this.first = first;
						this.second = second;
						this.operation = operation;
			}


			public Calculator() {

			}

			public void setFirst(double first) {
						this.first = first;
					}

			public void setSecond(double second) {
				this.second = second;
			}

			public void setFirst(int first) {
				this.first = first;
			}

			public void setSecond(int second) {
				this.second = second;
			}

			public void setOperation(IOperation operation) {
				this.operation = operation;
			}


			public double calculate() {
					return operation.getResult(first, second);
			}

			public void printResult(){
				System.out.println(String.format("%.4f %s %.4f = %.4f", first, operation.getSign(), second, calculate()));
			}
}



