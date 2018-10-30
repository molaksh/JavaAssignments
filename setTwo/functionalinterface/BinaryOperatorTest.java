package functionalinterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
	public static void main(String[] args) {
		BinaryOperator<Double> divider = (a, b)-> a/b;
		
		System.out.println(divider.apply(30.0, 10.0));
	}

}
