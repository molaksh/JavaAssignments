package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class FunctionalInterfaceTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");

		// calling Predicate Functional Interface
		Predicate<String> p = (s) -> s.contains("Geek");

		for (String string : names) {
			if (p.test(string) == true) {
				System.out.println(string);
			}
		}
		

		int a = 5;
		//calling user defined Functional Interface
		Square s = (int x) -> x * x;

		int c = s.calculate(a);
		System.out.println("the output from the functional interface is " + c);
		
		
		
//	the below code is throwing error because we cannot create two lambda expressions within same block.	
//	//BinaryOperator Functional Interface
//	BinaryOperator<Integer> divider = (a,b)-> a/b;
	
		
		

}


}

@FunctionalInterface
interface Square {
	int calculate(int x);
}

