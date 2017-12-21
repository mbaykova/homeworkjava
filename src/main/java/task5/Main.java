package task5;



import task5.operations.OperationSubTract;
import task5.operations.OperationSum;

/**
 * Created by Maria on 19.12.2017.
 */
public class Main {

			public static void main(String[] args){
					Calculator calculator = new Calculator();
					calculator.setFirst(10);
					calculator.setSecond(20);
					calculator.setOperation(new OperationSum());
					System.out.println(calculator.calculate());

					Calculator calculator1 = new Calculator(12.3, 14.2, new OperationSubTract());
					calculator1.printResult();

			}
}
